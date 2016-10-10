package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.google.appengine.api.blobstore.BlobInfo;
import com.google.appengine.api.blobstore.BlobKey;
import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;

import dto.DTO_Consulta;
import logicaDeNegocio.Voz;


/**
 * 
 */
/**
 * Servlet implementation class ServletConsulta
 */
@WebServlet(name = "ServletConsultaVoz", urlPatterns = {"/ServletConsultaVoz"})
@MultipartConfig
public class ServletConsultaVoz extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConsultaVoz() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public File crearArchivoWav(Part filepart, String rutaServidor) throws IOException{
 
    	File file = new File(rutaServidor+"archivo.wav");
    	OutputStream outFile = new FileOutputStream(file);
    	InputStream filecontent = filepart.getInputStream();

       int read = 0;
       byte[] bytes = new byte[1024];
    	while ((read = filecontent.read(bytes)) != -1) {
    	   outFile.write(bytes, 0, read);
    	}
    	
    	
    	return file;
    }
    
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	
    	
    	Part filePart = request.getPart("audioP");
    	File archivoWav = crearArchivoWav(filePart, request.getSession().getServletContext().getRealPath("/") );
    	
    	
    	DTO_Consulta nuevaConsulta = new DTO_Consulta();
    	
    	nuevaConsulta.setTipoConsulta("Voz");
    	nuevaConsulta.setPreguntaVoz(archivoWav);
    	Voz consultaVoz = (Voz)ControladorWeb.crearConsulta(nuevaConsulta);
    	nuevaConsulta.setRespuestas(consultaVoz.hacerConsulta());
    	nuevaConsulta.setPreguntaTexto(consultaVoz.getContenidoPregunta());
    	
        request.setAttribute("DTO_Consulta", nuevaConsulta);
        request.getRequestDispatcher("respuestaConsulta.jsp").forward(request, response);
  
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