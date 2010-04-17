package br.iteratorsystems.cps.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.model.SelectItem;
import br.iteratorsystems.cps.enums.EEstados;
import br.iteratorsystems.cps.exceptions.FindAddressException;

public class FindAddress {

	protected String logradouro;
	protected String bairro;
	protected String cidade;
	protected String pais;
	protected String estado;

	private static final String baseUrl = "http://www.buscarcep.com.br/index.php";
	private static final String CHAVE = "1Maco/svVvWvqJ1sNk5prmVd9kbaK7";

	// public SelectItem[] getTodosEstados(){
	// EEstados[] ee = EEstados.values();
	// SelectItem[] items = new SelectItem[ee.length];
	//		
	// for(int i = 0; i< EEstados.values().length;i++){
	// items[i] = new SelectItem(ee[i],this.formataEstado(ee[i].getNome()));
	// }
	//		
	// return items;
	// }
	
	private void findByWebService(String cep) throws FindAddressException{
		HttpURLConnection connection = null;
		StringBuilder incomingData = null;
		StringBuilder finalUrl = new StringBuilder(baseUrl);
		finalUrl.append("?cep=" + cep);
		finalUrl.append("&formato=xml");
		finalUrl.append("&chave=" + CHAVE);

		try {
			URL url = new URL(finalUrl.toString());
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("Request-Method", "GET");

			connection.setDoInput(true);
			connection.setDoOutput(false);

			// this.createProxy(connection);

			connection.connect();
		} catch (Exception e) {
			throw new FindAddressException(e);
		}

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			incomingData = new StringBuilder();
			String s;
			while ((s = br.readLine()) != null) {
				incomingData.append(s);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Pattern p = Pattern.compile("<.*?>");
		Matcher m = p.matcher(incomingData.toString());
		String semHtml = m.replaceAll(" ");
		String[] resultado = semHtml.split("  ");
		
		if(resultado.length==5){
			throw new FindAddressException("Limite de buscas execedidas");
		}
		
		if(resultado.length==8){
			throw new FindAddressException("CEP não encontrado");
		}

		this.setEstado(this.recuperaEstado(resultado[3]));
		this.setCidade(resultado[4]);
		this.setBairro(resultado[5]);
		this.setLogradouro(resultado[6] + " " + resultado[7]);
	}

	public void find(String cep) {
		try{
			this.findByWebService(cep);
			return;
		}catch (FindAddressException e) {
			if(e.getMessage().contains("CEP")){
				FacesUtil.errorMessage("",Resources.getErrorProperties().getString("cep_unknown"),"cep nao encontrado");
			}
		}
		
		this.findByDataBase(cep);
	}

	//implementar pois o webservice pode estar fora do ar!
	private void findByDataBase(String cep) {
		System.out.println("find by database");
		//TODO
	}

	// método utilizado para burlar o proxy na USJT! hahaha
	private void createProxy(HttpURLConnection connection) {
		// Configure proxy ...
		System.setProperty("http.proxySet", "true");
		System.setProperty("http.proxyHost", "10.0.0.1");
		System.setProperty("http.proxyPort", "3128");
		System.setProperty("http.proxyType", "4");
		String proxyUser = "200711190";
		String proxyPassword = "7104";

		// seta o usuário e senha
		connection.setRequestProperty("Proxy-Authorization", "Basic "
				+ new sun.misc.BASE64Encoder()
						.encode((proxyUser + ":" + proxyPassword).getBytes()));
	}

	private String recuperaEstado(String... estado) {
		String result = null;
		try {
			EEstados e = EEstados.valueOf(estado[0].toString().toUpperCase());
			result = e.getNome();
		} catch (IllegalArgumentException e) {
			result = "erro: " + e;
		}
		result = this.formataEstado(result);
		return result;
	}

	private String formataEstado(String antigo) {
		String[] formatado = antigo.split("_");
		String result = null;

		if (formatado.length == 1)
			return formatado[0];

		result = formatado.length == 2 ? formatado[0] + " " + formatado[1]
				: result;
		result = formatado.length == 3 ? formatado[0] + " " + formatado[1]
				+ " " + formatado[2] : result;
		result = formatado.length == 4 ? formatado[0] + " " + formatado[1]
				+ " " + formatado[2] + " " + formatado[3] : result;

		return result;
	}

	/**
	 * @return the rua
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @param rua
	 *            the rua to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro
	 *            the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * @param cidade
	 *            the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais
	 *            the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
