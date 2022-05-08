/*
 * 
 */
package DataArch.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		DataArch.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		DataArch.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		DataArch.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		DataArch.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		DataArch.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
