
package iot_DataView.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class TranfromFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureTranfromLabelFigure;

	/**
	 * @generated
	 */
	public TranfromFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setPreferredSize(new Dimension(48, 48));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureTranfromLabelFigure = new WrappingLabel();

		fFigureTranfromLabelFigure.setText("Tranfrom");

		this.add(fFigureTranfromLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureTranfromLabelFigure() {
		return fFigureTranfromLabelFigure;
	}

}
