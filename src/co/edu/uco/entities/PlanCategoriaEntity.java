package co.edu.uco.entities;


import java.util.Date;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PlanCategoriaEntity {

	private static final PlanCategoriaEntity DEFAULT_OBJECT = new PlanCategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private float precio;
	private Date fechaDeste;
	private Date fechaHasta;
	
	
	public PlanCategoriaEntity(UUID identificador, CategoriaEntity categoria, float precio, Date fechaDeste,
			Date fechaHasta) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDeste(fechaDeste);
		setFechaHasta(fechaHasta);
	}


	private PlanCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaEntity.getDefaultObject());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDeste(UtilDateTime.getDefaultValueDate());
		setFechaHasta(UtilDateTime.getDefaultValueDate());
	}


	


	public static final PlanCategoriaEntity getDefaultObject() {
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


	public final float getPrecio() {
		return precio;
	}


	private final void setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultFloatValue();
		
	}


	public final Date getFechaDeste() {
		return fechaDeste;
	}


	private final void setFechaDeste(Date fechaDeste) {
		this.fechaDeste = UtilDateTime.getDefaultDate(fechaDeste);
	
	}


	public final Date getFechaHasta() {
		return fechaHasta;
	}


	private final void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = UtilDateTime.getDefaultDate(fechaHasta);
		
	}
	
	
	
	
	
	
	
}
