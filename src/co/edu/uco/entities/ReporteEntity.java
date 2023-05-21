package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ReporteEntity {

	private static final ReporteEntity DEFAULT_OBJECT = new ReporteEntity();
	private UUID identificador;
	private LectorEntity lector;
	private ComentarioLectorEntity comentario;
	private TipoReporteEntity tipoReporte;
	
	
	
	
	public ReporteEntity(UUID identificador, LectorEntity lector, ComentarioLectorEntity comentario,
			TipoReporteEntity tipoReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
	}




	private ReporteEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorEntity.getDefaultObject());
		setComentario(ComentarioLectorEntity.getDefualtObject());
		setTipoReporte(TipoReporteEntity.getDefaultObject());
	}
	
	
	
	

	public static final ReporteEntity getDefaultObject() {
		return DEFAULT_OBJECT;
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




	public final ComentarioLectorEntity getComentario() {
		return comentario;
	}




	private final void setComentario(ComentarioLectorEntity comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.getDefualtObject());
		
	}




	public final TipoReporteEntity getTipoReporte() {
		return tipoReporte;
	}




	private final void setTipoReporte(TipoReporteEntity tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteEntity.getDefaultObject());
		
	}
	
	
	
}
