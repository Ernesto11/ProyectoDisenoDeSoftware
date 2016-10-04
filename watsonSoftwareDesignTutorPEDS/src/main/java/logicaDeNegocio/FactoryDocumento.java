package logicaDeNegocio;



import dto.DTO_Documento;


public class FactoryDocumento implements AbstractFactoryDocumento {

    
    public FactoryDocumento() {
    }

   
    public PDF crearPDF(DTO_Documento pDocumento) {
        PDF archivoPDF = new PDF(pDocumento.getFuenteDeDatos(),pDocumento.getContenido(),pDocumento.getRutaGuardado());
        archivoPDF.generarArchivo();
        return archivoPDF;
    }

    
    public TXT crearTXT(DTO_Documento pDocumento) {
    	TXT archivoTXT = new TXT(pDocumento.getFuenteDeDatos(),pDocumento.getContenido(),pDocumento.getRutaGuardado());
        archivoTXT.generarArchivo();
        return archivoTXT;
    }


}