package ups.edu.ec.DAO;

import java.util.List;

import ups.edu.ec.Entidades.Usuario;

public interface UsuarioDAO extends GenericDAO <Usuario, Integer> {

	Usuario findByUsuarioPorNombre(String nombre);
	
	public abstract Usuario findByUsuarioPorCedula(String cedula);

	public abstract List<Usuario> findByUsuarioPorCedulaAJAX(String cedula);

}
