package logicaDeIntegracion;


/**
 * Clase de patrón creacional Factory Simple.
 * @author PEDS
 * @version 1.0
 */
public class FactoryConversacion {
	
	/**
	 * Crea un nuevo objeto de tipo Conversacion.
	 * @return Conversacion.
	 */
	public static Conversacion crearConversacion()
	{
		Conversacion nuevaConversacion = new Conversacion();
		return nuevaConversacion;
		
	}

}
