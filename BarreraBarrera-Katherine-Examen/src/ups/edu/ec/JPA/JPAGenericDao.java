package ups.edu.ec.JPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ups.edu.ec.DAO.GenericDAO;


public class JPAGenericDao <T, ID> implements GenericDAO<T, ID> {

	 protected Class<T> persistentClass;
	    protected EntityManager em;

	    public JPAGenericDao(Class<T> persistentClass) {
			this.persistentClass = persistentClass;
			this.em = Persistence.createEntityManagerFactory("jpa").createEntityManager();
	    }

		@Override
		public void createTable() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void create(T entity) {
			em.getTransaction().begin();
			
			try {
			    em.persist(entity);
			    em.getTransaction().commit();
			} catch (Exception e) {
			    System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			    if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			}
		}

		@Override
		public T read(ID id) {
			return em.find(persistentClass, id);
		}

		@Override
		public void update(T entety) {
			em.getTransaction().begin();
			try {
			    em.merge(entety);
			    em.getTransaction().commit();
			    
			} catch (Exception e) {
			    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			    if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			}
		}

		// entity debe estar en estado de "Managed"
		@Override
		public void delete(T entity) {
			em.getTransaction().begin();
			try {
			    em.remove(entity);
			    em.getTransaction().commit();
			} catch (Exception e) {
			    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			    if (em.getTransaction().isActive())
				em.getTransaction().rollback();
			}
		}
		
		
	    @Override
	    public void deleteBy(ID id) {
		T entity = this.read(id);
		if (entity != null)
		    this.delete(entity);
	    }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
	    @Override
	    public List<T> findAll() {
		em.getTransaction().begin();
		List<T> lista = null;
		try {
		    javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		    cq.select(cq.from(persistentClass));
		    lista = em.createQuery(cq).getResultList();
		    em.getTransaction().commit();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return lista;

	    }

}
