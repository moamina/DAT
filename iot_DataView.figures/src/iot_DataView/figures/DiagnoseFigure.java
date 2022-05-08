
package iot_DataView.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;

import iot_DataView.figures.activator.PluginActivator;

/**
 * @generated
 */
public class DiagnoseFigure extends ImageFigure {

	
	/**
	 * @generated
	 */
	public DiagnoseFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/diagnose.png").createImage(), 0);
		this.setPreferredSize(new Dimension(48, 48));
	}

}
