package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionRevisorEntity {

	private static final RevisionRevisorEntity  DEFUALT_OBJECT = new RevisionRevisorEntity();
	private UUID identificador;
	private RevisionEntity revision;
	private RevisorEntity revisor;
	private Date fechaAsignacionRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionEntity estado;
	
	
	
	
	
	public RevisionRevisorEntity(UUID identificador, RevisionEntity revision, RevisorEntity revisor,
			Date fechaAsignacionRevision, Date fechaCompletitudRevision, EstadoRevisionEntity estado) {
		super();
	setIdentificador(identificador);
	setRevision(revision);
	setRevisor(revisor);
	setFechaAsignacionRevision(fechaAsignacionRevision);
	setFechaCompletitudRevision(fechaCompletitudRevision);
	setEstado(estado);
	}





	private RevisionRevisorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevision(RevisionEntity.getDefaultObject());
		setRevisor(RevisorEntity.getDefaultObject());
		setFechaAsignacionRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultDate(fechaAsignacionRevision));
		setEstado(EstadoRevisionEntity.getDefaultObject());
	}

	
	

	public static final RevisionRevisorEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}





	public final UUID getIdentificador() {
		return identificador;
	}





	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}





	public final RevisionEntity getRevision() {
		return revision;
	}





	private final void setRevision(RevisionEntity revision) {
		this.revision = UtilObject.getDefault(revision, RevisionEntity.getDefaultObject());
		
	}





	public final RevisorEntity getRevisor() {
		return revisor;
	}





	private final void setRevisor(RevisorEntity revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorEntity.getDefaultObject());
		
	}





	public final Date getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}





	private final void setFechaAsignacionRevision(Date fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDateTime.getDefaultDate(fechaAsignacionRevision);
	
	}





	public final Date getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}





	private final void setFechaCompletitudRevision(Date fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDateTime.getDefaultDate(fechaCompletitudRevision);
		
	}





	public final EstadoRevisionEntity getEstado() {
		return estado;
	}





	private final void setEstado(EstadoRevisionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntity.getDefaultObject	());
		
	}

	
	
	
	
}

