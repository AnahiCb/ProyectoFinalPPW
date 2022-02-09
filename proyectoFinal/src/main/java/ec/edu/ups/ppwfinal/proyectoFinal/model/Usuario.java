package ec.edu.ups.ppwfinal.proyectoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="TBL_USUARIO")
public class Usuario {
	@Id
	private int codigo;
	@Column(name="usu_nombre")
	private String usuario;
	@Column(name="usu_contrasena")
	private String contra;
	@Column(name="usu_nombre")
	
	@OneToOne
	@JoinColumn(name="per_cedula")
	private Persona p;
	
	
	public Persona getP() {
		return p;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	
}
