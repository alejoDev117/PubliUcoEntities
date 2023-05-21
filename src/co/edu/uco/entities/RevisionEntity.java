package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionEntity {

	private static final RevisionEntity DEFAULT_OBJECT = new RevisionEntity();
	private UUID identificador;
	private VersionEntity version;
	private TipoRevisionEntity tipo;
	private  Date fechaSolicitudRevision;
	private Date fechaLimiteRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionEntity estado;
	
	
	
	
	
	
	public RevisionEntity(UUID identificador, VersionEntity version, TipoRevisionEntity tipo, Date fechaSolicitudRevision,
			Date fechaLimiteRevision, Date fechaCompletitudRevision, EstadoRevisionEntity estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipo(tipo);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}






	private RevisionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setVersion(VersionEntity.getDefaultObject());
		setTipo(TipoRevisionEntity.getDefaultObject());
		setFechaSolicitudRevision(UtilDateTime.getDefaultValueDate());
		setFechaLimiteRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoRevisionEntity.getDefaultObject());
	}
	





	public static final RevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}






	public final VersionEntity getVersion() {
		return version;
	}






	private final void setVersion(VersionEntity version) {
		this.version = UtilObject.getDefault(version, VersionEntity.getDefaultObject());
		
	}






	public final TipoRevisionEntity getTipo() {
		return tipo;
	}






	private final void setTipo(TipoRevisionEntity tipo) {
		this.tipo = UtilObject.getDefault(tipo, TipoRevisionEntity.getDefaultObject());
		
	}






	public final Date getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}






	private final void setFechaSolicitudRevision(Date fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDateTime.getDefaultDate(fechaSolicitudRevision);
	
	}






	public final Date getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}






	private final void setFechaLimiteRevision(Date fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDateTime.getDefaultDate(fechaLimiteRevision);
	
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
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntity.getDefaultObject());
		
	}

	 	
	
	
}
