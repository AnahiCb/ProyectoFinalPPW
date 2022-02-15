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
import ec.edu.ups.ppwfinal.proyectoFinal.encrypt.*;
@Path("Personas")


public class PersonasServicesRest {
	private Encrypt encryptar= new Encrypt();
	@Inject 
	private GestionPersonaON PersonasON;
	
	@POST 
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Respuesta crearPersona( Persona u) {//Crear persona
		Respuesta res = new Respuesta ();
		try {
	 res.setCodigo(1);
		String aux = u.getPass();
		u.setPass(encryptar.getAES(aux));
		System.out.print(encryptar.getAES(aux));
		res.setMensaje(PersonasON.guardarPersona(u));
			return res;
		}catch(Exception e){
			res.setCodigo(99);
			return res; 
			
		}
		
	}
	@GET
	@Path("{cedula}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Object getPersona(@PathParam("cedula") String cedula){//Obtener persona por cedula

		return PersonasON.getPersona(cedula);
	}
    
	

	@GET
	@Path("{correo}/{pass}")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Object getPersonaLog(@PathParam("correo") String correo,@PathParam("pass") String pass){//Obtener objecto Persona para login

		return PersonasON.getPersonaLog(correo, pass);
	}
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void actualizarPersona (Persona Persona) {
    	try {
    		PersonasON.guardarPersona(Persona);
    		
    	}catch (Exception e) {
    		
    		
    	}
    	
    }
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas(){// Obtener lista de Personas
		List<Persona> Personas = PersonasON.getPersonas();
		return Personas;
	}
	@GET
	@Path("pacientes")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Persona> getPacientes(){//Obtener lista de Pacientes
		List<Persona> Personas = PersonasON.getPacientes();
		return Personas;
	}
	@GET
	@Path("medicos")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Persona> getMedicos(){//Obtener lista de medicos
		List<Persona> Personas = PersonasON.getMedicos();
		return Personas;
	}
	@DELETE
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Path("{cedula}")
	public void eliminarPersonas (@PathParam("cedula") String cedula) {//Eliminar Persona
		try {
    		PersonasON.eliminarPersona(cedula);
    		
    	}catch (Exception e) {
    		
    		
    	}
		
	}
	

	
}
