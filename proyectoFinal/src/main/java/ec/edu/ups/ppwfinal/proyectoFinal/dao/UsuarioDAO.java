package ec.edu.ups.ppwfinal.proyectoFinal.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ec.edu.ups.ppwfinal.proyectoFinal.model.Usuario;



@Stateless
public class UsuarioDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void insert(Usuario u) {
		
		em.persist(u);
		
	}
	
	
    public void update(Usuario u) {
		
   	 em.merge(u);
		
	}
    
    public Usuario read(String nombre) {
 		
   	Usuario u = em.find(Usuario.class,nombre);
		return  u;
	}
    
    public void delate (int codigo ) {
   	 Usuario u = em.find(Usuario.class, codigo);
   	 em.remove(u);
   	 
    }
    
    public List <Usuario > getList(){
   	 
   	 String jpql ="SELECT u FROM Usuario u" ;
   	 
   	 Query q = em.createQuery(jpql,Usuario.class);
   	 
   	 return q.getResultList();
   	 
    }
    
    public List <Usuario> getListNombreUsuario(String filtro){
   	 
   	 String jpql ="SELECT u FROM Usuario u "
   	 		+ "WHERE usuario LIKE ?1";
   	 System.out.println(jpql);
   	 
   	 Query q = em.createQuery(jpql,Usuario.class);
   	 
   	 q.setParameter(1,filtro);
   	 
   	 return q.getResultList();
   	 
    }
}

