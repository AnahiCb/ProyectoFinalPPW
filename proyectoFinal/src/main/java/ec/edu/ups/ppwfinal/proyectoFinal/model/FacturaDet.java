package ec.edu.ups.ppwfinal.proyectoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TBL_DETALLES")
public class FacturaDet {
	@Id
	private int id;
	@Column(name="fdet_cantidad")
	private int cantidad;
	@Column(name="fdet_servicio")
	private String servicio;
	@Column(name="fdet_subtotal")
	private double subtotal;
	@Column(name="fdet_iva")
	private double iva;
	@Column(name="fdet_total")
	private double total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	
}
