package co.edu.uco.entities;



import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorEntity {

	
	private static final ComentarioLectorEntity DEFUALT_OBJECT = new ComentarioLectorEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private ComentarioLectorEntity comentarioPadre;
	private String comentario;
	private Date fechaComentario;
	private EstadoComentarioLectorEntity estado;
	
	
	
	public ComentarioLectorEntity(UUID identificador,LectorEntity lector, PublicacionEntity publicacion, ComentarioLectorEntity comentarioPadre,
			String comentario, Date fechaComentario, EstadoComentarioLectorEntity estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaComentario(fechaComentario);
		setEstado(estado);

	}



	private ComentarioLectorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setComentarioPadre(ComentarioLectorEntity.getDefualtObject());
		setComentario(UtilText.getUtilText().getDefaultValue());
		setFechaComentario(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoComentarioLectorEntity.getDefaultObject());
	}


	
	
	
	

	public static final ComentarioLectorEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}



	public final LectorEntity getLector() {
		return lector;
	}



	private final void setLector(LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	
	}



	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}



	private final void setPublicacion(PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	
	}



	public final ComentarioLectorEntity getComentarioPadre() {
		return comentarioPadre;
	}



	private final void setComentarioPadre(ComentarioLectorEntity comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntity.getDefualtObject());
	
	}



	public final String getComentario() {
		return comentario;
	}



	private final void setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		
	}



	public final Date getFechaComentario() {
		return fechaComentario;
	}



	private final void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = UtilDateTime.getDefaultDate(fechaComentario);
	}



	public final EstadoComentarioLectorEntity getEstado() {
		return estado;
	}



	private final void setEstado(EstadoComentarioLectorEntity estado) {
		this.estado =UtilObject.getDefault(estado, EstadoComentarioLectorEntity.getDefaultObject());

	}
	
	
	
	
	
}
