package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;
@Entity
@Table(name="TBL_PACIENTE")
public class Paciente {
	@Id
	private int id;
	@Column(name="pac_FechaNac")
	private Date fechaNac;
	

	
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


}
