package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final  class PreferenciaEscritorEntity {

	private static final PreferenciaEscritorEntity DEFAULT_OBJECT = new PreferenciaEscritorEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private EscritorEntity escritor;
	
	
	
	
	public PreferenciaEscritorEntity(UUID identificador, PerfilEntity perfil, EscritorEntity escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}




	private PreferenciaEscritorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilEntity.getDefaultObject());
		setEscritor(EscritorEntity.getDefaultObject());
	}


	
	
	
	
	

	public static final PreferenciaEscritorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final PerfilEntity getPerfil() {
		return perfil;
	}




	private final void setPerfil(PerfilEntity perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
		
	}




	public final EscritorEntity getEscritor() {
		return escritor;
	}




	private final void setEscritor(EscritorEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
		
	}
	
	
	
	
}
