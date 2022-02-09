package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TBL_CITA")
public class Cita {
	@Id
	private int id;
	@Column(name="cita_fecha")
	private Date fecha;
	@Column(name="cita_estado")
	private String estado;
	@Column(name="cita_horarios")
	private String horarios;
	
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	
	
	

}
