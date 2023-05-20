package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PreferenciaCategoriaEntity {
	
	
	private static final PreferenciaCategoriaEntity DEFUALT_OBJECT = new PreferenciaCategoriaEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private CategoriaEntity categoria;
	
	
	
	
	
	
	public PreferenciaCategoriaEntity(UUID identificador, PerfilEntity perfil, CategoriaEntity categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}






	private PreferenciaCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilEntity.getDefaultObject());
		setCategoria(CategoriaEntity.getDefaultObject());
	}



	
	



	public static final PreferenciaCategoriaEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}






	public final PerfilEntity getPerfil() {
		return perfil;
	}






	private final void setPerfil(PerfilEntity perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
	
	}






	public final CategoriaEntity getCategoria() {
		return categoria;
	}






	private final void setCategoria(CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
		
	}

	

}
