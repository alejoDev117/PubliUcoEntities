package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionEntity {
	
	
	private static final ObservacionRevisionEntity DEFUALT_OBJECT = new ObservacionRevisionEntity();
	private UUID identificador;
	private EscritorPublicacionEntity escritor;
	private ComentarioRevisorEntity comentario;
	private Date fechaReporteObservacion;
	private Date fechaRevisionObservacion;
	private EstadoObservacionRevisorEntity estado;
	private String observacion;
	
	
	
	
	
	
	public ObservacionRevisionEntity(UUID identificador, EscritorPublicacionEntity escritor, ComentarioRevisorEntity comentario,
			Date fechaReporteObservacion, Date fechaRevisionObservacion, EstadoObservacionRevisorEntity estado,
			String observacion) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setComentario(comentario);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}






	private ObservacionRevisionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setEscritor(EscritorPublicacionEntity.getDefaultObject());
		setComentario(ComentarioRevisorEntity.getDefualtObject());
		setFechaReporteObservacion(UtilDateTime.getDefaultValueDate());
		setFechaRevisionObservacion(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoObservacionRevisorEntity.getDefaultObject());
		setObservacion(UtilText.getUtilText().getDefaultValue());
	}


	
	



	public static final ObservacionRevisionEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}






	public final EscritorPublicacionEntity getEscritor() {
		return escritor;
	}






	private final void setEscritor(EscritorPublicacionEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorPublicacionEntity.getDefaultObject());
		
	}






	public final ComentarioRevisorEntity getComentario() {
		return comentario;
	}






	private final void setComentario(ComentarioRevisorEntity comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioRevisorEntity.getDefualtObject());
		
	}






	public final Date getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}






	private final void setFechaReporteObservacion(Date fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDateTime.getDefaultDate(fechaReporteObservacion);
		
	}






	public final Date getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}






	private final void setFechaRevisionObservacion(Date fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDateTime.getDefaultDate(fechaRevisionObservacion);
	
	}






	public final EstadoObservacionRevisorEntity getEstado() {
		return estado;
	}






	private final void setEstado(EstadoObservacionRevisorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorEntity.getDefaultObject());
		
	}






	public final String getObservacion() {
		return observacion;
	}






	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
		
	}
	
	
	

}
