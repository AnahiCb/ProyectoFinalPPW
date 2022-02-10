package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.ppwfinal.proyectoFinal.model.FacturaCabecera;

@Stateless
public class FacturaDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(FacturaCabecera p) {
		
		em.persist(p);
		
	}
	
     public void update(FacturaCabecera p) {
		
    	 em.merge(p);
		
	}
     
     public FacturaCabecera read(String  cedula) {
 		
    	FacturaCabecera p = em.find(FacturaCabecera.class, cedula);
 		return  p;
 	}
    
     public void delate (String cedula) {
    	 FacturaCabecera p = em.find(FacturaCabecera.class, cedula);
    	 em.remove(p);
    	 
     }
     
     public List <FacturaCabecera > getList(){
    	 
    	 String jpql ="SELECT p FROM FacturaCabecera p" ;
    	 
    	 Query q = em.createQuery(jpql,FacturaCabecera.class);
    	 
    	 return q.getResultList();
    	 
     }
     
  
    

     
}