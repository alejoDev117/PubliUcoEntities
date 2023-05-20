package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PerfilEntity {

	private static final PerfilEntity DEFAULT_OBJECT = new PerfilEntity();
	private UUID identificador;
	private LectorEntity lector;
	private boolean enviarCorreoRecomendacionesCategoria;
	private boolean enviarCorreoRecomendacionesAutor;
	
	
	
	public PerfilEntity(UUID identificador ,LectorEntity lector, boolean enviarCorreoRecomendacionesCategoria,
			boolean enviarCorreoRecomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setEnviarCorreoRecomendacionesCategoria(enviarCorreoRecomendacionesCategoria);
		setEnviarCorreoRecomendacionesAutor(enviarCorreoRecomendacionesAutor);
	}



	private PerfilEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorEntity.getDefaultObject());
		setEnviarCorreoRecomendacionesCategoria(UtilBoolean.getDefaultValue());
		setEnviarCorreoRecomendacionesAutor(UtilBoolean.getDefaultValue());
	}

	
		

	public static final PerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final LectorEntity getLector() {
		return lector;
	}



	private final void setLector(LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());

		
	}



	public final boolean isEnviarCorreoRecomendacionesCategoria() {
		return enviarCorreoRecomendacionesCategoria;
	}



	private final void setEnviarCorreoRecomendacionesCategoria(boolean enviarCorreoRecomendacionesCategoria) {
		this.enviarCorreoRecomendacionesCategoria = UtilBoolean.getDefault(enviarCorreoRecomendacionesCategoria);
	}



	public final boolean isEnviarCorreoRecomendacionesAutor() {
		return enviarCorreoRecomendacionesAutor;
	}



	private final void setEnviarCorreoRecomendacionesAutor(boolean enviarCorreoRecomendacionesAutor) {
		this.enviarCorreoRecomendacionesAutor = UtilBoolean.getDefault(enviarCorreoRecomendacionesAutor);

	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	
	
	
	
	
}
