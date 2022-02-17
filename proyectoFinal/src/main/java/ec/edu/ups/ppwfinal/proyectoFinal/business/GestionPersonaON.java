package ec.edu.ups.ppwfinal.proyectoFinal.business;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.*;
import ec.edu.ups.ppwfinal.proyectoFinal.encrypt.Encrypt;
import ec.edu.ups.ppwfinal.proyectoFinal.model.*;

@Stateless
public class GestionPersonaON {
	@Inject
	private PersonaDAO personaDao;
	private Encrypt encrypt = new Encrypt();
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
	  Persona pe= new Persona();
	 pe = personaDao.read(cedula);

	return pe ;
	 
	 
 }
 
 public String eliminarPersona (String cedula) {
	 personaDao.delate(cedula);
	 return "Persona eliminada correctamente";
 }
	
public List <Persona> getPersonas () {
		
		
		return personaDao.getList();
		
	}

public Object getPersona (String cedula) {
	
	  Persona pe= new Persona();
	 pe = personaDao.read(cedula);
	return pe ;
	
}
public Object getPersonaLog (String correo,String pass) {//Persona que se loggea
	Persona pe= new Persona();
	 pe = personaDao.getPersonaLog(correo, pass);

	return pe ;
	
}

	public List <Persona> getPacientes() {
		
	
		
		return personaDao.getListPacientes();
		
	}
	public List <Persona> getMedicos() {
		
		
		
		return personaDao.getListMedicos();
		
	}
}
