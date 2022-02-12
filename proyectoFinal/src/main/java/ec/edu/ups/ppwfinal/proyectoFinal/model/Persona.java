package ec.edu.ups.ppwfinal.proyectoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PERSONA")
public class Persona {
	@Id
	@Column(name="per_cedula")
	private String cedula;

	@Column(name="per_nombre")
	private String nombre;

	@Column(name="per_direccion")
	private String direccion;
	

	@Column(name="per_correo")
	private String correo;
	@OneToOne
	@JoinColumn(name="med_id")
    private Medico medico;
	@OneToOne
	@JoinColumn(name="pac_id")
    private Paciente paciente;
    
	@OneToOne
	@JoinColumn(name="usu_id")
	private Usuario usuario;
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
}
