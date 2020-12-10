package ups.edu.ec.Controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ups.edu.ec.DAO.DAOFactory;
import ups.edu.ec.Entidades.Telefono;

/**
 * Servlet implementation class listarUsuarioCedula
 */
@WebServlet("/listarUsuarioCedula")
public class listarUsuarioCedula extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarUsuarioCedula() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String cedula =  request.getParameter("infoBusca");
		System.out.print("ESTOY EN EL SERVLET DE Listar Usuario Cedula "+cedula);
		
	
		List<Telefono> telefonos = DAOFactory.getFactory().getTelefonoDAO().findByUsuarioPorCedulaAJAX(cedula);
	
	
		System.out.println("Cantidad de telefonos del usuario: "+telefonos.size());
		String tablaDatos="";
		String tablaIndex = "<table class='tg' id='tablaBuscar' style='width:60%'>"+
				"<tr>"+
					"<th class='tg-46ru'>Nombre del Usuario</th>"+
					"<th class='tg-46ru'>Cedula del Usuario</th>"+
					"<th class='tg-46ru'>Correo del Usuario</th>"+
					"<th class='tg-46ru'>Telefono del Usuario</th>"+
					"<th class='tg-46ru'>Tipo de telefono</th>"+
					"<th class='tg-46ru'>Operadora del telefono</th>"+
				"</tr>";
		
		
		if(telefonos !=null){
			
			for (int i=0;i<telefonos.size();i++){
				Telefono tf = telefonos.get(i);
				
					
					tablaDatos = tablaDatos + "<tr>"+
							"<td>"+tf.getUsu_tel().getNombre()+" "+tf.getUsu_tel().getApellido()+"</td>"+
							"<td>"+tf.getUsu_tel().getCedula()+"</td>"+
							"<td>"+tf.getUsu_tel().getCorreo()+"</td>"+
							"<td>"+tf.getNumero()+"</td>"+
							"<td>"+tf.getOpe_tel().getOpeNombre()+"</td>"+
							"<td>"+tf.getTipo_tel().getTipo()+"</td>"+
							"</tr>";	
			}
			
			tablaDatos = tablaDatos + "</table> ";
				
		}
		
		tablaIndex = tablaIndex + tablaDatos;
		out.print(tablaIndex);
		response.setCharacterEncoding("UTF-8");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
