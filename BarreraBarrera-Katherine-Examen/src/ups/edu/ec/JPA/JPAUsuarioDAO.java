package ups.edu.ec.JPA;

import ups.edu.ec.DAO.UsuarioDAO;
import ups.edu.ec.Entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDao<Usuario, Integer> implements UsuarioDAO{

	public JPAUsuarioDAO() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

}
