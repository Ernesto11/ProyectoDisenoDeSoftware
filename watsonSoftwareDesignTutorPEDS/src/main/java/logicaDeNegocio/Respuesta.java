package logicaDeNegocio;

/**
 * 
 */
public class Respuesta {

	private String respuesta;
	private String estado;
    /**
     * Default constructor
     */
    public Respuesta(String pRespuesta) 
    {
    	respuesta = pRespuesta;
    }
    
	public String getEstado() 
	{
		return estado;
	}
	
	public void setEstado(String pEstado)
	{
		this.estado = pEstado;
	}
	
	public String getRespuesta() 
	{
		return respuesta;
	}
    
    
    
}