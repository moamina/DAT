/*
 * 
 */
package DataArch.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataArchModelingAssistantProviderOfOutMessagePortEditPart
		extends DataArch.diagram.providers.DataArchModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataArch.diagram.edit.parts.OutMessagePortEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataArch.diagram.edit.parts.OutMessagePortEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataArch.diagram.providers.DataArchElementTypes.Connection_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataArch.diagram.edit.parts.OutMessagePortEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataArch.diagram.edit.parts.OutMessagePortEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataArch.diagram.edit.parts.InMessagePortEditPart) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.Connection_4002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataArch.diagram.edit.parts.OutMessagePortEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataArch.diagram.edit.parts.OutMessagePortEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.Connection_4002) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3058);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataArch.diagram.edit.parts.OutMessagePortEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataArch.diagram.edit.parts.OutMessagePortEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataArch.diagram.edit.parts.OutMessagePortEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataArch.diagram.edit.parts.OutMessagePortEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004) {
			types.add(DataArch.diagram.providers.DataArchElementTypes.SendData_3054);
		}
		return types;
	}

}
