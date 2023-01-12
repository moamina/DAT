/*
 * 
 */
package DataArch.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataArchModelingAssistantProviderOfInMessagePortEditPart
		extends DataArch.diagram.providers.DataArchModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataArch.diagram.edit.parts.InMessagePortEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataArch.diagram.edit.parts.InMessagePortEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DataArch.diagram.providers.DataArchElementTypes.Connection_4002);
		types.add(DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataArch.diagram.edit.parts.InMessagePortEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataArch.diagram.edit.parts.InMessagePortEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.Connection_4002) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3063);
		} else if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.ReceiveData_3055);
		}
		return types;
	}

}
