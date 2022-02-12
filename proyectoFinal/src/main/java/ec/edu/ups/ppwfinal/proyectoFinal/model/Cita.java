package ec.edu.ups.ppwfinal.proyectoFinal.model;

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
@Table(name="TBL_CITA")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name="cita_fecha")
	private Date fecha;
	@Column(name="cita_estado")
	private String estado;
	@Column(name="cita_horarios")
	private String horarios;
	
	@OneToOne
	@JoinColumn(name="cita_paciente")
	private Persona paciente;
	
	@OneToOne
	@JoinColumn(name="cita_medico")
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getHorarios() {
		return horarios;
	}
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	
	
	

}
