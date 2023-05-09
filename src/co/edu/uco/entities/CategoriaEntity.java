package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaEntity {

	private static final CategoriaEntity DEFAULT_OBJECT = new CategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaEntity estado;
	
	
	
	

	public CategoriaEntity(UUID identificador, CategoriaEntity categoriaPadre, String nombre, String descripcion,
			EstadoCategoriaEntity estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	
	
	
	
	
	public CategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoriaPadre(CategoriaEntity.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoCategoriaEntity.getDefaultObject());
		
	}






	public static final CategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}
	public final CategoriaEntity getCategoriaPadre() {
		return categoriaPadre;
	}
	private final void setCategoriaPadre(CategoriaEntity categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaEntity.getDefaultObject());
		
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}
	public final EstadoCategoriaEntity getEstado() {
		return estado;
	}
	private final void setEstado(EstadoCategoriaEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaEntity.getDefaultObject());
	
	}

	
	
	
}
