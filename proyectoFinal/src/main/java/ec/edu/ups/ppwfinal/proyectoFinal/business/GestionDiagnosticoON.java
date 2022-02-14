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

	public String guardarDiag(Diagnostico d) {

		Diagnostico p = diagDAO.read(d.getId());

		if (p == null) {

			diagDAO.insert(p);
			return "persona insertada correctamente";
		} else {

			diagDAO.update(p);
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
		if (id == 0) {

			diagDAO.delate(id);
			return "Persona eliminada correctamente";

		} else {

			return "No se pudo eliminar ";
		}
	}
	public List<Diagnostico> getList(){
		
		return diagDAO.getList();
	}
	public List<Diagnostico> getList(String fecha){
		
		return diagDAO.getListFecha(fecha);
	}
}
