package logicaDePresentacion;

import java.util.ArrayList;
import java.util.List;







import dto.DTO_Consulta;
import enlaceDeDatos.BaseDatos;
import logicaDeNegocio.Consulta;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.FactoryServicios;
import logicaDeNegocio.Texto;


public class Principal {

	public static void main(String[] args) {
		
	System.out.println("nanito");
		
	DTO_Consulta dto = new DTO_Consulta();
	dto.setPreguntaTexto("que es un atributo");
	
	FactoryConsulta fc = new FactoryConsulta();
	
	
	FactoryServicios sc = new FactoryServicios();
	System.out.println(sc.crearServicioTraducir().traducirEspañolIngles("mi nombres es Daniel"));
	System.out.println(sc.crearServicioConversacion().consultarPregunta(fc.crearConsultaPorTexto(dto).getContenidoPregunta()));
	}

}
