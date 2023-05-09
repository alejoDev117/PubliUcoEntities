package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;

public final class TipoRelacionInstitucionEntity {
	private static final TipoRelacionInstitucionEntity DEFAULT_OBJECT = new TipoRelacionInstitucionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionEntity estadoTipoRelacionInstitucion;
	
	
	public TipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion,
			EstadoTipoRelacionInstitucionEntity estadoTipoRelacionInstitucion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstadoTipoRelacionInstitucion(estadoTipoRelacionInstitucion);
		
	
	}
	

	public TipoRelacionInstitucionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}


	

	
	public static final TipoRelacionInstitucionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}


	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}


	public final String getNombre() {
		return nombre;
	}


	private final void  setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
	}


	public final String getDescripcion() {
		return descripcion;
	}


	private final void  setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}


	public final EstadoTipoRelacionInstitucionEntity getEstadoTipoRelacionInstitucion() {
		return estadoTipoRelacionInstitucion;
	}


	private final void setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionEntity estadoTipoRelacionInstitucion) {
		this.estadoTipoRelacionInstitucion = UtilObject.getDefault(estadoTipoRelacionInstitucion, EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}
	
	
	
	
	
	
	
	
}
