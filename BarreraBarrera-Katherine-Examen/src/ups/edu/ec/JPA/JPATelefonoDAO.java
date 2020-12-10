package ups.edu.ec.JPA;

import ups.edu.ec.DAO.TelefonoDAO;
import ups.edu.ec.Entidades.Telefono;

public class JPATelefonoDAO extends  JPAGenericDao<Telefono, Integer> implements TelefonoDAO  {

	public JPATelefonoDAO() {
		super(Telefono.class);
		
	}

}
