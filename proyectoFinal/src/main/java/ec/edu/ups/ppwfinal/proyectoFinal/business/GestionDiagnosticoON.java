package ec.edu.ups.ppwfinal.proyectoFinal.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.DiagnosticoDAO;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Diagnostico;

@Stateless
public class GestionDiagnosticoON {
	@Inject
	private DiagnosticoDAO diagDAO;

	public String guardarDiag(Diagnostico diag) {

		Diagnostico p = diagDAO.read(diag.getId());

		if (p == null) {

			diagDAO.insert(diag);
			return "persona insertada correctamente";
		} else {

			diagDAO.update(diag);
			return "persona actualizada correctamente";
		}
	}

	public Diagnostico readDiag(int id) {
		return diagDAO.read(id);

	}

	public Diagnostico readDiagFecha(String fecha) {

		return diagDAO.readDiagFecha(fecha);
	}

	public String delateDiag(int id) {
	
			diagDAO.delate(id);
			return "Persona eliminada correctamente";
	}
	public List<Diagnostico> getList(){
		
		return diagDAO.getList();
	}
	public List<Diagnostico> getList(String fecha){
		
		return diagDAO.getListFecha(fecha);
	}
}
