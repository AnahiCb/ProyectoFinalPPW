package ec.edu.ups.ppwfinal.proyectoFinal.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.CitaDAO;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Cita;



@Stateless
public class GestionCitasON {
	
	@Inject
	private CitaDAO citaDao;
	
	
	public String guardarPersona (Cita pe) {
		
		Cita p = citaDao.read(pe.getId());
		
		if (p==null) {
			
			citaDao.insert(p);
			return "persona insertada correctamente";
		}else {
			
			citaDao.update(p);
			return "persona actualizada correctamente";
		}
		
		
		
	}
	


}
