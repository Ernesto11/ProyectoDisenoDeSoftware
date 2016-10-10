package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.DTO_Consulta;
import logicaDeNegocio.Voz;

/**
 * Servlet implementation class ServletTraducir
 */
@WebServlet(name = "ServletTraducir", urlPatterns = {"/ServletTraducir"})
@MultipartConfig
public class ServletTraducir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTraducir() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
    	
    	String pregunta = request.getParameter("pregunta");
    	String respuestas =  request.getParameter("respuestas");
    	
    	String preguntaIngles = ControladorWeb.solicitudTraducirAIngles(pregunta);
    	String respuestaIngles = ControladorWeb.solicitudTraducirAIngles(respuestas);
    	
 	    DTO_Consulta nuevaConsulta = new DTO_Consulta();
    	
    	nuevaConsulta.getRespuestas().add(respuestaIngles);
    	nuevaConsulta.setPreguntaTexto(preguntaIngles);
    	
    	
    	
        request.setAttribute("DTO_Consulta", nuevaConsulta);
        request.getRequestDispatcher("respuestaConsulta.jsp").forward(request, response);
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
