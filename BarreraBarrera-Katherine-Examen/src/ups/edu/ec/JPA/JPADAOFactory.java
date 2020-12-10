package ups.edu.ec.JPA;

import ups.edu.ec.DAO.DAOFactory;

import ups.edu.ec.DAO.OperadorasDAO;
import ups.edu.ec.DAO.TelefonoDAO;
import ups.edu.ec.DAO.TipoTelefonoDAO;
import ups.edu.ec.DAO.UsuarioDAO;

public class  JPADAOFactory extends DAOFactory{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	@Override
	public TipoTelefonoDAO getTipoTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATipoTelefonoDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonoDAO();
	}

	@Override
	public OperadorasDAO getOperadorasDao() {
		// TODO Auto-generated method stub
		return new JPAOperadorasDAO();
	}

}
