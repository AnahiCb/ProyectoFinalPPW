package ec.edu.ups.ppwfinal.proyectoFinal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="TBL_DIAGNOSTICO")
public class Diagnostico implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name="diag_fecha")
	private String fecha;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
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
