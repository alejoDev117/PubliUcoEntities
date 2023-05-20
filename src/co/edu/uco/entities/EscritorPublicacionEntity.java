package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionEntity {

	
	private static final EscritorPublicacionEntity DEFAULT_OBJECT  = new EscritorPublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private EscritorEntity escritor;
	private TipoEscritorEntity tipoEscritor;
	
	
	
	
	
	public EscritorPublicacionEntity(UUID identificador, PublicacionEntity publicacion, EscritorEntity escritor,
			TipoEscritorEntity tipoEscritor) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setEscritor(escritor);
		setTipoEscritor(tipoEscritor);
	}





	private EscritorPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setEscritor(EscritorEntity.getDefaultObject());
		setTipoEscritor(TipoEscritorEntity.getDefaultObject());
	}





	public static final EscritorPublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
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





	public final EscritorEntity getEscritor() {
		return escritor;
	}





	private final void setEscritor(EscritorEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());

	}





	public final TipoEscritorEntity getTipoEscritor() {
		return tipoEscritor;
	}





	private final void setTipoEscritor(TipoEscritorEntity tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorEntity.getDefaultObject());
		
	}
	
	
	
	
	
	
	
}
