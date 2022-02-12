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
	@JoinColumn(name="diag_paciente")
	private Persona paciente;
    
	@OneToOne
	@JoinColumn(name="diag_medico")
	private Persona medico;

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
	public Persona getPaciente() {
		return paciente;
	}
	public void setPaciente(Persona paciente) {
		this.paciente = paciente;
	}
	public Persona getMedico() {
		return medico;
	}
	public void setMedico(Persona medico) {
		this.medico = medico;
	}

     

	
	
}
