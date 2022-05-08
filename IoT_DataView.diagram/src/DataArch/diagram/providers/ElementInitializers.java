/*
 * 
 */
package DataArch.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			DataArch.diagram.part.DataArchDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
