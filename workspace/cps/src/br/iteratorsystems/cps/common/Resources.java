package br.iteratorsystems.cps.common;

import java.util.ResourceBundle;

/**
 * Classe usada para retornar ResourceBundle (arquivos .properties)
 */
public final class Resources {
	
	public static final String ERROS_PROPERTIES = "Erros";	
	//public static final String APPLICATION_MESSAGES = "ApplicationMessages";
	public static final String FACES_RESOURCES = "FacesResources";
	
	/**
	 * Método reponsável por retornar o arquivo properties contendo os erros do sistema
	 * 
	 * @return ResourceBundle do Erros.properties
	 */
	public static ResourceBundle getErrorProperties() {
		return ResourceBundle.getBundle(ERROS_PROPERTIES);
	}
	
	/**
	 * Método reponsável por retornar o arquivo properties contendo as mensagens do sistema
	 * 
	 * @return ResourceBundle do ApplicationMessages.properties
	 */
//	public static ResourceBundle getApplicationProperties() {
//		return ResourceBundle.getBundle(APPLICATION_MESSAGES);
//	}
	
	/**
	 * Método reponsável por retornar o arquivo properties contendo as mensagens do Faces
	 * @return ResourceBundle do FacesResources.properties
	 */
	public static ResourceBundle getFacesResources(){
		return ResourceBundle.getBundle(FACES_RESOURCES);
	}
}
