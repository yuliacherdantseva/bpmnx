package org.cidisi.bpmn.extensions.utils;

import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.omg.spec.bpmn._20100524.model.*;

public class ExtendedDefinition {
	
	private ObjectFactory	factory;
	private TDefinitions 	definitions;
	private TProcess		process;
	private String			contextNamespace;
	
	public ExtendedDefinition(){
		this.factory 			= new ObjectFactory();
		
		this.definitions 		= this.factory.createTDefinitions();
		
		this.contextNamespace 	= "org.omg.spec.bpmn._20100524.model";
	}
	
	public void setProcess(String name){
		this.process = this.factory.createTProcess();
		
		this.process.setName(name);
		this.process.setId(UUID.randomUUID().toString());
		
		this.definitions.getRootElement().add(this.factory.createProcess(this.process));
	}
	
	public void importExtension(Package extension, String location){
		
		TImport		  imp   	  = this.factory.createTImport();
		String		  namespace;
		
		namespace = extension.getAnnotation(javax.xml.bind.annotation.XmlSchema.class).namespace();
		
		imp.setImportType("http://www.w3.org/2001/XMLSchema");
		imp.setLocation(location);
		imp.setNamespace(namespace.substring(0, namespace.lastIndexOf("/binding")));
		
		this.contextNamespace += ":" + extension.getName() + ":" + extension.getName().substring(0, extension.getName().lastIndexOf(".binding"));
		
		definitions.getImport().add(imp);
		
	}
	
	public void addFlowNode(JAXBElement<?extends TFlowNode> fNode){
		
		fNode.getValue().setId(UUID.randomUUID().toString());
		
		if(this.process.getFlowElement().size() == 0){
			this.process.getFlowElement().add(fNode);
			
		}else{
			TSequenceFlow seq = this.factory.createTSequenceFlow();
			seq.setId(UUID.randomUUID().toString());
			
			TFlowNode last = (TFlowNode)this.process.getFlowElement().get(this.process.getFlowElement().size()-1).getValue();
			
			last.getOutgoing().add(new QName(seq.getId()));
			
			fNode.getValue().getIncoming().add(new QName(last.getId()));
			
			this.process.getFlowElement().add(this.factory.createSequenceFlow(seq));
			
			this.process.getFlowElement().add(fNode);
			
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void extend(TBaseElement element, Object extension){
		
		Method[] methods = extension.getClass().getDeclaredMethods();
		
		if(element.getExtensionElements() == null){
			element.setExtensionElements(this.factory.createTExtensionElements());
		}
		
		for(int i=0; i<methods.length;i++){
			Method m = methods[i];
			
			if(m.getName().startsWith("get")){
				Object value;
				try {
					value = m.invoke(extension);
					String namespace;
					if(value != null){
						
						if(value.getClass().getSimpleName().endsWith("List")){
							for(int j=0; j<((List)value).size(); j++){
								Object v = ((List)value).get(j);
								namespace = v.getClass().getPackage().getAnnotation(javax.xml.bind.annotation.XmlSchema.class).namespace();
								JAXBElement jbe;
								jbe = new JAXBElement(new QName(namespace, v.getClass().getSimpleName()),(Class)v.getClass(), v);
								element.getExtensionElements().getAny().add(jbe);
							}
						}else{
							namespace = value.getClass().getPackage().getAnnotation(javax.xml.bind.annotation.XmlSchema.class).namespace();
							JAXBElement jbe;
							jbe = new JAXBElement(new QName(namespace, value.getClass().getSimpleName()),(Class)value.getClass(), value);
							element.getExtensionElements().getAny().add(jbe);
						}
					}
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public StringWriter marshal() {
        try {
        	StringWriter sw = new StringWriter();
            JAXBElement<TDefinitions> d = this.factory.createDefinitions(this.definitions);
            JAXBContext jc = JAXBContext.newInstance(this.contextNamespace);
            Marshaller m = jc.createMarshaller();
            m.marshal( d, sw );
            return sw;
        } catch( JAXBException jbe ){
            // ...
        	System.out.println(jbe.getMessage());
        	jbe.printStackTrace();
        }
        
        return null;
	}
}
