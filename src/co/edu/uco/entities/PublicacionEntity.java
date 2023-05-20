package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PublicacionEntity {

	private static final PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private TipoAccesoEntity tipoAccceso;
	private Date fechaPublicacion;
	
	
	
	
	public PublicacionEntity(UUID identificador, CategoriaEntity categoria, TipoAccesoEntity tipoAccceso,
			Date fechaPublicacion) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAccceso(tipoAccceso);
		setFechaPublicacion(fechaPublicacion);
	}




	public PublicacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaEntity.getDefaultObject());
		setTipoAccceso(TipoAccesoEntity.getDefaultObject());
		setFechaPublicacion(UtilDateTime.getDefaultValueDate());
	}

	
	



	public static final PublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final CategoriaEntity getCategoria() {
		return categoria;
	}




	private final void setCategoria(CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
		
	}




	public final TipoAccesoEntity getTipoAccceso() {
		return tipoAccceso;
	}




	private final void setTipoAccceso(TipoAccesoEntity tipoAccceso) {
		this.tipoAccceso = UtilObject.getDefault(tipoAccceso, TipoAccesoEntity.getDefaultObject());
		
	}




	public final Date getFechaPublicacion() {
		return fechaPublicacion;
	}




	private final void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = UtilDateTime.getDefaultDate(fechaPublicacion);
	
	}
	
	
	
	
	
}
