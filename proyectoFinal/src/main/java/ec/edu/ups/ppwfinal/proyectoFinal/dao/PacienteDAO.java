package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppwfinal.proyectoFinal.model.Paciente;

@Stateless
public class PacienteDAO {
	@PersistenceContext
	private EntityManager em;
	public void insert(Paciente p) {
		
		em.persist(p);
		
	}
	
     public void update(Paciente p) {
		
    	 em.merge(p);
		
	}
     
     public Paciente read(String  cedula) {
 		
    	Paciente p = em.find(Paciente.class, cedula);
 		return  p;
 	}
    
     public void delate (String cedula) {
    	 Paciente p = em.find(Paciente.class, cedula);
    	 em.remove(p);
    	 
     }
     
     public List <Paciente > getList(){
    	 
    	 String jpql ="SELECT p FROM Paciente p" ;
    	 
    	 Query q = em.createQuery(jpql,Paciente.class);
    	 
    	 return q.getResultList();
    	 
     }
    
     public List <Paciente > getListNombre(String filtro){
    	 
    	 String jpql ="SELECT p FROM Paciente p "
    	 		+ "WHERE nombre LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Paciente.class);
    	 
    	 q.setParameter(1,filtro);
    	 
    	 return q.getResultList();
    	 
     }
}
