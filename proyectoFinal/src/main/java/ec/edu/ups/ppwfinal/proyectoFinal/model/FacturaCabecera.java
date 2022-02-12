package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="TBL_FACTURA")
public class FacturaCabecera {
	@Id
	private int numero;
	@Column(name="fac_numero")
	private Date fecha;
	@OneToOne
	@JoinColumn(name="per_cedula")
	private Persona cliente;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fac_detalles")
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
	
	public void addDetalle (FacturaDet detalle) {
		
    	if (detalles==null) {
    		
    		detalles =(new ArrayList<FacturaDet>());
    		
    		detalles.add(detalle);
      
    	}
	}
	

}
