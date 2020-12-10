package ups.edu.ec.Controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.DAO.DAOFactory;
import ups.edu.ec.DAO.OperadorasDAO;
import ups.edu.ec.DAO.TipoTelefonoDAO;
import ups.edu.ec.Entidades.Operadoras;
import ups.edu.ec.Entidades.TipoTelefono;

/**
 * Servlet implementation class CargaDatosTipOpe
 */
@WebServlet("/CargaDatosTipOpe")
public class CargaDatosTipOpe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TipoTelefonoDAO tipTel;
	private OperadorasDAO ope;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CargaDatosTipOpe() {
       // super();
        // TODO Auto-generated constructor stub
    	tipTel = DAOFactory.getFactory().getTipoTelefonoDAO();
    	ope = DAOFactory.getFactory().getOperadorasDao();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String out = "en servelet de ope y tip existentes";
		List<Operadoras> op_tod;
		List<TipoTelefono> tipo;
		
		Operadoras operadora;
		TipoTelefono tip;
		
		try {
			op_tod = DAOFactory.getFactory().getOperadorasDao().findAll();
			tipo = DAOFactory.getFactory().getTipoTelefonoDAO().findAll();
			
			// imprime op y tip
			
			System.out.println("OP??===" + op_tod);
			System.out.println("TIPPO??=== "+tipo);
			
			
		}catch (Exception e) {
			// TODO: handle exception
			op_tod = null;
			tipo = null;
		}
		
		
		if (op_tod == null) {
			System.out.println("CREAAAAAR OP");
			operadora = new Operadoras(0, "Movistar");
			DAOFactory.getFactory().getOperadorasDao().create(operadora);
			operadora = new Operadoras(0, "Claro");
			DAOFactory.getFactory().getOperadorasDao().create(operadora);
			operadora = new Operadoras(0, "CNT");
			DAOFactory.getFactory().getOperadorasDao().create(operadora);
			op_tod = DAOFactory.getFactory().getOperadorasDao().findAll();
		}
		
		if (tipo == null) {
			tip = new TipoTelefono(0, "Celular");
			DAOFactory.getFactory().getTipoTelefonoDAO().create(tip);
			tip = new TipoTelefono(0, "Convencional");
			DAOFactory.getFactory().getTipoTelefonoDAO().create(tip);
			tipo = DAOFactory.getFactory().getTipoTelefonoDAO().findAll();
			
		}
		
		String url = "/jsp/crearUsuario.jsp";
		request.setAttribute("operadoras", op_tod);
		request.setAttribute("tipoTelefono", tipo);
		request.getRequestDispatcher(url).forward(request, response);
	
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(out);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
	}

}
