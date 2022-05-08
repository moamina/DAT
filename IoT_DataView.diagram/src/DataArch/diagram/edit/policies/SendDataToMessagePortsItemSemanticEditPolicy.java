/*
* 
*/
package DataArch.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class SendDataToMessagePortsItemSemanticEditPolicy
		extends DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SendDataToMessagePortsItemSemanticEditPolicy() {
		super(DataArch.diagram.providers.DataArchElementTypes.SendDataToMessagePorts_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
