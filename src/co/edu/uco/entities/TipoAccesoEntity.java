package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoAccesoEntity {
	
	
	private static final TipoAccesoEntity DEFAULT_OBJECT = new TipoAccesoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoEntity estado;
	
	
	
	public TipoAccesoEntity(UUID identificador, String nombre, String descripcion,EstadoTipoAccesoEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	private TipoAccesoEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoAccesoEntity.getDefaultObject());
	}

	
	
	
	public static final TipoAccesoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 

	}
	public final String getNombre() {
		return nombre;
	}
	
	
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	
	}


	public final EstadoTipoAccesoEntity getEstado() {
		return estado;
	}


	private final void setEstado(EstadoTipoAccesoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoEntity.getDefaultObject());
		
	}



	

}

