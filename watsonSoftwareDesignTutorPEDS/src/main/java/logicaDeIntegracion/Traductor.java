package logicaDeIntegracion;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;

public class Traductor implements ITraductor {

	private LanguageTranslation servicioTraducir;
	private final static String NOMBREUSUARIO = "11e3e5eb-5665-466a-9891-b09fb25f50bb";
	private final static String CONTRASENA = "BGIGbBhCCFgx";
	
	public Traductor(){
		servicioTraducir =  new LanguageTranslation();
		servicioTraducir.setUsernameAndPassword(NOMBREUSUARIO, CONTRASENA);
	}
	public String traducirEspañolIngles(String pTexto){
		TranslationResult resultadoTraduccion = servicioTraducir.translate(pTexto,Language.SPANISH,Language.ENGLISH).execute();
	    return obtenerRespuesta(resultadoTraduccion.toString());
	}
	private String obtenerRespuesta(String pRespuesta){
		JsonElement jelement = new JsonParser().parse(pRespuesta);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("translations");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("translation").toString();  
	    return respuesta.replace('"', ' ');
		
	}
}
