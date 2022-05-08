
package iot_DataView.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class DataRepresentationFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureDataRepresentationLabelFigure;

	/**
	 * @generated
	 */
	public DataRepresentationFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setPreferredSize(new Dimension(48, 48));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureDataRepresentationLabelFigure = new WrappingLabel();

		fFigureDataRepresentationLabelFigure.setText("DataRepresentation");

		this.add(fFigureDataRepresentationLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureDataRepresentationLabelFigure() {
		return fFigureDataRepresentationLabelFigure;
	}

}
