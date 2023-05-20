package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CalificacionEntity {

	private static final CalificacionEntity DEFAULT_OBJECT = new CalificacionEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private Date fechaCalificacion;
	
	
	
	public CalificacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, Date fechaCalificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
	}



	private CalificacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setFechaCalificacion(UtilDateTime.getDefaultValueDate());
	}


	 

	public static final CalificacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}



	public final LectorEntity getLector() {
		return lector;
	}



	private final void setLector(LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}



	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}



	private final void setPublicacion(PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}



	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}



	private final void setFechaCalificacion(Date fechaCalificacion) {
		this.fechaCalificacion = UtilDateTime.getDefaultDate(fechaCalificacion);
	}

	
	
	
	
}
