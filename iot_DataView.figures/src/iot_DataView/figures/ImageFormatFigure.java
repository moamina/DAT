
package iot_DataView.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;

import iot_DataView.figures.activator.PluginActivator;


/**
 * @generated
 */
public class ImageFormatFigure extends ImageFigure {

	
	/**
	 * @generated
	 */
	public ImageFormatFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/image.jpg").createImage(), 0);
		this.setPreferredSize(new Dimension(48, 48));
	}
}
