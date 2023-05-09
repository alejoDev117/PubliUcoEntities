package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilMail;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class LectorEntity {

	private static final LectorEntity DEFAULT_OBJECT = new LectorEntity();
	private UUID identificador;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String indicadorPaisTelefono;
	private String numeroTelefonicoMovil;
	private TipoRelacionInstitucionEntity tipoRelacionIntitucion;
	private boolean correoEstaVerificado;
	private boolean numeroTelefonoMovilEstaVerificado;
	private EstadoLectorEntity estado;
	
	
	
	
	public LectorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String numeroIdentificacion,
			String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String correoElectronico, String indicadorPaisTelefono, String numeroTelefonicoMovil,
			TipoRelacionInstitucionEntity tipoRelacionIntitucion, boolean correoEstaVerificado,
			boolean numeroTelefonoMovilEstaVerificado, EstadoLectorEntity estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreoElectronico(correoElectronico);
		setIndicadorPaisTelefono(indicadorPaisTelefono);
		setNumeroTelefonicoMovil(numeroTelefonicoMovil);
		setTipoRelacionIntitucion(tipoRelacionIntitucion);
		setCorreoEstaVerificado(correoEstaVerificado);
		setCorreoEstaVerificado(numeroTelefonoMovilEstaVerificado);
		setEstado(estado);
	}




	private LectorEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setNumeroIdentificacion(UtilText.getUtilText().getDefaultValue());
		setPrimerNombre(UtilText.getUtilText().getDefaultValue());
		setSegundoNombre(UtilText.getUtilText().getDefaultValue());
		setPrimerApellido(UtilText.getUtilText().getDefaultValue());
		setSegundoApellido(UtilText.getUtilText().getDefaultValue());
		setCorreoElectronico(UtilMail.getDefaultValueMail());
		setIndicadorPaisTelefono(UtilText.getUtilText().getDefaultValue());
		setNumeroTelefonicoMovil(UtilText.getUtilText().getDefaultValue());
		setTipoRelacionIntitucion(TipoRelacionInstitucionEntity.getDefaultObject());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setEstado(EstadoLectorEntity.getDefaultObject());
	}
	
	
	




	public static final LectorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	private  final void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());

	}




	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}




	private final void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		
	}




	public final String getPrimerNombre() {
		return primerNombre;
	}




	private final void setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
	
	}




	public final String getSegundoNombre() {
		return segundoNombre;
	}




	private final void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		
	}




	public final String getPrimerApellido() {
		return primerApellido;
	}




	private final void setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		
	}




	public final String getSegundoApellido() {
		return segundoApellido;
	}




	private final void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		
	}




	public final String getCorreoElectronico() {
		return correoElectronico;
	}




	private final void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilMail.applyTrimMail(correoElectronico);
		
	}




	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}




	private final void setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		
	}




	public final String getNumeroTelefonicoMovil() {
		return numeroTelefonicoMovil;
	}




	private final void setNumeroTelefonicoMovil(String numeroTelefonicoMovil) {
		this.numeroTelefonicoMovil = UtilText.getUtilText().applyTrim(numeroTelefonicoMovil);
		
	}




	public final TipoRelacionInstitucionEntity getTipoRelacionIntitucion() {
		return tipoRelacionIntitucion;
	}




	private final void setTipoRelacionIntitucion(TipoRelacionInstitucionEntity tipoRelacionIntitucion) {
		this.tipoRelacionIntitucion = UtilObject.getDefault(tipoRelacionIntitucion, TipoRelacionInstitucionEntity.getDefaultObject());
		
	}




	public final boolean isCorreoEstaVerificado() {
		return correoEstaVerificado;
	}




	private final void setCorreoEstaVerificado(boolean correoEstaVerificado) {
		this.correoEstaVerificado = UtilBoolean.getDefault(correoEstaVerificado);
	
	}




	public final boolean isNumeroTelefonoMovilEstaVerificado() {
		return numeroTelefonoMovilEstaVerificado;
	}




	private final void setNumeroTelefonoMovilEstaVerificado(boolean numeroTelefonoMovilEstaVerificado) {
		this.numeroTelefonoMovilEstaVerificado = UtilBoolean.getDefault(numeroTelefonoMovilEstaVerificado);
	
	}




	public final EstadoLectorEntity getEstado() {
		return estado;
	}




	private final void setEstado(EstadoLectorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorEntity.getDefaultObject());
		
	}
	
	
	
	
	
	
 }
