package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppwfinal.proyectoFinal.model.Diagnostico;

@Stateless
public class DiagnosticoDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Diagnostico p) {
		
		em.persist(p);
		
	}
	
     public void update(Diagnostico p) {
		
    	 em.merge(p);
		
	}
     
     public Diagnostico read(int id) {
 		
    	Diagnostico p = em.find(Diagnostico.class, id);
 		return  p;
 	}
    
     public void delate (int id) {
    	 Diagnostico p = em.find(Diagnostico.class, id);
    	 em.remove(p);
    	 
     }
     
     public List <Diagnostico > getList(){
    	 
    	 String jpql ="SELECT p FROM Diagnostico p" ;
    	 
    	 Query q = em.createQuery(jpql,Diagnostico.class);
    	 
    	 return q.getResultList();
    	 
     }
    
     public List <Diagnostico > getListFecha (String filtro){
    	 
    	 String jpql ="SELECT p FROM Diagnostico p "
    	 		+ "WHERE diag_fecha LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Diagnostico.class);
    	 
    	 q.setParameter(1,filtro);
    	 return q.getResultList();
    	 
     }
     public Diagnostico  findDiagnostico(String filtro){
    	 
    	 String jpql ="SELECT p FROM Diagnostico p "
    	 		+ "WHERE per_cedula LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Diagnostico.class);
    	 
    	 q.setParameter(1,filtro);
    	 Diagnostico med = (Diagnostico) q.getSingleResult();
    	 return med;
    	 
     }

}
