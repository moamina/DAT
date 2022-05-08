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
public class ReceiveDataFromMessagePortsItemSemanticEditPolicy
		extends DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ReceiveDataFromMessagePortsItemSemanticEditPolicy() {
		super(DataArch.diagram.providers.DataArchElementTypes.ReceiveDataFromMessagePorts_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
