package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppwfinal.proyectoFinal.model.FacturaDet;


@Stateless
public class FacturaDetDAO {
	

	@PersistenceContext
	private EntityManager em;
	
	public void insert(FacturaDet p) {
		
		em.persist(p);
		
	}
	
     public void update(FacturaDet p) {
		
    	 em.merge(p);
		
	}
     
     public FacturaDet read(String  cedula) {
 		
    	FacturaDet p = em.find(FacturaDet.class, cedula);
 		return  p;
 	}
    
     public void delate (String cedula) {
    	 FacturaDet p = em.find(FacturaDet.class, cedula);
    	 em.remove(p);
    	 
     }
     
     public List <FacturaDet > getList(){
    	 
    	 String jpql ="SELECT p FROM FacturaDet p" ;
    	 
    	 Query q = em.createQuery(jpql,FacturaDet.class);
    	 
    	 return q.getResultList();
    	 
     }
     
  

}
