package ups.edu.ec.JPA;

import ups.edu.ec.DAO.OperadorasDAO;
import ups.edu.ec.Entidades.Operadoras;

public class JPAOperadorasDAO extends JPAGenericDao<Operadoras, Integer> implements OperadorasDAO {

	public JPAOperadorasDAO() {
		super(Operadoras.class);
		// TODO Auto-generated constructor stub
	}

}
