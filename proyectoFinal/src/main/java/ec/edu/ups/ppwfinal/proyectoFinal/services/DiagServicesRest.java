package ec.edu.ups.ppwfinal.proyectoFinal.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ec.edu.ups.ppwfinal.proyectoFinal.business.GestionDiagnosticoON;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Diagnostico;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;


@Path("Diag")
public class DiagServicesRest {
	@Inject 
	private GestionDiagnosticoON diagON;
	
	@POST 
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Respuesta crearDiag( Diagnostico u) {//Crear un diagnostico

		Respuesta res = new Respuesta ();
		try {
	 res.setCodigo(1);
		
		res.setMensaje(diagON.guardarDiag(u));
			return res;
			
		}catch(Exception e){
			res.setCodigo(99);
			return res; 
			
		}
		
	}
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void actualizarDiag (Diagnostico diag) {//Actualizar Diagnostico
    	try {
    		diagON.guardarDiag(diag);
    		
    	}catch (Exception e) {
    		
    		
    	}
	
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Diagnostico> getDiags(){// Obtener lista de Diagnosticos
		List<Diagnostico> diag= diagON.getList();
		return diag;
	}
	
	
	
	@GET
	@Path("{id}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Object getDiag(@PathParam("id") int id){//Obtener diagnostico por Id

		return diagON.readDiag(id);
	}
	
	@GET
	@Path("filtro/{fecha}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Object getDiagF(@PathParam("fecha") String fecha){//Obtener diagnostico por Id

		return diagON.getList(fecha);
	}
	
	@DELETE
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("{id}")
	public void eliminarDiag(@PathParam("id") int id) {//Eliminar Diagnostico
		try {
    		diagON.delateDiag(id);
    		
    	}catch (Exception e) {
    		
    		
    	}
		
	}
	
	
	
}