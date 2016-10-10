package logicaDeNegocio;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;

import dto.DTO_Documento;

/**
 * Esta clase crea objetos de tipo PDF
 * @author PEDS_ATI
 *
 */
public class PDF extends Documento{
	
	private  Font formatoFuenteTitulo;
	private Rectangle tamanoPagina;
	
	
	/**
	 * Es el constructor de la clase PDF
	 * @param DTO_nuevoDocumento es el objeto que contiene todos los atributos necesarios para
	 * crear el PDF. La mayor�a de atributos los posee la super clase Documento.
	 */
	public PDF(DTO_Documento DTO_nuevoDocumento ){
		super(DTO_nuevoDocumento);
		formatoFuenteTitulo = new Font(FontFamily.TIMES_ROMAN, 18, Font.BOLD, new BaseColor(0, 0, 0)); 
		tamanoPagina = DTO_nuevoDocumento.getTamanoPagina();
		
	}

	/**
	 * Permite obtener el formato de la fuente que se aplicar� al t�tulo del pdf
	 * @return formatoFuenteTitulo contiene las caracter�sticas del formato de la fuente
	 */
	public Font getFormatoFuenteTitulo() {
		return formatoFuenteTitulo;
	}

	/**
	 * Obtiene el tama�o de la p�gina del pdf, por ejemplo tama�o carta
	 * @return tama�oPagina es el tama�o que tendr�n las p�ginas del pdf.
	 */
	public Rectangle getTamanoPagina() {
		return tamanoPagina;
	}	
}
