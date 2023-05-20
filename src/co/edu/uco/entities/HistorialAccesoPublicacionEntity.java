package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionEntity {

	private static final HistorialAccesoPublicacionEntity DEFAULT_OBJECT = new HistorialAccesoPublicacionEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	
	
	
	
	public HistorialAccesoPublicacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
	}




	public HistorialAccesoPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
	}

	
	
	
	
	
	public static final HistorialAccesoPublicacionEntity getDefaultObject() {
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
	
	
	
	
	
}
