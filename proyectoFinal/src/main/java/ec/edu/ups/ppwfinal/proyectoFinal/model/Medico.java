package ec.edu.ups.ppwfinal.proyectoFinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_MEDICO")
public class Medico {
	@Id
	private int id;
	@Column(name="med_cargo")
	private String cargo;
	@Column(name="med_horario")
	private String horario;
	
	@OneToOne
	@JoinColumn(name="per_cedula")
	private Persona p;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Persona getP() {
		return p;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	
	
	
	

}
