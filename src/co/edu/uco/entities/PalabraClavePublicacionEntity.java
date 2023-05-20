package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PalabraClavePublicacionEntity {

	private final static PalabraClavePublicacionEntity DEFUALT_OBJECT = new PalabraClavePublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private String palabraClave;
	
	
	
	
	public PalabraClavePublicacionEntity(UUID identificador, PublicacionEntity publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}




	private PalabraClavePublicacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setPalabraClave(UtilText.getUtilText().getDefaultValue());
	}



	
	


	public static final PalabraClavePublicacionEntity getDefualtObject() {
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




	public final String getPalabraClave() {
		return palabraClave;
	}




	private final void setPalabraClave(String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
		
	}
	
	
	
	
	
	
}
