
package iot_DataView.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class QuantitativeFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureQuantitativeLabelFigure;

	/**
	 * @generated
	 */
	public QuantitativeFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setPreferredSize(new Dimension(48, 48));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureQuantitativeLabelFigure = new WrappingLabel();

		fFigureQuantitativeLabelFigure.setText("Quantitative");

		this.add(fFigureQuantitativeLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureQuantitativeLabelFigure() {
		return fFigureQuantitativeLabelFigure;
	}

}
