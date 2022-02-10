package ec.edu.ups.ppwfinal.proyectoFinal.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.ppwfinal.proyectoFinal.dao.*;
import ec.edu.ups.ppwfinal.proyectoFinal.model.*;

@Stateless
public class GestionBusinessON {

	@Inject
	private UsuarioDAO usuarioDao;
	@Inject
	private PersonaDAO personaDao;
	@Inject
	private PacienteDAO pacienteDao;
	@Inject
	private MedicoDAO medicoDao;
	@Inject
	private FacturaDAO facturaDao;
	@Inject
	private FacturaDetDAO facturaDetDao;

	/* Metodos CRUD insert - update */
	public String guardarUsuario(Usuario u) {// Guardar o Actualizar usuarios

		Usuario p = usuarioDao.read(u.getUsuario());

		if (p == null) {

			usuarioDao.insert(u);
			return "usuario creado coreectamente";
		} else if (p != null) {

			usuarioDao.update(u);

			return "usuario actualizado coreectamente";
		}

		return "No se puedo guardar el usuario";

	}

	public String guardarPersona(Persona pe) {// Guardar o Actualizar personas

		Persona p = personaDao.read(pe.getCedula());

		if (p == null) {

			personaDao.insert(pe);
			return "persona agregada correctamente";

		} else if (p != null) {

			personaDao.update(pe);
			return "persona actualizada correctamente";
		}

		return "Nose pudo guardar a la persona";
	}

	public String guardarPaciente(Paciente pa) {// Guardar o Actualizar personas

		Paciente p = pacienteDao.read(pa.getP());

		if (p == null) {

			pacienteDao.insert(pa);
			return "paciente agregada correctamente";

		} else if (p != null) {

			pacienteDao.update(pa);
			return "paciente actualizada correctamente";
		}

		return "Nose pudo guardar al paciente";
	}

	public String guardarMedico(Medico me) {
		Medico m = medicoDao.read(me.getP());
		if (m == null) {

			medicoDao.insert(me);
			return "medico agregado correctamente";

		} else if (m != null) {

			medicoDao.update(me);
			return "medico actualizado correctamente";
		}

		return "Nose pudo guardar al medico";

	}
	
	
}
