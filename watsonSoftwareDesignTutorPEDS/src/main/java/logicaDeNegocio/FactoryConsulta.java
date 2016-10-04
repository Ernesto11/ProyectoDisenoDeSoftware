package logicaDeNegocio;


import dto.DTO_Consulta;

/**
 * 
 */
public class FactoryConsulta implements AbstractFactoryConsulta {

	
	
    public FactoryConsulta() {
    }

    public Voz crearConsultaPorVoz(DTO_Consulta pObjetoDTO) {
    	Voz nuevaConsultaPorVoz = new Voz(pObjetoDTO.getPreguntaVoz());
    	return nuevaConsultaPorVoz;
    }

    public Texto crearConsultaPorTexto(DTO_Consulta pObjetoDTO) {
    	Texto nuevaConsultaPorTexto = new Texto(pObjetoDTO.getPreguntaTexto());
    	nuevaConsultaPorTexto.setContenidoPregunta(pObjetoDTO.getPreguntaTexto());
    	return nuevaConsultaPorTexto;
    }

}