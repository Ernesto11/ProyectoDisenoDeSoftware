package logicaDeNegocio;

import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translation.v2.model.TranslationResult;


public class Traducir extends ServicioWatson {

	LanguageTranslation servicioTraducir;
	
    public Traducir() {
    	super("11e3e5eb-5665-466a-9891-b09fb25f50bb","BGIGbBhCCFgx");
    	servicioTraducir =  new LanguageTranslation();
		servicioTraducir.setUsernameAndPassword(pNombreUsuario, pContrasena);
    }
    public String traducirEspañolIngles(String pTexto)
	{
	    TranslationResult resultadoTraduccion = servicioTraducir.translate(pTexto,Language.SPANISH,Language.ENGLISH).execute();
	    return obtenerRespuesta(resultadoTraduccion.toString());
	}
    public String obtenerRespuesta(String pRespuesta)
	{
		
	    JsonElement jelement = new JsonParser().parse(pRespuesta);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("translations");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("translation").toString();  
	    return respuesta;

	}
}