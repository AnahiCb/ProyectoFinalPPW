package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

public class Paciente {
	
	private int id;
	private Date fechaNac;
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
