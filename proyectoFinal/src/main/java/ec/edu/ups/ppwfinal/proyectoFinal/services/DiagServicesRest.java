package ec.edu.ups.ppwfinal.proyectoFinal.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
	public Respuesta crearPersona( Diagnostico u,Persona paciente, Persona medico) {
		u.setPaciente(paciente);
		u.setMedico(medico);
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

}