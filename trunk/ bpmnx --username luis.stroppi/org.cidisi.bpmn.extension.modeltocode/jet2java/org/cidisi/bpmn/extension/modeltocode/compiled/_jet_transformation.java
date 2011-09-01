package org.cidisi.bpmn.extension.modeltocode.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(8);
    static {
        pathToTemplateOrdinalMap.put("templates/attribute.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/complexType.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/elementGroup.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/enumerationType.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/sequence.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/simpleXsdToCode.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(7));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/attribute.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_attributexsd();
            case 1: // templates/complexType.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_complexTypexsd();
            case 2: // templates/dump.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_dump();
            case 3: // templates/elementGroup.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_elementGroupxsd();
            case 4: // templates/enumerationType.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_enumerationTypexsd();
            case 5: // templates/main.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_main();
            case 6: // templates/sequence.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_sequencexsd();
            case 7: // templates/simpleXsdToCode.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_simpleXsdToCodexsd();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
