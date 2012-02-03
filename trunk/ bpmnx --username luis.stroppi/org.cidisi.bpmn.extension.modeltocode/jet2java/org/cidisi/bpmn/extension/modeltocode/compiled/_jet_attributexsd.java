package org.cidisi.bpmn.extension.modeltocode.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_attributexsd implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_attributexsd() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_iterate_1_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            1, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$attributeUses", //$NON-NLS-1$
                "a", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_26 = new TagInfo("c:get", //$NON-NLS-1$
            2, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$a/attributeDeclaration/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_82 = new TagInfo("c:get", //$NON-NLS-1$
            2, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$a/attributeDeclaration/typeDefinition/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_2_147 = new TagInfo("c:choose", //$NON-NLS-1$
            2, 147,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_3_6 = new TagInfo("c:when", //$NON-NLS-1$
            3, 6,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$a/required", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_iterate_1_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_1_4); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_1_4.setRuntimeParent(null);
        _jettag_c_iterate_1_4.setTagInfo(_td_c_iterate_1_4);
        _jettag_c_iterate_1_4.doStart(context, out);
        while (_jettag_c_iterate_1_4.okToProcessBody()) {
            out.write(NL);         
            out.write("\t\t\t\t<xsd:attribute name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_2_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_26); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_26.setRuntimeParent(_jettag_c_iterate_1_4);
            _jettag_c_get_2_26.setTagInfo(_td_c_get_2_26);
            _jettag_c_get_2_26.doStart(context, out);
            _jettag_c_get_2_26.doEnd();
            out.write("\" type=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_2_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_82); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_2_82.setRuntimeParent(_jettag_c_iterate_1_4);
            _jettag_c_get_2_82.setTagInfo(_td_c_get_2_82);
            _jettag_c_get_2_82.doStart(context, out);
            _jettag_c_get_2_82.doEnd();
            out.write("\" ");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_choose_2_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_2_147); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_choose_2_147.setRuntimeParent(_jettag_c_iterate_1_4);
            _jettag_c_choose_2_147.setTagInfo(_td_c_choose_2_147);
            _jettag_c_choose_2_147.doStart(context, out);
            JET2Writer _jettag_c_choose_2_147_saved_out = out;
            while (_jettag_c_choose_2_147.okToProcessBody()) {
                out = out.newNestedContentWriter();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_when_3_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_3_6); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_when_3_6.setRuntimeParent(_jettag_c_choose_2_147);
                _jettag_c_when_3_6.setTagInfo(_td_c_when_3_6);
                _jettag_c_when_3_6.doStart(context, out);
                JET2Writer _jettag_c_when_3_6_saved_out = out;
                while (_jettag_c_when_3_6.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    out.write("use=\"required\"");  //$NON-NLS-1$        
                    _jettag_c_when_3_6.handleBodyContent(out);
                }
                out = _jettag_c_when_3_6_saved_out;
                _jettag_c_when_3_6.doEnd();
                out.write(NL);         
                out.write("\t\t\t\t\t");  //$NON-NLS-1$        
                _jettag_c_choose_2_147.handleBodyContent(out);
            }
            out = _jettag_c_choose_2_147_saved_out;
            _jettag_c_choose_2_147.doEnd();
            out.write("/>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_1_4.handleBodyContent(out);
        }
        _jettag_c_iterate_1_4.doEnd();
        out.write(NL);         
    }
}
