package logicaDeNegocio;

import dto.DTO_Pregunta;

public class FactoryPregunta {
	
	public static Pregunta crearPregunta(DTO_Pregunta DTO_nuevaPregunta){
		
		Pregunta nuevaPregunta = new Pregunta(DTO_nuevaPregunta);
		return nuevaPregunta;
	}

}
