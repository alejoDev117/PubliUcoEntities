package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaAdministradorCategoriaEntity {

	
	private static final CategoriaAdministradorCategoriaEntity DEFAULT_OBJECT = new CategoriaAdministradorCategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;
	
	
	
	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria,
			AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}



	private CategoriaAdministradorCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaEntity.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaEntity.getDefaultObject());
	}


	

	public static final CategoriaAdministradorCategoriaEntity getDefaultObject() {
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



	public final AdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}



	private final void setAdministradorCategoria(AdministradorCategoriaEntity administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria,AdministradorCategoriaEntity.getDefaultObject());
	
		
	}

	

}
