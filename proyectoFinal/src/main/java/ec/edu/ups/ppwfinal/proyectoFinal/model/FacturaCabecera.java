package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;
import java.util.List;

public class FacturaCabecera {
	
	private int numero;
	private Date fecha;
	private Persona cliente;
	private List<FacturaDet> detalles;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	public List<FacturaDet> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<FacturaDet> detalles) {
		this.detalles = detalles;
	}
	
	
	

}
