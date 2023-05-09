package co.edu.uco.entities;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilMail;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class AdministradorCategoriaEntity {

	private static final AdministradorCategoriaEntity DEFAULT_OBJECT = new AdministradorCategoriaEntity();
	private UUID identificador;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String indicadorPaisTelefono;
	private String numeroTelefonoMovil;
	private TipoRelacionInstitucionEntity tipoRelacionInstitucion;
	private boolean cuentaDeCorreoEstaVerificada;
	private boolean numeroTelefonoEstaVerificado;
	private EstadoAdministradorCategoriaEntity estado;
	
	
	
	
	public AdministradorCategoriaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correoElectronico, String indicadorPaisTelefono, String numeroTelefonoMovil,
			TipoRelacionInstitucionEntity tipoRelacionInstitucion, boolean cuentaDeCorreoEstaVerificada,
			boolean numeroTelefonoEstaVerificado, EstadoAdministradorCategoriaEntity estado) {
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
		setNumeroTelefonoMovil(numeroTelefonoMovil);
		setTipoRelacionInstitucion(tipoRelacionInstitucion);
		setCuentaDeCorreoEstaVerificada(cuentaDeCorreoEstaVerificada);
		setNumeroTelefonoEstaVerificado(numeroTelefonoEstaVerificado);
		setEstado(estado);
	}




	public AdministradorCategoriaEntity() {
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
		setNumeroTelefonoMovil(UtilText.getUtilText().getDefaultValue());
		setTipoRelacionInstitucion(TipoRelacionInstitucionEntity.getDefaultObject());
		setCuentaDeCorreoEstaVerificada(UtilBoolean.getDefaultValue());
		setNumeroTelefonoEstaVerificado(UtilBoolean.getDefaultValue());
		setEstado(EstadoAdministradorCategoriaEntity.getDefaultObject());
	}
	
	
	
	
	


	public static final AdministradorCategoriaEntity getDefaultObject() {
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




	private final void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
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




	private final  void setPrimerApellido(String primerApellido) {
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




	public final String getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}




	private final void setNumeroTelefonoMovil(String numeroTelefonoMovil) {
		this.numeroTelefonoMovil = UtilText.getUtilText().applyTrim(numeroTelefonoMovil);
		
	}




	public final TipoRelacionInstitucionEntity getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}




	private final void setTipoRelacionInstitucion(TipoRelacionInstitucionEntity tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion,TipoRelacionInstitucionEntity.getDefaultObject());
		
	}




	public final boolean isCuentaDeCorreoEstaVerificada() {
		return cuentaDeCorreoEstaVerificada;
	}




	private final void setCuentaDeCorreoEstaVerificada(boolean cuentaDeCorreoEstaVerificada) {
		this.cuentaDeCorreoEstaVerificada = UtilBoolean.getDefault(cuentaDeCorreoEstaVerificada);
		
	}




	public final boolean isNumeroTelefonoEstaVerificado() {
		return numeroTelefonoEstaVerificado;
	}




	private final void setNumeroTelefonoEstaVerificado(boolean numeroTelefonoEstaVerificado) {
		this.numeroTelefonoEstaVerificado = UtilBoolean.getDefault(numeroTelefonoEstaVerificado);
		
	}




	public final EstadoAdministradorCategoriaEntity getEstado() {
		return estado;
	}




	private final void setEstado(EstadoAdministradorCategoriaEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaEntity.getDefaultObject());
		
	}



	
	
	
}
