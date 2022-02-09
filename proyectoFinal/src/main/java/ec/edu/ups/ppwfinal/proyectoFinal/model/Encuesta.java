package ec.edu.ups.ppwfinal.proyectoFinal.model;

public class Encuesta {
	
	private int id;
	private String descrip; //Descripcion de la encuesta (Buena, Mala o Regula)
	private Cita c;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public Cita getC() {
		return c;
	}
	public void setC(Cita c) {
		this.c = c;
	}
	
	

}
