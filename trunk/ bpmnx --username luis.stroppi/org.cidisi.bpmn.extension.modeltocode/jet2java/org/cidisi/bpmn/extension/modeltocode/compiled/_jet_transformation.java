package org.cidisi.bpmn.extension.modeltocode.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(20);
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
        pathToTemplateOrdinalMap.put("templates/extensionBinding.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/extensionDefinitionBinding.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/sequence.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/simpleXsdToCode.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/templates/attribute.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/templates/complexType.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/templates/dump.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/templates/elementGroup.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/templates/enumerationType.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/templates/extensionBinding.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/templates/extensionDefinitionBinding.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/templates/main.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/templates/sequence.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/templates/simpleXsdToCode.xsd.jet", //$NON-NLS-1$
                Integer.valueOf(19));
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
            case 5: // templates/extensionBinding.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_extensionBindingxsd();
            case 6: // templates/extensionDefinitionBinding.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_extensionDefinitionBindingxsd();
            case 7: // templates/main.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_main();
            case 8: // templates/sequence.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_sequencexsd();
            case 9: // templates/simpleXsdToCode.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_simpleXsdToCodexsd();
            case 10: // templates/templates/attribute.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_attributexsd_0();
            case 11: // templates/templates/complexType.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_complexTypexsd_0();
            case 12: // templates/templates/dump.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_dump_0();
            case 13: // templates/templates/elementGroup.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_elementGroupxsd_0();
            case 14: // templates/templates/enumerationType.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_enumerationTypexsd_0();
            case 15: // templates/templates/extensionBinding.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_extensionBindingxsd_0();
            case 16: // templates/templates/extensionDefinitionBinding.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_extensionDefinitionBindingxsd_0();
            case 17: // templates/templates/main.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_main_0();
            case 18: // templates/templates/sequence.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_sequencexsd_0();
            case 19: // templates/templates/simpleXsdToCode.xsd.jet
                return new org.cidisi.bpmn.extension.modeltocode.compiled._jet_simpleXsdToCodexsd_0();
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
