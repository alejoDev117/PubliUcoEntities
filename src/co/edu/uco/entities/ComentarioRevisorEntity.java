package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorEntity {

	private static final ComentarioRevisorEntity DEFUALT_OBJECT = new ComentarioRevisorEntity();
	private UUID identificador;
	private RevisionRevisorEntity revisionRevisor;
	private TipoComentarioRevisorEntity tipoComentario;
	private String comentario;
	
	
	
	
	public ComentarioRevisorEntity(UUID identificador, RevisionRevisorEntity revisionRevisor,
			TipoComentarioRevisorEntity tipoComentario, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisionRevisor(revisionRevisor);
		setTipoComentario(tipoComentario);
		setComentario(comentario);
	}




	private ComentarioRevisorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevisionRevisor(RevisionRevisorEntity.getDefualtObject());
		setTipoComentario(TipoComentarioRevisorEntity.getDefaultObject());
		setComentario(UtilText.getUtilText().getDefaultValue());
	}


	
	

	public static final ComentarioRevisorEntity getDefualtObject() {
		return DEFUALT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}




	public final RevisionRevisorEntity getRevisionRevisor() {
		return revisionRevisor;
	}




	private final void setRevisionRevisor(RevisionRevisorEntity revisionRevisor) {
		this.revisionRevisor = UtilObject.getDefault(revisionRevisor, RevisionRevisorEntity.getDefualtObject());
		
	}




	public final TipoComentarioRevisorEntity getTipoComentario() {
		return tipoComentario;
	}




	private final void setTipoComentario(TipoComentarioRevisorEntity tipoComentario) {
		this.tipoComentario = UtilObject.getDefault(tipoComentario, TipoComentarioRevisorEntity.getDefaultObject());
		
	}




	public final String getComentario() {
		return comentario;
	}




	private final void setComentario(String comentario) {
		this.comentario = comentario;
		
	}
	
	
	
	
	
}
