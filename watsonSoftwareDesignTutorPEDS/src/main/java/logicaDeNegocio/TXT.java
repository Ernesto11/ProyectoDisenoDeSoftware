package logicaDeNegocio;

import dto.DTO_Documento;

/**
 * esta clase permite crear objetos de tipo .txt
 * @author PEDS_ATI
 *
 */
public class TXT extends Documento{

	/**
	 * Este es el constructor que permite crear los objetos TXT
	 * @param DTO_nuevoDocumento es el objeto que contiene todos los atributos necesarios
	 * para crear el objeto TXT, pero como éste no posee atributo entonces solo se utiliza en
	 * la super clase.
	 */
	public TXT(DTO_Documento DTO_nuevoDocumento )
	{
		super(DTO_nuevoDocumento);
	};
	

}
