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
public class DataArchModelingAssistantProviderOfDataNodeEditPart
		extends DataArch.diagram.providers.DataArchModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DataArch.diagram.providers.DataArchElementTypes.InMessagePort_3058);
		types.add(DataArch.diagram.providers.DataArchElementTypes.OutMessagePort_3059);
		return types;
	}

}
