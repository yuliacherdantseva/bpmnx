package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_simpleXsdToCodexsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_simpleXsdToCodexsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_3_16 = new TagInfo("c:get", //$NON-NLS-1$
            3, 16,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "/Schema/@targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_26 = new TagInfo("c:get", //$NON-NLS-1$
            6, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "/Schema/@targetNamespace", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Schema/definitions[self::EnumerationTypeDefinition]", //$NON-NLS-1$
                "enumerationType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_12_2 = new TagInfo("c:include", //$NON-NLS-1$
            12, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/enumerationType.xsd.jet", //$NON-NLS-1$
                "enumerationType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_15_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Schema/definitions[self::ComplexTypeDefinition]", //$NON-NLS-1$
                "complexType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_16_2 = new TagInfo("c:include", //$NON-NLS-1$
            16, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/complexType.xsd.jet", //$NON-NLS-1$
                "complexType", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "/Schema/definitions[self::ModelGroupDefinition]", //$NON-NLS-1$
                "modelGroup", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_20_2 = new TagInfo("c:include", //$NON-NLS-1$
            20, 2,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/elementGroup.xsd.jet", //$NON-NLS-1$
                "modelGroup", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<xsd:schema elementFormDefault=\"qualified\" attributeFormDefault=\"unqualified\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns=\"http://");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_16 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_16); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_16.setRuntimeParent(null);
        _jettag_c_get_3_16.setTagInfo(_td_c_get_3_16);
        _jettag_c_get_3_16.doStart(context, out);
        _jettag_c_get_3_16.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\txmlns:bpmn=\"http://www.omg.org/spec/BPMN/20100524/MODEL\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\ttargetNamespace=\"http://");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_26.setRuntimeParent(null);
        _jettag_c_get_6_26.setTagInfo(_td_c_get_6_26);
        _jettag_c_get_6_26.doStart(context, out);
        _jettag_c_get_6_26.doEnd();
        out.write("\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    >");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<xsd:import namespace=\"http://www.omg.org/spec/BPMN/20100524/MODEL\" schemaLocation=\"BPMN20.xsd\"/>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_1.setRuntimeParent(null);
        _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
        _jettag_c_iterate_11_1.doStart(context, out);
        while (_jettag_c_iterate_11_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_12_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_12_2.setRuntimeParent(_jettag_c_iterate_11_1);
            _jettag_c_include_12_2.setTagInfo(_td_c_include_12_2);
            _jettag_c_include_12_2.doStart(context, out);
            _jettag_c_include_12_2.doEnd();
            _jettag_c_iterate_11_1.handleBodyContent(out);
        }
        _jettag_c_iterate_11_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_15_1.setRuntimeParent(null);
        _jettag_c_iterate_15_1.setTagInfo(_td_c_iterate_15_1);
        _jettag_c_iterate_15_1.doStart(context, out);
        while (_jettag_c_iterate_15_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_16_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_16_2.setRuntimeParent(_jettag_c_iterate_15_1);
            _jettag_c_include_16_2.setTagInfo(_td_c_include_16_2);
            _jettag_c_include_16_2.doStart(context, out);
            _jettag_c_include_16_2.doEnd();
            _jettag_c_iterate_15_1.handleBodyContent(out);
        }
        _jettag_c_iterate_15_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_19_1.setRuntimeParent(null);
        _jettag_c_iterate_19_1.setTagInfo(_td_c_iterate_19_1);
        _jettag_c_iterate_19_1.doStart(context, out);
        while (_jettag_c_iterate_19_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_include_20_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_20_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_include_20_2.setRuntimeParent(_jettag_c_iterate_19_1);
            _jettag_c_include_20_2.setTagInfo(_td_c_include_20_2);
            _jettag_c_include_20_2.doStart(context, out);
            _jettag_c_include_20_2.doEnd();
            _jettag_c_iterate_19_1.handleBodyContent(out);
        }
        _jettag_c_iterate_19_1.doEnd();
        out.write(NL);         
        out.write("</xsd:schema>");  //$NON-NLS-1$        
    }
}
