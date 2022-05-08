/*
* 
*/
package DataArch.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ConnectionItemSemanticEditPolicy
		extends DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConnectionItemSemanticEditPolicy() {
		super(DataArch.diagram.providers.DataArchElementTypes.Connection_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
