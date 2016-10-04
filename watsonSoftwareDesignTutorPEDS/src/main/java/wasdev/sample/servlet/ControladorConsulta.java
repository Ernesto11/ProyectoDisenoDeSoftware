package wasdev.sample.servlet;

import java.io.IOException;
import java.util.ArrayList;

import dto.DTO_Consulta;
import dto.DTO_Registro;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.FactoryRegistro;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
@WebServlet(name = "ControladorConsulta", urlPatterns = {"/ControladorConsulta"})
public class ControladorConsulta extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;
	FactoryConsulta consulta;
    /**
     * Default constructor
     */
    public ControladorConsulta() {
        super();
        consulta = new FactoryConsulta(); 
        // TODO Auto-generated constructor stub
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	String pregunta = request.getParameter("pregunta").toString();
    	if(pregunta =="")
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward( request, response );
    	}
    	else
    	{
    		DTO_Consulta consulta = new DTO_Consulta();
    		consulta.setPreguntaTexto(pregunta);
    		FactoryConsulta familiaConsulta = new FactoryConsulta();
    		ArrayList<String> respuestas =  familiaConsulta.crearConsultaPorTexto(consulta).hacerConsulta();
    		consulta.setRespuestas(respuestas);
            request.setAttribute("DTO_Consulta", consulta);
            request.getRequestDispatcher("respuestaConsulta.jsp").forward(request, response);
    	}
    }
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold

}


