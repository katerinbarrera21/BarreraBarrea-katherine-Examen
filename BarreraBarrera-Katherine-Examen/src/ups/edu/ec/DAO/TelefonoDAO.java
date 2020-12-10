package ups.edu.ec.DAO;

import java.util.List;

import ups.edu.ec.Entidades.Telefono;

public interface  TelefonoDAO extends GenericDAO <Telefono, Integer> {
	
	public abstract List<Telefono> findByTelefonoNumeroAJAX(String numero);

	public abstract List<Telefono> findByUsuarioPorCedulaAJAX(String cedula);
}
