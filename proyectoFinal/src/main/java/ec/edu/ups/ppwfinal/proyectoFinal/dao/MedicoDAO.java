package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.ppwfinal.proyectoFinal.model.Medico;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Persona;

@Stateless
public class MedicoDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Medico p) {
		
		em.persist(p);
		
	}
	
     public void update(Medico p) {
		
    	 em.merge(p);
		
	}
     
     public Medico read(int id) {
 		
    	Medico p = em.find(Medico.class, id);
 		return  p;
 	}
    
     public void delate (int id) {
    	 Medico p = em.find(Medico.class, id);
    	 em.remove(p);
    	 
     }
     
     public List <Medico > getList(){
    	 
    	 String jpql ="SELECT p FROM Medico p" ;
    	 
    	 Query q = em.createQuery(jpql,Medico.class);
    	 
    	 return q.getResultList();
    	 
     }
    
     public List <Medico > getListNombre(String filtro){
    	 
    	 String jpql ="SELECT p FROM Medico p "
    	 		+ "WHERE nombre LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Medico.class);
    	 
    	 q.setParameter(1,filtro);
    	 return q.getResultList();
    	 
     }
     public Medico  findMedico(String filtro){
    	 
    	 String jpql ="SELECT p FROM Medico p "
    	 		+ "WHERE per_cedula LIKE ?1";
    	 System.out.println(jpql);
    	 
    	 Query q = em.createQuery(jpql,Medico.class);
    	 
    	 q.setParameter(1,filtro);
    	 Medico med = (Medico) q.getSingleResult();
    	 return med;
    	 
     }
}
