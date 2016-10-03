package logicaDeNegocio;

import java.io.File;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechModel;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;

/**
 * 
 */
public class VozATexto extends ServicioWatson {

	private SpeechToText servicioVozATexto;
	
    public VozATexto(String pNombreUsuario,String pContrasena) {
    	super(pNombreUsuario, pContrasena);
    	servicioVozATexto =  new SpeechToText();
    	servicioVozATexto.setUsernameAndPassword(pNombreUsuario, pContrasena);
    }
    public String convertirVozTexto(File pArchivo){
		
		RecognizeOptions opciones = new RecognizeOptions.Builder()
			.contentType("audio/flac")
			.model(SpeechModel.ES_ES_BROADBANDMODEL.getName())
			.continuous(true)
			.inactivityTimeout(500)
			.build();
		
		SpeechResults resultado = servicioVozATexto.recognize(pArchivo,opciones).execute();
		
		return resultado.toString();
		
	}
   
}