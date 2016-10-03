package logicaDeNegocio;

import java.util.*;

import com.ibm.watson.developer_cloud.conversation.v1.ConversationService;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageRequest;
import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

/**
 * 
 */
public class Conversacion extends ServicioWatson {

	private ConversationService servicioConversacion;
	
	public Conversacion(String pNombreUsuario,String pContrasena) {
		super(pNombreUsuario, pContrasena);
		servicioConversacion =  new ConversationService(ConversationService.VERSION_DATE_2016_07_11);
		servicioConversacion.setUsernameAndPassword(pNombreUsuario, pContrasena);
	}
	
	public String consultarPregunta(String pPregunta)
	{

	    MessageRequest nuevoMensaje = new MessageRequest.Builder().inputText(pPregunta).build();  
	    MessageResponse respuesta = servicioConversacion.message("92a995c1-6ec0-454f-a515-e4243b2b13c2", nuevoMensaje).execute();
	    return respuesta.toString();

	}

}