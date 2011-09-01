package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_complexTypexsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_complexTypexsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_setVariable_1_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            1, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$complexType/attributeUses[self::AttributeUse]", //$NON-NLS-1$
                "attributeUses", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_2_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            2, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$complexType/particles[self::Particle]", //$NON-NLS-1$
                "particles", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_25 = new TagInfo("c:get", //$NON-NLS-1$
            3, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$complexType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_74 = new TagInfo("c:get", //$NON-NLS-1$
            3, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$complexType/@isAbstract", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_4_3 = new TagInfo("c:choose", //$NON-NLS-1$
            4, 3,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_5_3 = new TagInfo("c:when", //$NON-NLS-1$
            5, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($complexType/baseTypeDefinition) = 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_6_5 = new TagInfo("c:include", //$NON-NLS-1$
            6, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/sequence.xsd.jet", //$NON-NLS-1$
                "particles", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_when_8_3 = new TagInfo("c:when", //$NON-NLS-1$
            8, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "count($complexType/baseTypeDefinition) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_29 = new TagInfo("c:get", //$NON-NLS-1$
            10, 29,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$complexType/baseTypeDefinition/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_11_9 = new TagInfo("c:include", //$NON-NLS-1$
            11, 9,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/sequence.xsd.jet", //$NON-NLS-1$
                "particles", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_include_17_3 = new TagInfo("c:include", //$NON-NLS-1$
            17, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "passVariables", //$NON-NLS-1$
            },
            new String[] {
                "templates/attribute.xsd.jet", //$NON-NLS-1$
                "attributeUses", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_setVariable_1_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_1_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_1_2.setRuntimeParent(null);
        _jettag_c_setVariable_1_2.setTagInfo(_td_c_setVariable_1_2);
        _jettag_c_setVariable_1_2.doStart(context, out);
        _jettag_c_setVariable_1_2.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_c_setVariable_2_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_2_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_setVariable_2_2.setRuntimeParent(null);
        _jettag_c_setVariable_2_2.setTagInfo(_td_c_setVariable_2_2);
        _jettag_c_setVariable_2_2.doStart(context, out);
        _jettag_c_setVariable_2_2.doEnd();
        out.write("\t<xsd:complexType name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_25.setRuntimeParent(null);
        _jettag_c_get_3_25.setTagInfo(_td_c_get_3_25);
        _jettag_c_get_3_25.doStart(context, out);
        _jettag_c_get_3_25.doEnd();
        out.write("\" abstract=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_3_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_74); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_3_74.setRuntimeParent(null);
        _jettag_c_get_3_74.setTagInfo(_td_c_get_3_74);
        _jettag_c_get_3_74.doStart(context, out);
        _jettag_c_get_3_74.doEnd();
        out.write("\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_choose_4_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_4_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_choose_4_3.setRuntimeParent(null);
        _jettag_c_choose_4_3.setTagInfo(_td_c_choose_4_3);
        _jettag_c_choose_4_3.doStart(context, out);
        JET2Writer _jettag_c_choose_4_3_saved_out = out;
        while (_jettag_c_choose_4_3.okToProcessBody()) {
            out = out.newNestedContentWriter();
            RuntimeTagElement _jettag_c_when_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_5_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_5_3.setRuntimeParent(_jettag_c_choose_4_3);
            _jettag_c_when_5_3.setTagInfo(_td_c_when_5_3);
            _jettag_c_when_5_3.doStart(context, out);
            JET2Writer _jettag_c_when_5_3_saved_out = out;
            while (_jettag_c_when_5_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_include_6_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_6_5); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_6_5.setRuntimeParent(_jettag_c_when_5_3);
                _jettag_c_include_6_5.setTagInfo(_td_c_include_6_5);
                _jettag_c_include_6_5.doStart(context, out);
                _jettag_c_include_6_5.doEnd();
                _jettag_c_when_5_3.handleBodyContent(out);
            }
            out = _jettag_c_when_5_3_saved_out;
            _jettag_c_when_5_3.doEnd();
            RuntimeTagElement _jettag_c_when_8_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_8_3); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_when_8_3.setRuntimeParent(_jettag_c_choose_4_3);
            _jettag_c_when_8_3.setTagInfo(_td_c_when_8_3);
            _jettag_c_when_8_3.doStart(context, out);
            JET2Writer _jettag_c_when_8_3_saved_out = out;
            while (_jettag_c_when_8_3.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t\t\t<xsd:complexContent>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("    \t\t\t<xsd:extension base=\"");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_10_29 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_29); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_10_29.setRuntimeParent(_jettag_c_when_8_3);
                _jettag_c_get_10_29.setTagInfo(_td_c_get_10_29);
                _jettag_c_get_10_29.doStart(context, out);
                _jettag_c_get_10_29.doEnd();
                out.write("\">");  //$NON-NLS-1$        
                out.write(NL);         
                RuntimeTagElement _jettag_c_include_11_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_11_9); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_include_11_9.setRuntimeParent(_jettag_c_when_8_3);
                _jettag_c_include_11_9.setTagInfo(_td_c_include_11_9);
                _jettag_c_include_11_9.doStart(context, out);
                _jettag_c_include_11_9.doEnd();
                out.write("    \t\t\t</xsd:extension>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t</xsd:complexContent>");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_when_8_3.handleBodyContent(out);
            }
            out = _jettag_c_when_8_3_saved_out;
            _jettag_c_when_8_3.doEnd();
            _jettag_c_choose_4_3.handleBodyContent(out);
        }
        out = _jettag_c_choose_4_3_saved_out;
        _jettag_c_choose_4_3.doEnd();
        RuntimeTagElement _jettag_c_include_17_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_17_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_17_3.setRuntimeParent(null);
        _jettag_c_include_17_3.setTagInfo(_td_c_include_17_3);
        _jettag_c_include_17_3.doStart(context, out);
        _jettag_c_include_17_3.doEnd();
        out.write("\t</xsd:complexType>");  //$NON-NLS-1$        
    }
}
