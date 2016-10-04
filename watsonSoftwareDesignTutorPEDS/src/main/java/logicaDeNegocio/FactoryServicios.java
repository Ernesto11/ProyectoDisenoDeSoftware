package logicaDeNegocio;



import logicaDeIntegracion.Conversacion;
import logicaDeIntegracion.Traducir;
import logicaDeIntegracion.VozATexto;

/**
 * 
 */
public class FactoryServicios implements AbstractFactoryServicios {

    /**
     * Default constructor
     */
    public FactoryServicios() {
    }

    
    public Conversacion crearServicioConversacion() {
        Conversacion servicioConversacionCreado = new Conversacion("8a14fea8-d65d-4a6e-b0e8-021cce7273cb","ue4A3US7D8Pr");
        return servicioConversacionCreado;
    }

    /**
     * 
     */
    public Traducir crearServicioTraducir() {
    	Traducir servicioConversacionCreado = new Traducir("11e3e5eb-5665-466a-9891-b09fb25f50bb","BGIGbBhCCFgx");
        return servicioConversacionCreado;
    }

    /**
     * 
     */
    public VozATexto crearServicioVozATexto() {
    	VozATexto servicioVozATextoCreado = new VozATexto("74aabeba-1f39-456b-abcb-05066b333b6a","Zfw6dHNRTivE");
         return servicioVozATextoCreado;
    }

  

}