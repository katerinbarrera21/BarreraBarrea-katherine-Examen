package ups.edu.ec.DAO;

import ups.edu.ec.JPA.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory = new JPADAOFactory();
			
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract OperadorasDAO getOperadorasDao();
	
	public abstract UsuarioDAO getUsuarioDAO();
	
	public abstract TipoTelefonoDAO getTipoTelefonoDAO();
	
	public abstract TelefonoDAO getTelefonoDAO();
	
}
