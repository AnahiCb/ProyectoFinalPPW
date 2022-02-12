package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppwfinal.proyectoFinal.model.Cita;

@Stateless
public class CitaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Cita p) {
		
		em.persist(p);
		
	}
	
     public void update(Cita p) {
		
    	 em.merge(p);
		
	}
     
     public Cita read(int id) {
 		
    	Cita p = em.find(Cita.class,  id);
 		return  p;
 	}
    
     public void delate (int id) {
    	 Cita p = em.find(Cita.class,id);
    	 em.remove(p);
    	 
     }
     
     public List <Cita > getList(){
    	 
    	 String jpql ="SELECT p FROM Cita p" ;
    	 
    	 Query q = em.createQuery(jpql,Cita.class);
    	 
    	 return q.getResultList();
    	 
     }
    
     public List <Cita > getListFecha(String filtro){
    	 
    	 String jpql ="SELECT p FROM Cita p "
    	 		+ "WHERE fecha LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Cita.class);
    	 
    	 q.setParameter(1,filtro);
    	 
    	 return q.getResultList();
    	 
     }

}
