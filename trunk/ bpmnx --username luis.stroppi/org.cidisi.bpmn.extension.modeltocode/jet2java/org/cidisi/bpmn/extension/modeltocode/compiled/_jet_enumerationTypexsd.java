package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_enumerationTypexsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_enumerationTypexsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_24 = new TagInfo("c:get", //$NON-NLS-1$
            1, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$enumerationType/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_5 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$enumerationType/values", //$NON-NLS-1$
                "value", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_31 = new TagInfo("c:get", //$NON-NLS-1$
            4, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$value/@value", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t<xsd:simpleType name=\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_24.setRuntimeParent(null);
        _jettag_c_get_1_24.setTagInfo(_td_c_get_1_24);
        _jettag_c_get_1_24.doStart(context, out);
        _jettag_c_get_1_24.doEnd();
        out.write("\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t  <xsd:restriction base=\"xsd:string\">");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_5); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_5.setRuntimeParent(null);
        _jettag_c_iterate_3_5.setTagInfo(_td_c_iterate_3_5);
        _jettag_c_iterate_3_5.doStart(context, out);
        while (_jettag_c_iterate_3_5.okToProcessBody()) {
            out.write("\t    \t<xsd:enumeration value=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_4_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_31); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_4_31.setRuntimeParent(_jettag_c_iterate_3_5);
            _jettag_c_get_4_31.setTagInfo(_td_c_get_4_31);
            _jettag_c_get_4_31.doStart(context, out);
            _jettag_c_get_4_31.doEnd();
            out.write("\" />");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_3_5.handleBodyContent(out);
        }
        _jettag_c_iterate_3_5.doEnd();
        out.write("\t  </xsd:restriction>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</xsd:simpleType>");  //$NON-NLS-1$        
    }
}
