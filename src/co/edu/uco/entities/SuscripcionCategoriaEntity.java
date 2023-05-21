package co.edu.uco.entities;

import java.util.UUID;


import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;


public final class SuscripcionCategoriaEntity {

	private static final SuscripcionCategoriaEntity DEFAULT_OBJECT = new SuscripcionCategoriaEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private PlanCategoriaEntity categoria;
	
	
	
	
	
	
	public SuscripcionCategoriaEntity(UUID identificador, PerfilEntity perfil, PlanCategoriaEntity categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}





	private SuscripcionCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilEntity.getDefaultObject());
		setCategoria(PlanCategoriaEntity.getDefaultObject());
	}






	public static final SuscripcionCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
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





	public final PlanCategoriaEntity getCategoria() {
		return categoria;
	}





	private final void setCategoria(PlanCategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, PlanCategoriaEntity.getDefaultObject());
		
	}
	
	
	
	
	
	
}
