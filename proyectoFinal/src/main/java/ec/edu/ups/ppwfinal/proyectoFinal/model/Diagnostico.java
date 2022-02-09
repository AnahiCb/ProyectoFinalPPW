package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

public class Diagnostico {
	
	private int id;
	private Date fecha;
	private String descrip;
	private Medico m;
	private Paciente p;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public Medico getM() {
		return m;
	}
	public void setM(Medico m) {
		this.m = m;
	}
	public Paciente getP() {
		return p;
	}
	public void setP(Paciente p) {
		this.p = p;
	}
	
	
}
