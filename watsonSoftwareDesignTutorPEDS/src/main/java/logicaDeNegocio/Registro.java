package logicaDeNegocio;

import java.util.*;

import enlaceDeDatos.BaseDatos;

/**
 * 
 */
public class Registro {
	
    private String pregunta;
    private String[] respuestas;
    private String categoriaPregunta;
	

	
    public Registro(String pCategoriaPregunta,String pPregunta, String[] pRespuestas ) 
    {
    	categoriaPregunta = pCategoriaPregunta;
    	pregunta = pPregunta;
    	respuestas = pRespuestas;
    }
    
    public void realizarRegistro()
    {
    	BaseDatos registrar = new BaseDatos();
    	registrar.insertarDatos(categoriaPregunta, pregunta, respuestas);
    }

}