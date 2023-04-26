package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionEntity {
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion;
	
	
	public TipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion,
			EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estadoTipoRelacionInstitucion = estadoTipoRelacionInstitucion;
	}


	public TipoRelacionInstitucionEntity() {
		super();
	}

	
	public TipoRelacionInstitucionDTO create() {
		return new TipoRelacionInstitucionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}


	public final TipoRelacionInstitucionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final String getNombre() {
		return nombre;
	}


	public final TipoRelacionInstitucionDTO  setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}


	public final String getDescripcion() {
		return descripcion;
	}


	public final TipoRelacionInstitucionDTO  setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}


	public final EstadoTipoRelacionInstitucionDTO getEstadoTipoRelacionInstitucion() {
		return estadoTipoRelacionInstitucion;
	}


	public final TipoRelacionInstitucionDTO  setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionDTO estadoTipoRelacionInstitucion) {
		this.estadoTipoRelacionInstitucion = UtilObject.getDefault(final estadoTipoRelacionInstitucion, EstadoTipoRelacionInstitucionDTO.create());
		return this;
	}
	
	
	
	
	
	
	
	
}
