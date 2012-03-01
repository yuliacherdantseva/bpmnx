package org.cidisi.bpmn.extensions.samples.test;

import java.io.StringWriter;

import org.cidisi.bpmn.extensions.utils.*;

import org.omg.spec.bpmn._20100524.model.*;
import org.cidisi.bpmn.extensions.samples.workdistribution.binding.WorkDistributionBinding;
import org.cidisi.bpmn.extensions.samples.workdistribution.AgentType;
import org.cidisi.bpmn.extensions.samples.workdistribution.TaskPrivilege;

public class ExtensionTest {
	
	private ObjectFactory bf;
	private org.cidisi.bpmn.extensions.samples.workdistribution.ObjectFactory extf;
	private ExtendedDefinition extendedDefinition;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtensionTest et = new ExtensionTest();
		
		et.makeDefinitions();
		
		et.print();
		
	}
	
	public ExtensionTest(){
		this.bf 				= new ObjectFactory();
		this.extf 				= new org.cidisi.bpmn.extensions.samples.workdistribution.ObjectFactory();
		this.extendedDefinition = new ExtendedDefinition();
	}

	public void makeDefinitions(){
		
		this.extendedDefinition.setProcess("Test Process");
		
		this.extendedDefinition.importExtension(WorkDistributionBinding.class.getPackage(), "workDistribution.xsd");
		
		TUserTask	  task		    = bf.createTUserTask();
		task.setName("Task 1");
		
		
		WorkDistributionBinding wdb = this.createWorkDistribution();
		this.extendedDefinition.extend(task, wdb);
		
		
		this.extendedDefinition.addFlowNode(bf.createStartEvent(bf.createTStartEvent()));
		this.extendedDefinition.addFlowNode(bf.createUserTask(task));
		this.extendedDefinition.addFlowNode(bf.createEndEvent(bf.createTEndEvent()));
		
		
    }

	public WorkDistributionBinding createWorkDistribution(){
		WorkDistributionBinding wd = new WorkDistributionBinding();
		
		wd.setDistributionAgent(AgentType.SYSTEM);
		
		TaskPrivilege tp = extf.createTaskPrivilege();
		
		tp.setName("select");
		tp.setGranted(true);
		
		wd.getTaskPrivileges().add(tp);
		
		return wd;
	}
	
	public void print(){
		StringWriter sw = this.extendedDefinition.marshal();
		
		System.out.print(sw.toString());
	}
	
	
	
}
