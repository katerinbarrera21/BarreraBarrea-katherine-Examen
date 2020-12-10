package ups.edu.ec.DAO;

import java.util.ArrayList;
import java.util.List;

public interface GenericDAO<T, ID> {
    
    public void createTable();
	public void create(T entity);
	public T read (ID id);
	public void update(T entety);
	public void delete(T entity);
	public void deleteBy(ID id);
	public List<T> findAll();
	
}
