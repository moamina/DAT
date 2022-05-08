/*
 * 
 */
package DataArch.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DataArch.Connection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof DataArch.OutMessagePort && newEnd instanceof DataArch.OutMessagePort)) {
			return false;
		}
		DataArch.InMessagePort target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DataArch.DataArchitecture)) {
			return false;
		}
		DataArch.DataArchitecture container = (DataArch.DataArchitecture) getLink().eContainer();
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4002(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataArch.InMessagePort && newEnd instanceof DataArch.InMessagePort)) {
			return false;
		}
		DataArch.OutMessagePort source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DataArch.DataArchitecture)) {
			return false;
		}
		DataArch.DataArchitecture container = (DataArch.DataArchitecture) getLink().eContainer();
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4002(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected DataArch.Connection getLink() {
		return (DataArch.Connection) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected DataArch.OutMessagePort getOldSource() {
		return (DataArch.OutMessagePort) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.OutMessagePort getNewSource() {
		return (DataArch.OutMessagePort) newEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.InMessagePort getOldTarget() {
		return (DataArch.InMessagePort) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.InMessagePort getNewTarget() {
		return (DataArch.InMessagePort) newEnd;
	}
}
