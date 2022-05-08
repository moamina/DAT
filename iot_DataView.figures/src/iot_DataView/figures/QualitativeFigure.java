
package iot_DataView.figures;

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

/**
 * @generated
 */
public class QualitativeFigure extends RoundedRectangle {

	/**
	 * @generated
	 */
	private WrappingLabel fFigureQualitativeLabelFigure;

	/**
	 * @generated
	 */
	public QualitativeFigure() {
		this.setCornerDimensions(new Dimension(8, 8));
		this.setPreferredSize(new Dimension(48, 48));
		this.setBorder(new MarginBorder(5, 5, 5, 5));
		createContents();
	}

	/**
	 * @generated
	 */
	private void createContents() {

		fFigureQualitativeLabelFigure = new WrappingLabel();

		fFigureQualitativeLabelFigure.setText("Qualitative");

		this.add(fFigureQualitativeLabelFigure);

	}

	/**
	 * @generated
	 */
	public WrappingLabel getFigureQualitativeLabelFigure() {
		return fFigureQualitativeLabelFigure;
	}

}
