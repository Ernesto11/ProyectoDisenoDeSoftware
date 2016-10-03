package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class TXT extends Documento {

	public TXT (String pFuenteDeDatos, String pContenido, String pRutaDeGuardado){
		super(pFuenteDeDatos, pContenido, pRutaDeGuardado);
		generarArchivo();
	}
	
	public void generarArchivo()
	{
		/**try{
			File archivo = new File(rutaDeGuardado+".txt");
			BufferedWriter bufferEscritura;
			bufferEscritura= new BufferedWriter(new FileWriter(archivo));
			bufferEscritura.write(titulo);
			bufferEscritura.newLine();
			bufferEscritura.newLine();
			bufferEscritura.write(contenido);
			bufferEscritura.close();
		
		}catch(Exception e)
		{
			//MOSTRAR MENSAJE DE ERROR, PERO EN LA CAPA DE PRESENTACION
		}**/
	}

}