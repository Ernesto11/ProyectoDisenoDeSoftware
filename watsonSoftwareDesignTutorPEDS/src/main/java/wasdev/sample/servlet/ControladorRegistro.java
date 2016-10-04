package wasdev.sample.servlet;


import java.io.IOException;

import dto.DTO_Registro;
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
/**
 * Servlet implementation class ServletConsulta
 */
@WebServlet(name = "ControladorRegistro", urlPatterns = {"/ControladorRegistro"})
public class ControladorRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FactoryRegistro registro;    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorRegistro() {
        super();
        registro = new FactoryRegistro(); 
        // TODO Auto-generated constructor stub
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	String pregunta = request.getParameter("pregunta").toString();
    	String categoria = request.getParameter("tipo").toString();
    	String[] respuestas = request.getParameterValues("respuestas");
    	
    	if(pregunta =="" || respuestas ==null)
    	{
    		RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
            dispatcher.forward( request, response );
    	}
    	else{
    		DTO_Registro nuevoRegistro = new DTO_Registro();
    		nuevoRegistro.setCategoria(categoria);
    		nuevoRegistro.setPregunta(pregunta);
    		nuevoRegistro.setRespuestas(respuestas);
    		registro.crearRegistro(nuevoRegistro).realizarRegistro();
            request.setAttribute("DTO_Registro", nuevoRegistro);
            request.getRequestDispatcher("respuestaRegistro.jsp").forward(request, response);
    		
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
