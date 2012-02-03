package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_elementGroupxsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_elementGroupxsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_18 = new TagInfo("c:get", //$NON-NLS-1$
            1, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$modelGroup/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_1_62 = new TagInfo("c:get", //$NON-NLS-1$
            1, 62,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$modelGroup/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_6 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 6,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$modelGroup/modelGroup/particles", //$NON-NLS-1$
                "element", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_4_7 = new TagInfo("c:choose", //$NON-NLS-1$
            4, 7,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_5_8 = new TagInfo("c:when", //$NON-NLS-1$
            5, 8,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$element/@maxOccurs = '-1'", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_28 = new TagInfo("c:get", //$NON-NLS-1$
            6, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_87 = new TagInfo("c:get", //$NON-NLS-1$
            6, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/typeDefinition/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_166 = new TagInfo("c:get", //$NON-NLS-1$
            6, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@minOccurs", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_8_8 = new TagInfo("c:otherwise", //$NON-NLS-1$
            8, 8,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_9_28 = new TagInfo("c:get", //$NON-NLS-1$
            9, 28,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_87 = new TagInfo("c:get", //$NON-NLS-1$
            9, 87,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/typeDefinition/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_166 = new TagInfo("c:get", //$NON-NLS-1$
            9, 166,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@minOccurs", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_216 = new TagInfo("c:get", //$NON-NLS-1$
            9, 216,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@maxOccurs", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t\t<xsd:group id=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_18.setRuntimeParent(null);
        _jettag_c_get_1_18.setTagInfo(_td_c_get_1_18);
        _jettag_c_get_1_18.doStart(context, out);
        _jettag_c_get_1_18.doEnd();
        out.write("\" name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_62 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_62); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_62.setRuntimeParent(null);
        _jettag_c_get_1_62.setTagInfo(_td_c_get_1_62);
        _jettag_c_get_1_62.doStart(context, out);
        _jettag_c_get_1_62.doEnd();
        out.write("\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t  <xsd:sequence>");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_6); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_6.setRuntimeParent(null);
        _jettag_c_iterate_3_6.setTagInfo(_td_c_iterate_3_6);
        _jettag_c_iterate_3_6.doStart(context, out);
        while (_jettag_c_iterate_3_6.okToProcessBody()) {
            RuntimeTagElement _jettag_c_choose_4_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_4_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_4_7.setRuntimeParent(_jettag_c_iterate_3_6);
            _jettag_c_choose_4_7.setTagInfo(_td_c_choose_4_7);
            _jettag_c_choose_4_7.doStart(context, out);
            JET2Writer _jettag_c_choose_4_7_saved_out = out;
            while (_jettag_c_choose_4_7.okToProcessBody()) {
                out = out.newNestedContentWriter();
                RuntimeTagElement _jettag_c_when_5_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_5_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_5_8.setRuntimeParent(_jettag_c_choose_4_7);
                _jettag_c_when_5_8.setTagInfo(_td_c_when_5_8);
                _jettag_c_when_5_8.doStart(context, out);
                JET2Writer _jettag_c_when_5_8_saved_out = out;
                while (_jettag_c_when_5_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t  \t\t\t\t<xsd:element name=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_28.setRuntimeParent(_jettag_c_when_5_8);
                    _jettag_c_get_6_28.setTagInfo(_td_c_get_6_28);
                    _jettag_c_get_6_28.doStart(context, out);
                    _jettag_c_get_6_28.doEnd();
                    out.write("\" type=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_87); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_87.setRuntimeParent(_jettag_c_when_5_8);
                    _jettag_c_get_6_87.setTagInfo(_td_c_get_6_87);
                    _jettag_c_get_6_87.doStart(context, out);
                    _jettag_c_get_6_87.doEnd();
                    out.write("\" minOccurs=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_166.setRuntimeParent(_jettag_c_when_5_8);
                    _jettag_c_get_6_166.setTagInfo(_td_c_get_6_166);
                    _jettag_c_get_6_166.doStart(context, out);
                    _jettag_c_get_6_166.doEnd();
                    out.write("\" maxOccurs=\"unbounded\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_when_5_8.handleBodyContent(out);
                }
                out = _jettag_c_when_5_8_saved_out;
                _jettag_c_when_5_8.doEnd();
                RuntimeTagElement _jettag_c_otherwise_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_8_8); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_otherwise_8_8.setRuntimeParent(_jettag_c_choose_4_7);
                _jettag_c_otherwise_8_8.setTagInfo(_td_c_otherwise_8_8);
                _jettag_c_otherwise_8_8.doStart(context, out);
                JET2Writer _jettag_c_otherwise_8_8_saved_out = out;
                while (_jettag_c_otherwise_8_8.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("\t\t  \t\t\t\t<xsd:element name=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_28 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_28); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_28.setRuntimeParent(_jettag_c_otherwise_8_8);
                    _jettag_c_get_9_28.setTagInfo(_td_c_get_9_28);
                    _jettag_c_get_9_28.doStart(context, out);
                    _jettag_c_get_9_28.doEnd();
                    out.write("\" type=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_87 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_87); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_87.setRuntimeParent(_jettag_c_otherwise_8_8);
                    _jettag_c_get_9_87.setTagInfo(_td_c_get_9_87);
                    _jettag_c_get_9_87.doStart(context, out);
                    _jettag_c_get_9_87.doEnd();
                    out.write("\" minOccurs=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_166 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_166); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_166.setRuntimeParent(_jettag_c_otherwise_8_8);
                    _jettag_c_get_9_166.setTagInfo(_td_c_get_9_166);
                    _jettag_c_get_9_166.doStart(context, out);
                    _jettag_c_get_9_166.doEnd();
                    out.write("\" maxOccurs=\"");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_9_216 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_216); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_9_216.setRuntimeParent(_jettag_c_otherwise_8_8);
                    _jettag_c_get_9_216.setTagInfo(_td_c_get_9_216);
                    _jettag_c_get_9_216.doStart(context, out);
                    _jettag_c_get_9_216.doEnd();
                    out.write("\"/>");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_otherwise_8_8.handleBodyContent(out);
                }
                out = _jettag_c_otherwise_8_8_saved_out;
                _jettag_c_otherwise_8_8.doEnd();
                _jettag_c_choose_4_7.handleBodyContent(out);
            }
            out = _jettag_c_choose_4_7_saved_out;
            _jettag_c_choose_4_7.doEnd();
            _jettag_c_iterate_3_6.handleBodyContent(out);
        }
        _jettag_c_iterate_3_6.doEnd();
        out.write("\t\t  </xsd:sequence>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</xsd:group>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
    }
}
