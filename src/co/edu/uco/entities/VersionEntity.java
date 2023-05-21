package co.edu.uco.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public  final class VersionEntity {

	
	private static final VersionEntity DEFAULT_OBJECT = new VersionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private VersionEntity version;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionEntity estado;
	
	
	
	public VersionEntity(UUID identificador, PublicacionEntity publicacion, VersionEntity version, int numeroVersion,
			Date fechaCreacion, Date fechaUltimaModificacion, String titulo, String resumen, String cuerpo,
			EstadoVersionEntity estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersion(version);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}



	private VersionEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setVersion(VersionEntity.getDefaultObject());
		setNumeroVersion(UtilNumeric.getDefaultIntValue());
		setFechaCreacion(UtilDateTime.getDefaultValueDate());
		setFechaUltimaModificacion(UtilDateTime.getDefaultValueDate());
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionEntity.getDefaultObject());
	}
	
	
	


	public static final VersionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}



	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}



	private final void setPublicacion(PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
		
	}



	public final VersionEntity getVersion() {
		return version;
	}



	private final void setVersion(VersionEntity version) {
		this.version = UtilObject.getDefault(version, VersionEntity.getDefaultObject());
		
	}



	public final int getNumeroVersion() {
		return numeroVersion;
	}



	private final void setNumeroVersion(int numeroVersion) {
		this.numeroVersion = UtilNumeric.getDefaultValueInt(numeroVersion);
		
	}



	public final Date getFechaCreacion() {
		return fechaCreacion;
	}



	private final void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = UtilDateTime.getDefaultDate(fechaCreacion);
		
	}



	public final Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}



	private final void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDateTime.getDefaultDate(fechaUltimaModificacion);
		
	}



	public final String getTitulo() {
		return titulo;
	}



	private final void setTitulo(String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
		
	}



	public final String getResumen() {
		return resumen;
	}



	private final void setResumen(String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
		
	}



	public final String getCuerpo() {
		return cuerpo;
	}



	private final void setCuerpo(String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
		
	}



	public final EstadoVersionEntity getEstado() {
		return estado;
	}



	private final void setEstado(EstadoVersionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionEntity.getDefaultObject());
	
	}

	
	
	
	
	
}
