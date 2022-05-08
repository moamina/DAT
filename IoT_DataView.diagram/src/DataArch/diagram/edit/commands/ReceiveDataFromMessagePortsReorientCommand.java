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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ReceiveDataFromMessagePortsReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

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
	public ReceiveDataFromMessagePortsReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof DataArch.ReceiveData) {
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
		if (!(oldEnd instanceof DataArch.InMessagePort && newEnd instanceof DataArch.ReceiveData)) {
			return false;
		}
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistReceiveDataFromMessagePorts_4003(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataArch.InMessagePort && newEnd instanceof DataArch.InMessagePort)) {
			return false;
		}
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistReceiveDataFromMessagePorts_4003(getOldSource(), getNewTarget());
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
		getOldSource().getFromMessagePorts().remove(getOldTarget());
		getNewSource().getFromMessagePorts().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getFromMessagePorts().remove(getOldTarget());
		getOldSource().getFromMessagePorts().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected DataArch.ReceiveData getOldSource() {
		return (DataArch.ReceiveData) referenceOwner;
	}

	/**
	* @generated
	*/
	protected DataArch.ReceiveData getNewSource() {
		return (DataArch.ReceiveData) newEnd;
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
