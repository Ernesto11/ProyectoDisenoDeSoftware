package logicaDeNegocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import dto.DTO_Documento;

/**
 * Esta super clase permite crear objetos de tipo Documento
 * @author PEDS_ATI
 *
 */
public abstract class Documento {
	
	protected String titulo;
	protected String contenido;
	protected Date fechaCreacion;
	protected String tipoDocumento;
	private String autor;
	
	
	/**
	 * Este es el constructor de la clase y recibe un DTO_Documento con los atributos
	 * necesarios para crear el Documento
	 */
	public Documento(DTO_Documento DTO_nuevoDocumento)
	{	
		autor = DTO_nuevoDocumento.getAutor();
		contenido = DTO_nuevoDocumento.getContenido();
		tipoDocumento = DTO_nuevoDocumento.getTipoDocumento();
		setFechaCreacion();
		titulo = autor+"  |  "+getFechaCreacion();
		
	}
	
	/**
	 * Este método permite obtener la fecha de creación de un documento con el
	 * formato día/mes/año
	 */
	public String getFechaCreacion(){
		SimpleDateFormat mascara = new SimpleDateFormat("dd/MM/yy");
		return mascara.format(fechaCreacion);
	}
	
	/**
	 * Permite establecer la fecha de creación del documento
	 * Dicha fecha es obtenida del sistema
	 */
	public void setFechaCreacion(){
		Calendar calendario;
		calendario = Calendar.getInstance();
		fechaCreacion = calendario.getTime();
	}
	
	/**
	 * Permite obtener el autor del documento
	 * @return autor es un string con el nombre del autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Permite obtener el título que llevará el documento
	 * @return  titulo es un string que se compone del nombre del autor y la fecha de creación
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Este método permite obtener el contenido del documeno
	 * @return contenido es un string con el texto del documento
	 */
	public String getContenido() {
		return contenido;
	}
	
	/*public String traducirAIngles(String pTexto)
	{
	
	}*/
	
}
