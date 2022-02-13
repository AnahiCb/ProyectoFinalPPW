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

import ec.edu.ups.ppwfinal.proyectoFinal.business.GestionPersonaON;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;
@Path("Personas")
public class PersonasServicesRest {

	@Inject 
	private GestionPersonaON PersonasON;
	
	@POST 
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Respuesta crearPersona( Persona u) {
		
		Respuesta res = new Respuesta ();
		try {
	 res.setCodigo(1);
		res.setMensaje(PersonasON.guardarPersona(u));
			return res;
		}catch(Exception e){
			res.setCodigo(99);
			return res; 
			
		}
		
	}
	@GET
	@Path("find/{cedula}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Persona findPersona(@PathParam("cedula") String cedula){

		Persona Persona = PersonasON.readPersona(cedula);
		return Persona;
	}
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void actualizarProducto (Persona Persona) {
    	try {
    		PersonasON.guardarPersona(Persona);
    		
    	}catch (Exception e) {
    		
    		
    	}
    	
    }
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas(){
		List<Persona> Personas = PersonasON.getPersonas();
		return Personas;
	}
	@DELETE
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("delete/{cedula}")
	public void elminarPersonas (@PathParam("cedula") String cedula) {
		try {
    		PersonasON.eliminarPersona(cedula);
    		
    	}catch (Exception e) {
    		
    		
    	}
		
	}
	
}
