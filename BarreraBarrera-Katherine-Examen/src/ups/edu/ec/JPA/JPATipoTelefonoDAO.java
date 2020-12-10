package ups.edu.ec.JPA;

import ups.edu.ec.DAO.TipoTelefonoDAO;
import ups.edu.ec.Entidades.TipoTelefono;
 
public class JPATipoTelefonoDAO  extends  JPAGenericDao<TipoTelefono, Integer> implements TipoTelefonoDAO {

	public JPATipoTelefonoDAO() {
		super(TipoTelefono.class);
		// TODO Auto-generated constructor stub
	}

}
