package ec.edu.ups.ppwfinal.proyectoFinal.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.FacturaDAO;
import ec.edu.ups.ppwfinal.proyectoFinal.model.FacturaCabecera;
import ec.edu.ups.ppwfinal.proyectoFinal.model.FacturaDet;

@Stateless
public class GestionFacturaON {
    
	@Inject
	private FacturaDAO factura;
	
	
	private FacturaCabecera cabecera = new FacturaCabecera();
	
	public String guardarFactura() {
		
		
		return null;
	}
	
	public void agregarDetalle (FacturaDet detalle) {
		
		
	}
}
