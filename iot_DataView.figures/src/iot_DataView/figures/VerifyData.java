package iot_DataView.figures;

import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.geometry.Dimension;

import iot_DataView.figures.activator.PluginActivator;

public class VerifyData extends ImageFigure {

	/**
	 * @generated
	 */
	public VerifyData() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,
				"images/dataquality.png").createImage(), 0);
		this.setPreferredSize(new Dimension(48, 48));
	}
}
