package ec.edu.ups.ppwfinal.proyectoFinal.business;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.*;
import ec.edu.ups.ppwfinal.proyectoFinal.model.*;

@Stateless
public class GestionPersonaON {
	@Inject
	private PersonaDAO personaDao;
	
	public String guardarPersona (Persona pe) {
		
		Persona p = personaDao.read(pe.getCedula());
		
		if (p==null) {
			
			personaDao.insert(pe);
			return "persona insertada correctamente";
		}else {
			
			personaDao.update(pe);
			return "persona actualizada correctamente";
		}
		
		
		
	}
	
 public Persona  readPersona(String cedula) {
	 
	return personaDao.read(cedula);
	 
	 
 }
 
 public String eliminarPersona (String cedula) {
	 personaDao.delate(cedula);
	 return "Persona eliminada correctamente";
 }
	
public List <Persona> getPersonas () {
		
		
		return personaDao.getList();
		
	}

	public List <Persona> getPacientes() {
		
	
		
		return personaDao.getListPacientes();
		
	}
	public List <Persona> getMedicos() {
		
		
		
		return personaDao.getListMedicos();
		
	}
}
