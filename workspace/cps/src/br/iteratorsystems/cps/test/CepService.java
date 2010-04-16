package br.iteratorsystems.cps.test;
/*
 *@Author 
 * Eduardo Hiroshi Campos Tamaki
 * edhiroshi86@yahoo.com.br
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CepService {

	public static void main(String[] args) {


		// Define o CEP
		String cep = JOptionPane.showInputDialog(null,"Informe o CEP");
		
		// String da url		
		String urlString = "http://www.buscarcep.com.br/index.php";

		// Parametros a serem enviados
		Properties parameters = new Properties();
		parameters.setProperty("cep", cep);
		parameters.setProperty("formato", "xml");

		// Iterador
		Iterator i = parameters.keySet().iterator();
		// Contador
		int counter = 0;

		// Enquanto ainda existir parametros
		while (i.hasNext()) {

			// Nome
			String name = (String) i.next();
			// Valor
			String value = parameters.getProperty(name);

			// Adiciona com um conector (? ou &)
			// Separa a url por ?, e as variáveis com &
			urlString += (++counter == 1 ? "?" : "&") + name + "=" + value;
			
		}

		try {
			// Objeto URL
			URL url = new URL(urlString);

			// Objeto HttpURLConnection
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			// Método
			connection.setRequestProperty("Request-Method", "GET");

			// Váariavel do resultado
			connection.setDoInput(true);
			connection.setDoOutput(false);

			// Faz a conexão
			connection.connect();

			// Abre a conexão
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			// Lê a conexão
			StringBuffer newData = new StringBuffer();
			String s = "";
			while (null != ((s = br.readLine()))) {
				newData.append(s);
			}
			br.close();

                        String comHtml = new String(newData);
                        Pattern p = Pattern.compile("<.*?>");
                        Matcher m = p.matcher(comHtml);
                        String semHtml = m.replaceAll(" ");
                        String endereco[] = semHtml.split("  ");

                        for(String ss:endereco){
                        	System.out.println(ss);
                        }
                        System.exit(0);
                        try {
                        System.out.println(endereco[2]);
                        }
                         catch(Exception e){
                        
                        }
                        try{
                        System.out.println(endereco[3]);
                        }
                         catch(Exception e){
                             
                        
                         }
                         try{
                        System.out.println(endereco[4]);
                         }
                         catch(Exception e){
                        }
                          try{
                        System.out.println(endereco[5]);
                          } 
                        catch(Exception e){
                        }
                          try{
                         System.out.println(endereco[6]);
                          }
                         catch(Exception e){
                        }
                         try{
                        	 System.out.println(endereco[7]);
                         }catch (Exception e) {
						}
                          try{
                        System.out.println(endereco[6]);
                        String end ="CEP: " +endereco[2]+"\nEstado: "+endereco[3]+"\nCidade: "+endereco[4]+"\nBairro: "+endereco[5]+"\nLogradouro: "+endereco[6]+" "+endereco[7];
                        JOptionPane.showMessageDialog(null,end);
                          } 
                        catch(Exception e){
                            JOptionPane.showMessageDialog(null,"CEP não consta no banco de dados");
                        }


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
