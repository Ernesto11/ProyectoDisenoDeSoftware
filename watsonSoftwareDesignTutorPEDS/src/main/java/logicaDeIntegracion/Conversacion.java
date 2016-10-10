package logicaDeIntegracion;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrInputDocument;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ibm.watson.developer_cloud.retrieve_and_rank.v1.RetrieveAndRank;


public class Conversacion implements IConversacion {
	
	   private static final String NOMBREUSUARIO = "dcc5c372-f424-4e2e-8e62-4bb3a22d7e5a";
	   private static final String CONTRASENA = "cwZEYKZL7CyR";
	    private static final String CLUSTERNAME = "WATSONTUTORDISENO"; //puede ser directa
	    private static final String CLUSTERID = "sc26b9c1af_fa9b_4aa2_9e50_7def90c67f9f";

	   private static final String CONFIGURATIONNAME = "WATSONTUTOR";
	   private static final String COLLECTIONNAME = "WATSONTUTORDISENO";
	   private static RetrieveAndRank service;
	   private static SolrClient solrClient;
	   
	   
	   //Constructor de la clase.
	   public Conversacion()
	   {
		   service = new RetrieveAndRank();
		   service.setUsernameAndPassword(NOMBREUSUARIO, CONTRASENA);
	   }
	   

	   private static HttpSolrClient getSolrClient(String uri)
	   {
			return new HttpSolrClient(service.getSolrUrl(CLUSTERID), createHttpClient(uri));
	   }

	   private static HttpClient createHttpClient(String uri) {
		   final URI scopeUri = URI.create(uri);

			final BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
			credentialsProvider.setCredentials(new AuthScope(scopeUri.getHost(), scopeUri.getPort()),
				new UsernamePasswordCredentials(NOMBREUSUARIO, CONTRASENA));

			final HttpClientBuilder builder = HttpClientBuilder.create().setMaxConnTotal(128).setMaxConnPerRoute(32)
				.setDefaultRequestConfig(RequestConfig.copy(RequestConfig.DEFAULT).setRedirectsEnabled(true).build())
				.setDefaultCredentialsProvider(credentialsProvider)
				.addInterceptorFirst(new PreemptiveAuthInterceptor());
			return builder.build();
   }
	   
	  private static class PreemptiveAuthInterceptor implements HttpRequestInterceptor {
	    	public void process(HttpRequest request, HttpContext context) throws HttpException {
	    	    final AuthState authState = (AuthState) context.getAttribute(HttpClientContext.TARGET_AUTH_STATE);

	    	    if (authState.getAuthScheme() == null) {
	    		final CredentialsProvider credsProvider = (CredentialsProvider) context
	    			.getAttribute(HttpClientContext.CREDS_PROVIDER);
	    		final HttpHost targetHost = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
	    		final Credentials creds = credsProvider
	    			.getCredentials(new AuthScope(targetHost.getHostName(), targetHost.getPort()));
	    		if (creds == null) {
	    		    throw new HttpException("No creds provided for preemptive auth.");
	    		}
	    		authState.update(new BasicScheme(), creds);
	    	    }
	    	}
	      }
	    
	    
	    public void registrarPregunta(String pPregunta, String pRespuesta) throws SolrServerException, IOException {


	    	solrClient = Conversacion.getSolrClient(service.getSolrUrl(CLUSTERID));


	    	SolrInputDocument document = new SolrInputDocument();
	    	document.addField("id", 1);
	    	document.addField("author", "Watson Tutor: Curso Diseño Software");
	    	document.addField("body", pRespuesta);
	    	document.addField("title",pPregunta );


	    	UpdateResponse addResponse = solrClient.add("WATSONTUTORDISENO", document);
	    	System.out.println(addResponse);

	    	// Commit the document to the index so that it will be available for searching.
	    	solrClient.commit("WATSONTUTORDISENO");

	     }
	    
	    public ArrayList<String> consultarPregunta(String pPregunta) throws SolrServerException, IOException{
	    	ArrayList<String> respuestas = new ArrayList<String>();
	    	
	    	solrClient = Conversacion.getSolrClient(service.getSolrUrl(CLUSTERID));

	    	SolrQuery query = new SolrQuery(pPregunta);
	    	
	    	QueryResponse response = solrClient.query("WATSONTUTORDISENO", query);
	    	
	    	String  p = response.toString();
	    	


	    	for(int i= 0; i< response.getResults().size(); i++){
	    		respuestas.add(response.getResults().get(i).get("body").toString().replace("[", "").replace("]", ""));
	    	}
	    	
	    	return respuestas;
	 
	    }
	 

		   
	   
	   

}

