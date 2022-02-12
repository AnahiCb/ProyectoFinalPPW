package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;


@Stateless
public class PersonaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Persona p) {
		
		em.persist(p);
		
	}
	
     public void update(Persona p) {
		
    	 em.merge(p);
		
	}
     
     public Persona read(String  cedula) {
 		
    	Persona p = em.find(Persona.class, cedula);
 		return  p;
 	}
    
     public void delate (String cedula) {
    	 Persona p = em.find(Persona.class, cedula);
    	 em.remove(p);
    	 
     }
     
     public List <Persona > getList(){
    	 
    	 String jpql ="SELECT p FROM Persona p" ;
    	 
    	 Query q = em.createQuery(jpql,Persona.class);
    	 
    	 return q.getResultList();
    	 
     }
    
     public List <Persona > getListPacientes(String cedula){
    	 
    	 String jpql ="SELECT p FROM Persona p "
    	 		+ "WHERE paciente = ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Persona.class);
    	 
    	 q.setParameter(1,cedula);
    	 
    	 return q.getResultList();
    	 
     }
     
     public List <Persona > getListPMedicos(String cedula){
    	 
    	 String jpql ="SELECT p FROM Persona p "
    	 		+ "WHERE medico = ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Persona.class);
    	 
    	 q.setParameter(1,cedula);
    	 
    	 return q.getResultList();
    	 
     }
     
}