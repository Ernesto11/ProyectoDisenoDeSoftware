package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class PDF extends Documento {

	public PDF(String pFuenteDeDatos, String pContenido, String pRutaDeGuardado){
		super(pFuenteDeDatos, pContenido, pRutaDeGuardado);
		generarArchivo();
	}
	
	public void generarArchivo()
	{
		/**try{
			
			FileOutputStream archivo = new FileOutputStream(getRutaDeGuardado()+".pdf");
			Document nuevoDocumento = new Document();
			PdfWriter.getInstance(nuevoDocumento, archivo);
			nuevoDocumento.open();
			nuevoDocumento.add(new Paragraph(titulo+"\n\n"+contenido));
			nuevoDocumento.close();
		}catch(Exception e)
		{
			//MOSTRAR MENSAJE DE ERROR, PERO EN LA CAPA DE PRESENTACION
		}**/
	}

}