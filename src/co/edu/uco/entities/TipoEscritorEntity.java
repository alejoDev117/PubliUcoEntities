package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoEscritorEntity {
	
	
	private static final TipoEscritorEntity DEFAULT_OBJECT = new TipoEscritorEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorEntity estado;
	
	
	
	public TipoEscritorEntity(UUID identificador, String nombre, String descripcion,EstadoTipoEscritorEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	private TipoEscritorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoEscritorEntity.getDefaultObject());
	}

	
	
	
	public static final TipoEscritorEntity getDefaultObject() {
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


	public final EstadoTipoEscritorEntity getEstado() {
		return estado;
	}


	private final void setEstado(EstadoTipoEscritorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorEntity.getDefaultObject());
		
	}



	

}

