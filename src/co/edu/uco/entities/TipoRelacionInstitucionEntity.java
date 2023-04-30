package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionEntity {
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


	
	public final UUID getIdentificador() {
		return identificador;
	}


	public final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}


	public final String getNombre() {
		return nombre;
	}


	public final void  setNombre(String nombre) {
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


	public final void setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionEntity estadoTipoRelacionInstitucion) {
		this.estadoTipoRelacionInstitucion = UtilObject.getDefault(estadoTipoRelacionInstitucion, EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}
	
	
	
	
	
	
	
	
}
