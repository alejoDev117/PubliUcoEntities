package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.dto.EstadoTipoIdentificacionDTO;

public class TipoIdentificacionEntity {
	
	private static final TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionEntity estado;
	
	
	
	public TipoIdentificacionEntity(UUID identificador,String codigo, String nombre, String descripcion,EstadoTipoIdentificacionEntity estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	private TipoIdentificacionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCodigo(UtilText.getUtilText().getDefaultValue());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		
	}
	
	
	
	
	public static final TipoIdentificacionEntity getDefaultObject() {
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


	public final EstadoTipoIdentificacionEntity getEstado() {
		return estado;
	}


	private final void setEstado(EstadoTipoIdentificacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionEntity.getDefaultObject());

	}


	public final String getCodigo() {
		return codigo;
	}


	private final void setCodigo(String codigo) {
		this.codigo = UtilText.getUtilText().applyTrim(codigo);
	
	}


	

	

}

