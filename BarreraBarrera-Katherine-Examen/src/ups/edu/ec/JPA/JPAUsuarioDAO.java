package ups.edu.ec.JPA;

import java.util.List;

import ups.edu.ec.DAO.UsuarioDAO;
import ups.edu.ec.Entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDao<Usuario, Integer> implements UsuarioDAO{

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	

	//@SuppressWarnings("unchecked")
	@Override
	
	public Usuario findByUsuarioPorNombre(String nombre) {
		
		
		Usuario usu = new Usuario();
		
		String consulta = "SELECT  u FROM Usuario u WHERE u.nombre LIKE :nombre";
		try {
			em.clear();
			usu = (Usuario)em.createQuery(consulta).setParameter("nombre", nombre).getSingleResult();		
			em.refresh(usu);
			System.out.println("Usuario: "+usu.getNombre());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
		
	}
	
	@Override
	
	public Usuario findByUsuarioPorCedula(String cedula) {
		// TODO Auto-generated method stub
		
		Usuario usu = null;
		
		String consulta = "SELECT  u FROM Usuario u WHERE u.cedula LIKE :cedula";
		try {
			em.clear();
			usu = (Usuario)em.createQuery(consulta).setParameter("cedula", cedula).getSingleResult();		
			
			System.out.println("Usuario: "+usu.getNombre());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> findByUsuarioPorCedulaAJAX(String cedula) {
		
		
		List<Usuario> usu = null;
		
		String consulta = "SELECT  u FROM Usuario u, Telefono t WHERE u.cedula LIKE :cedula GROUP BY u.cedula";
		try {
			em.clear();  
			usu = (List<Usuario>)em.createQuery(consulta).setParameter("cedula", cedula).getResultList();
			//em.refresh(usu);
			System.out.println("Usuario recuperado: "+usu.get(0).getNombre());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}
	
	

}
