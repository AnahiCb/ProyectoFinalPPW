package ec.edu.ups.ppwfinal.proyectoFinal.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import ec.edu.ups.ppwfinal.proyectoFinal.business.GestionPersonaON;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;



@Named
@RequestScoped
public class PersonasBean {

	@Inject
	private GestionPersonaON perON;

	private String cedula="";
	private String nombre="";
	private String direccion="";
	private String correo="";
	private String pass="";
	private String rol="";
	private Persona newPersona = new Persona();
	
	private List<Persona> usuarios;
	private List<Persona> pacientes;
	private List<Persona> medicos;
	
	
	@PostConstruct
	public void init() {
		usuarios = perON.getPersonas();
		pacientes = perON.getPacientes();
		medicos = perON.getMedicos();
		
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Persona> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Persona> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Persona> getPacientes() {
		return pacientes;
	}

	public void setPacientes(List<Persona> pacientes) {
		this.pacientes = pacientes;
	}

	public List<Persona> getMedicos() {
		return medicos;
	}

	public void setMedicos(List<Persona> medicos) {
		this.medicos = medicos;
	}

	public GestionPersonaON getPerON() {
		return perON;
	}

	public void setPerON(GestionPersonaON perON) {
		this.perON = perON;
	}

	public Persona getObjPersona() {
		return newPersona;
	}

	public void setObjPersona(Persona objPersona) {
		this.newPersona = objPersona;
	}

	public String guardarPersona() {
		Persona p = new Persona();
		p.setCedula(cedula);
		p.setNombre(nombre);
		p.setDireccion(direccion);
		p.setCorreo(correo);
		p.setPass(pass);
		p.setRol(rol);
		newPersona=p;
		System.out.println(p);
		if (newPersona!=null) 		
		{
			
			perON.guardarPersona(newPersona);
			this.init();
			
		}
		
		

		
		return "listado-usuarios";
	}
	
	public String editarCliente(String id) {
		System.out.println("editando " + id);
		return "crear-usuario?faces-redirect=true&id=" + id;

	}
	
	public Persona listarUsuarios() {
		for (Persona p : usuarios) {
			System.out.println(p.getCedula() + " cedula >>");
			this.cedula = p.getCedula();
			this.nombre = p.getNombre();
			this.direccion = p.getDireccion();
			this.correo = p.getCorreo();
			this.pass = p.getPass();
			this.init();
			return p;
		}
		return null;
	}
	
	public Persona listarPacientes() {
		for (Persona p : pacientes) {
			System.out.println(p.getCedula() + " cedula >>");
			this.cedula = p.getCedula();
			this.nombre = p.getNombre();
			this.direccion = p.getDireccion();
			this.correo = p.getCorreo();
			this.pass = p.getPass();
			this.init();
			return p;
		}
		return null;
	}
	
	public Persona listarMedicos() {
		for (Persona p : medicos) {
			System.out.println(p.getCedula() + " cedula >>");
			this.cedula = p.getCedula();
			this.nombre = p.getNombre();
			this.direccion = p.getDireccion();
			this.correo = p.getCorreo();
			this.pass = p.getPass();
			this.init();
			return p;
		}
		return null;
	}
	
}
