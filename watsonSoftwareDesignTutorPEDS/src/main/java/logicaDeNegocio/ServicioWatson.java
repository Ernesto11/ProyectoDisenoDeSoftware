package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public abstract class ServicioWatson {

    
	protected String pNombreUsuario;
	protected String pContrasena;
	
	public ServicioWatson(String pNombreUsuario, String pContrasena){
		this.pContrasena = pContrasena;
		this.pNombreUsuario = pNombreUsuario;
	}
	
}