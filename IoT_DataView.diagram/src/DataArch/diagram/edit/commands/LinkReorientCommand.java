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
public class LinkReorientCommand extends EditElementCommand {

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
	public LinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof DataArch.Link) {
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
		if (!(oldEnd instanceof DataArch.LinkableElement && newEnd instanceof DataArch.LinkableElement)) {
			return false;
		}
		DataArch.Action target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DataArch.DataNode)) {
			return false;
		}
		DataArch.DataNode container = (DataArch.DataNode) getLink().eContainer();
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLink_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof DataArch.Action && newEnd instanceof DataArch.Action)) {
			return false;
		}
		DataArch.LinkableElement source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DataArch.DataNode)) {
			return false;
		}
		DataArch.DataNode container = (DataArch.DataNode) getLink().eContainer();
		return DataArch.diagram.edit.policies.DataArchBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistLink_4001(container, getLink(), source, getNewTarget());
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
	protected DataArch.Link getLink() {
		return (DataArch.Link) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected DataArch.LinkableElement getOldSource() {
		return (DataArch.LinkableElement) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.LinkableElement getNewSource() {
		return (DataArch.LinkableElement) newEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.Action getOldTarget() {
		return (DataArch.Action) oldEnd;
	}

	/**
	* @generated
	*/
	protected DataArch.Action getNewTarget() {
		return (DataArch.Action) newEnd;
	}
}
