
package iot_DataView.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;

import iot_DataView.figures.activator.PluginActivator;


/**
 * @generated
 */
public class TextFileFigure extends ImageFigure {

	
	/**
	 * @generated
	 */
	public TextFileFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/txt.png").createImage(), 0);
		this.setPreferredSize(new Dimension(48, 48));
	}
}
