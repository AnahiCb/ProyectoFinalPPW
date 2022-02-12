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
	
	public String guardarPaciente(Persona pe, Paciente p, Usuario usuario) {// Guardar o Actualizar pacientes
      
		Persona per = personaDao.read(pe.getCedula());

		if (per == null && pe.getMedico()==null) {
            pe.setPaciente(p);
            pe.setMedico(null);
            pe.setUsuario(usuario);
			personaDao.insert(pe);
			return "paciente agregado correctamente";

		} else if (per != null) {
			pe.setPaciente(p);
			personaDao.update(pe);
			return "paciente agregado correctamente";
		}

		return "Nose pudo guardar al paciente";
	}
	
	public String guardarMedico(Persona pe, Medico p,Usuario usuario) {// Guardar o Actualizar pacientes
	      
		Persona per = personaDao.read(pe.getCedula());

		if (per == null && pe.getPaciente()==null) {
			 pe.setMedico(p);
			 pe.setPaciente(null);
			 pe.setUsuario(usuario);
			personaDao.insert(pe);
			return "medico agregado correctamente";

		} else if (per != null) {
			pe.setMedico(p);
			personaDao.update(pe);
			return "medico agregado correctamente";
		}

		return "Nose pudo guardar al medico";
	}
	
public List <Persona> getClientes () {
		
		
		return personaDao.getList();
		
	}

	public List <Persona> getPacientes(String cedula) {
		
		cedula = "'"+cedula+"'";
		
		return personaDao.getListPacientes(cedula);
		
	}
	public List <Persona> getMedicos(String cedula) {
		
		cedula = "'"+cedula+"'";
		
		return personaDao.getListPacientes(cedula);
		
	}
}
