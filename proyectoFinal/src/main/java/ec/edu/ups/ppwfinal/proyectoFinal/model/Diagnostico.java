package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="TBL_DIAGNOSTICO")
public class Diagnostico {
	@Id
	private int id;
	@Column(name="diag_fecha")
	private Date fecha;
	@Column(name="diag_descrip")
	private String descrip;

	@OneToOne
	@JoinColumn(name="diag_medico")
	private Medico m;

	@OneToOne
	@JoinColumn(name="diag_paciente")
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
