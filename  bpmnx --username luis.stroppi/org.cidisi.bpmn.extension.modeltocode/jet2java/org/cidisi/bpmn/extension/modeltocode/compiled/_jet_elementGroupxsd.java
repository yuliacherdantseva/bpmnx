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
    private static final TagInfo _td_c_get_4_26 = new TagInfo("c:get", //$NON-NLS-1$
            4, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_85 = new TagInfo("c:get", //$NON-NLS-1$
            4, 85,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/elementDeclaration/typeDefinition/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_164 = new TagInfo("c:get", //$NON-NLS-1$
            4, 164,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$element/@minOccurs", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_214 = new TagInfo("c:get", //$NON-NLS-1$
            4, 214,
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
            out.write("\t\t  \t\t<xsd:element name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_26.setRuntimeParent(_jettag_c_iterate_3_6);
            _jettag_c_get_4_26.setTagInfo(_td_c_get_4_26);
            _jettag_c_get_4_26.doStart(context, out);
            _jettag_c_get_4_26.doEnd();
            out.write("\" type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_85 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_85); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_85.setRuntimeParent(_jettag_c_iterate_3_6);
            _jettag_c_get_4_85.setTagInfo(_td_c_get_4_85);
            _jettag_c_get_4_85.doStart(context, out);
            _jettag_c_get_4_85.doEnd();
            out.write("\" minOccurs=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_164 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_164); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_164.setRuntimeParent(_jettag_c_iterate_3_6);
            _jettag_c_get_4_164.setTagInfo(_td_c_get_4_164);
            _jettag_c_get_4_164.doStart(context, out);
            _jettag_c_get_4_164.doEnd();
            out.write("\" maxOccurs=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_214 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_214); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_214.setRuntimeParent(_jettag_c_iterate_3_6);
            _jettag_c_get_4_214.setTagInfo(_td_c_get_4_214);
            _jettag_c_get_4_214.doStart(context, out);
            _jettag_c_get_4_214.doEnd();
            out.write("\"/>");  //$NON-NLS-1$        
            out.write(NL);         
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
