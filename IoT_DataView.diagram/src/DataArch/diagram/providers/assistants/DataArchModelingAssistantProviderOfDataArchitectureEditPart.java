/*
 * 
 */
package DataArch.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataArchModelingAssistantProviderOfDataArchitectureEditPart
		extends DataArch.diagram.providers.DataArchModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataArch.diagram.providers.DataArchElementTypes.DataNode_2001);
		return types;
	}

}
