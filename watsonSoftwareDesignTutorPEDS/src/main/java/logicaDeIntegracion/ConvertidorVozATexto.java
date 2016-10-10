package logicaDeIntegracion;

import java.io.File;

import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechModel;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;

public class ConvertidorVozATexto implements IVoz_Texto {
	
	private SpeechToText servicioVozATexto;
	private final static String NOMBREUSUARIO = "74aabeba-1f39-456b-abcb-05066b333b6a";
	private final static String CONTRASENA = "Zfw6dHNRTivE";
	
	public ConvertidorVozATexto(){
		servicioVozATexto =  new SpeechToText();
    	servicioVozATexto.setUsernameAndPassword(NOMBREUSUARIO,CONTRASENA);
	}
	public String convertirVozTexto(File pArchivo){
		
		RecognizeOptions opciones = new RecognizeOptions.Builder()
		.contentType("audio/wav")
		.model(SpeechModel.ES_ES_BROADBANDMODEL.getName())
		.continuous(true)
		.inactivityTimeout(500)
		.build();
	
		SpeechResults resultado = servicioVozATexto.recognize(pArchivo,opciones).execute();
	
		return resultado.toString();
	}
}
