package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.ppwfinal.proyectoFinal.model.FacturaCabecera;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;

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
     
     public FacturaCabecera read(int id) {
 		
    	FacturaCabecera p = em.find(FacturaCabecera.class, id);
 		return  p;
 	}
    
     public void delate (int id) {
    	 FacturaCabecera p = em.find(FacturaCabecera.class, id);
    	 em.remove(p);
    	 
     }
     
     public List <FacturaCabecera > getList(){
    	 
    	 String jpql ="SELECT p FROM FacturaCabecera p" ;
    	 
    	 Query q = em.createQuery(jpql,FacturaCabecera.class);
    	 
    	 return q.getResultList();
    	 
     }
     
     
   public List <FacturaCabecera> getListNombre(String filtro){
    	 
    	 String jpql ="SELECT p FROM FacturaCabecera p "
    	 		+ "WHERE numero LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Persona.class);
    	 
    	 q.setParameter(1,filtro);
    	 
    	 return q.getResultList();
    	 
     }
  
    

     
}