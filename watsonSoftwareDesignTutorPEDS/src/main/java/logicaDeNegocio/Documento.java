package logicaDeNegocio;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * 
 */
public abstract class Documento implements Traducible {
	
	protected String titulo;
	protected Date fechaCreacion;
	protected String fuenteDeDatos;
	protected String rutaDeGuardado;
	protected String contenido;
	
    /**
     * Default constructor
     */
    public Documento(String pFuenteDeDatos, String pContenido, String pRutaDeGuardado) {
    	
    	fuenteDeDatos = pFuenteDeDatos; 
		contenido = pContenido;
		rutaDeGuardado = pRutaDeGuardado;
		setFechaDeCreacion();
		setTitulo();
    }
    
	public void setFechaDeCreacion()
	{
		Calendar calendario;
		calendario = Calendar.getInstance();
		fechaCreacion = calendario.getTime();
	}
	
	public String getFechaDeCreacion(){
		SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
		return mascara.format(fechaCreacion);
	}
	
	public void setTitulo()
	{
		titulo = "Preguntas y respuestas de: " + fuenteDeDatos;
		titulo += "  || Fecha de creación: " + getFechaDeCreacion();
	}
	
	public String getRutaDeGuardado()
	{
		return rutaDeGuardado;
	}
	
 
    /**
     * @return
     */
    public abstract void generarArchivo();

    /**
     * @param pTexto 
     * @return
     */
    public String traducirAIngles(String pTexto)
    {
    	return "";
    }
    

	

}