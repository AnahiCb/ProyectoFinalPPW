package ec.edu.ups.ppwfinal.proyectoFinal.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.*;
import ec.edu.ups.ppwfinal.proyectoFinal.model.*;

@Stateless
public class GestionUsuarioON {
  
	
	@Inject
	private UsuarioDAO usuarioDao;
	
	public String guardarUsuario(Usuario u) {// Guardar o Actualizar usuarios

		Usuario p = usuarioDao.read(u.getCodigo());

		if (p == null ) {

			usuarioDao.insert(u);
			return "usuario creado correctamente";
		} else if (p != null) {
			usuarioDao.update(u);

			return "usuario actualizado correctamente";
		}

		return "No se puedo guardar el usuario";

	}
	
	public String eliminarUsuario(int id) {
		
		if ( id!=0) {
			
			usuarioDao.delate(id);
			return "usuario eliminado correctamente";
		}else {
			
			return "parametro nulo";
		}
	}
	
	public List<Usuario> getUsuarios(){
		
		return usuarioDao.getList();
	}
	
	
	
}
