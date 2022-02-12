package ec.edu.ups.ppwfinal.proyectoFinal.services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import ec.edu.ups.ppwfinal.proyectoFinal.business.GestionUsuarioON;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Usuario;
@Path("usuarios")
public class UsuariosServicesRest {

	@Inject 
	private GestionUsuarioON usuariosON;
	
	@POST 
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Respuesta crearUsuario( Usuario u) {
		
		Respuesta res = new Respuesta ();
		try {
	 res.setCodigo(1);
		res.setMensaje(usuariosON.guardarUsuario(u));
			return res;
		}catch(Exception e){
			res.setCodigo(99);
			return res; 
			
		}
		
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public List<Usuario> getUsuarios(){
		List<Usuario> usuarios = usuariosON.getUsuarios();
		return usuarios;
	}
	
}
