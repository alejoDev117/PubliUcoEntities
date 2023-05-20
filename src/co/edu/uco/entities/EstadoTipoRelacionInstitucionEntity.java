 package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class EstadoTipoRelacionInstitucionEntity {
	
	private static final EstadoTipoRelacionInstitucionEntity DEFAULT_OBJECT = new EstadoTipoRelacionInstitucionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	
	public EstadoTipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		}
	
	public static final EstadoTipoRelacionInstitucionEntity createWithIdentificador(UUID identificador) {
		return new EstadoTipoRelacionInstitucionEntity(identificador, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue());
		}

	public static final EstadoTipoRelacionInstitucionEntity createWithNombre(String nombre) {
		return new EstadoTipoRelacionInstitucionEntity(UtilUUID.getDefaultUuid(), nombre , UtilText.getUtilText().getDefaultValue());
		}
	public static final EstadoTipoRelacionInstitucionEntity createWithDescripcion(String descripcion) {
		return new EstadoTipoRelacionInstitucionEntity(UtilUUID.getDefaultUuid(), UtilText.getUtilText().getDefaultValue(), descripcion);
		}
	
	private  EstadoTipoRelacionInstitucionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	
	public static EstadoTipoRelacionInstitucionEntity getDefaultObject() {
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

