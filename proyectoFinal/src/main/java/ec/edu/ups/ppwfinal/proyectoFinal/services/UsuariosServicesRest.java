package ec.edu.ups.ppwfinal.proyectoFinal.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.edu.ups.ppwfinal.proyectoFinal.business.GestionUsuarioON;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Usuario;
@Path("usuarios")
public class UsuariosServicesRest {

	@Inject 
	private GestionUsuarioON usuariosON;
	
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces (MediaType.APPLICATION_JSON)
	public Respuesta crearUsuario(Persona per, Usuario u) {
		
		Respuesta res = new Respuesta ();
		try {
		res.setMensaje(usuariosON.guardarUsuario(u, per));
			return res;
		}catch(Exception e){
			return res;
			
		}
		
		

	}
	
	
}
