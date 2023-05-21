package co.edu.uco.entities;

import java.util.Date;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;


public final class PlanPublicacionEntity {

	private static final PlanPublicacionEntity DEFUALT_OBJECT = new PlanPublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private float precio;
	private Date fechaDesde;
	private Date fechaFin;
	
	
	
	public PlanPublicacionEntity(UUID identificador, PublicacionEntity publicacion, float precio, Date fechaDesde,
			Date fechaFin) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaFin(fechaFin);
	}




	public PlanPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDesde(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
	}


	
	

	public static final PlanPublicacionEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}




	private final void setPublicacion(PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
		
	}




	public final float getPrecio() {
		return precio;
	}




	private final void setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultValueFloat(precio);
		
	}




	public final Date getFechaDesde() {
		return fechaDesde;
	}




	private final void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = UtilDateTime.getDefaultDate(fechaDesde);
		
	}




	public final Date getFechaFin() {
		return fechaFin;
	}




	private final void setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		
	}
	
	
	
	
	
}
