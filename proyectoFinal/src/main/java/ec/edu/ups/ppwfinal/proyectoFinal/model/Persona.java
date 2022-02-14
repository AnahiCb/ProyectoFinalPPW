package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PERSONA")
public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	public Persona() {
	
	}
	@Id
	@Column(name="per_cedula")
	private String cedula;

	@Column(name="per_nombre")
	private String nombre;

	@Column(name="per_direccion")
	private String direccion;
	

	@Column(name="per_correo")
	private String correo;
	@Column(name="per_pass")
	private String pass;
    
	@Column(name="per_rol")//medico o paciente
	private String rol;

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


    
	
	
}
