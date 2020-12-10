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
 * Servlet implementation class listarUsarioNumero
 */
@WebServlet("/listarUsarioNumero")
public class listarUsarioNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarUsarioNumero() {
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
		String numeroTel =  request.getParameter("infoBusca");	
		List<Telefono> telefonos = DAOFactory.getFactory().getTelefonoDAO().findByTelefonoNumeroAJAX(numeroTel);
		

		System.out.print("ESTOY EN EL SERVLET DE Listar Usuario numero "+numeroTel);
		
	
	
	
	
		System.out.println("Cantidad de telefonos del usuario: "+telefonos.size());
		String tablaDatos="";
		String tablaIndex = "<table class='tg' id='tablaBuscar' style='width:60%'>"+
				"<tr>"+
					"<th class='tg-46ru'>Nombre y Apellido</th>"+
					"<th class='tg-46ru'>Cedula</th>"+
					"<th class='tg-46ru'>Email</th>"+
					"<th class='tg-46ru'>Telefono</th>"+
					"<th class='tg-46ru'>Tipo</th>"+
					"<th class='tg-46ru'>Operadora</th>"+
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
