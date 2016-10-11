package logicaDeIntegracion;

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
 * Clase que se encarga de conectarse con el servicio de watson, para convertir un archivo de formato wav o flac a texto
 * @author PEDS
 * @version 1.0
 */
public class ConvertidorVozATexto implements IVoz_Texto {
	
	private SpeechToText servicioVozATexto;
	private final static String NOMBREUSUARIO = "74aabeba-1f39-456b-abcb-05066b333b6a";
	private final static String CONTRASENA = "Zfw6dHNRTivE";
	
	/**
	 * Constructor de la clase.
	 */
	public ConvertidorVozATexto()
	{
		servicioVozATexto =  new SpeechToText();
    	servicioVozATexto.setUsernameAndPassword(NOMBREUSUARIO,CONTRASENA);
	}
	
	/**
	 * Convierte un archivo de formato wav a texto.
	 * @param archivo wav
	 * @return String texto.
	 */
	public String convertirVozTexto(File pArchivo)
	{
		
		RecognizeOptions opciones = new RecognizeOptions.Builder()
		.contentType("audio/wav")
		.model(SpeechModel.ES_ES_BROADBANDMODEL.getName())
		.continuous(true)
		.inactivityTimeout(500)
		.build();
	
		SpeechResults resultado = servicioVozATexto.recognize(pArchivo,opciones).execute();
	
		return obtenerPreguntaTexto(resultado.toString());
	}
	
	/**
	 * Procesa el Json retornado por el servicio de watson para obtener la respuesta
	 * @param pResultado
	 * @return texto.
	 */
	
    private String obtenerPreguntaTexto(String pResultado)
    {
        
    	JsonElement jelement = new JsonParser().parse(pResultado);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("results");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray2 = jobject.getAsJsonArray("alternatives");
	    jelement = jarray2.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("transcript").toString();
	    respuesta = respuesta.substring(1, respuesta.length()-2).toString();
	    return respuesta;
    }
}
