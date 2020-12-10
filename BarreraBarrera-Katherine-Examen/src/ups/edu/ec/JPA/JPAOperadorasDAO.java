package ups.edu.ec.JPA;

import java.util.ArrayList;
import java.util.List;

import ups.edu.ec.DAO.OperadorasDAO;
import ups.edu.ec.Entidades.Operadoras;

public class JPAOperadorasDAO extends JPAGenericDao<Operadoras, Integer> implements OperadorasDAO {

	public JPAOperadorasDAO() {
		super(Operadoras.class);
		// TODO Auto-generated constructor stub
	}
	
	public List<Operadoras> findOperadoras() {
		
		
		List<Operadoras> cats = new ArrayList<Operadoras>();
		
		String consulta = "SELECT  o FROM Operadoras ";
		try {
			em.clear();
			cats = (List<Operadoras>)em.createQuery(consulta).getResultList();		
			em.refresh(cats);
			System.out.println("Operadoras: "+cats.size());
		} catch (Exception e) {
			System.out.println(">>>WARNING (Operadoas): " + e.getMessage());
		}
		
		
		return cats;
	}

}
