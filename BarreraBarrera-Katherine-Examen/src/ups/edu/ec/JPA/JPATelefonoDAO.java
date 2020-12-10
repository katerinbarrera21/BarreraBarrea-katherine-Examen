package ups.edu.ec.JPA;

import java.util.List;

import ups.edu.ec.DAO.TelefonoDAO;
import ups.edu.ec.Entidades.Telefono;

public class JPATelefonoDAO extends  JPAGenericDao<Telefono, Integer> implements TelefonoDAO  {

	public JPATelefonoDAO() {
		super(Telefono.class);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Telefono> findByTelefonoNumeroAJAX(String numero) {
		
		
		List<Telefono> usu = null;
		
		String consulta = "SELECT  t FROM Telefono t WHERE t.numero LIKE :numero";
		try {
			em.clear();
			usu = (List<Telefono>)em.createQuery(consulta).setParameter("numero", "%"+numero+"%").getResultList();
			
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByTelefonoNumeroAJAX): " + e.getMessage());
		}
		
		return usu;

}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Telefono> findByUsuarioPorCedulaAJAX(String cedula) {
		List<Telefono> usu = null;
		
		String consulta="select t from Telefono t , Usuario u where t.usu_tel = u and u.cedula =:cedula";
		try {
			em.clear();  
			usu = (List<Telefono>)em.createQuery(consulta).setParameter("cedula", cedula).getResultList();
			//em.refresh(usu);
			System.out.println("Usuario telefonos: "+usu.size());
		} catch (Exception e) {
			System.out.println(">>>WARNING (findByUsuarioPorNombre UsuarioDAO): " + e.getMessage());
		}
		
		return usu;
	}
	
	
	
	
	
	
	
}
