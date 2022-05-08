
package iot_DataView.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;

import iot_DataView.figures.activator.PluginActivator;


/**
 * @generated
 */
public class GPSDataFigure extends ImageFigure {

	
	/**
	 * @generated
	 */
	public GPSDataFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/gps.png").createImage(), 0);
		this.setPreferredSize(new Dimension(48, 48));
	}
}
