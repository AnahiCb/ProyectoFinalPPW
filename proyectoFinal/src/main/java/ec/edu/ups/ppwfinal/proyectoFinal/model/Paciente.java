package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="TBL_PACIENTE")
public class Paciente {
	@Id
	private int id;
	@Column(name="pac_FechaNac")
	private Date fechaNac;
	
	@OneToOne
	@JoinColumn(name="per_cedula")
	private Persona p;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Persona getP() {
		return p;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	
	

}
