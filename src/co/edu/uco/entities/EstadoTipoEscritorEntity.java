 package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class EstadoTipoEscritorEntity {
	
	private static final EstadoTipoEscritorEntity DEFAULT_OBJECT = new EstadoTipoEscritorEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	
	public EstadoTipoEscritorEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		}
	
	private  EstadoTipoEscritorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	
	public static EstadoTipoEscritorEntity getDefaultObject() {
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
		this.descripcion = UtilText.getUtilText().applyTrim(nombre);
		
	
	}



}

