package myaddress.api.resource;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.Assert.*;
import myaddress.api.model.dao.EnderecoDAO;
import myaddress.api.model.dao.EnderecoDAOImpl;
import myaddress.api.service.EnderecoService;
import myaddress.api.service.impl.EnderecoServiceImpl;
import myaddress.api.util.ConfigAPI;
import myaddress.api.util.DBConnection;
import org.junit.Test;
import static org.mockito.Mockito.spy;

/**
 * Classe para Testar as funcionalidades mais criticas da aplicação
 * @author victorsax12@gmail.com
 */
public class EnderecoResourceTest {
 
 
 /**
 * Mockito Spy Classes
 */
 EnderecoDAO enderecoDao = spy(new EnderecoDAOImpl());
 EnderecoService enderecoService = spy(new EnderecoServiceImpl());
 
 

 /**
  * Testar a Conexão com o Banco
  */
 @Test
 public void testDatabaseConnection() throws SQLException{
  
  //Testar Conexão com o Banco de dados
  Connection connection = new DBConnection().ConnectDB();

 }

 
 /**
  * Testar a Validação pelo CEP (MyCepAPI)
  */
 @Test
 public void testCepValidation() {
  
  
  //Call ConfigAPI
  ConfigAPI config = new ConfigAPI();
  

  //Consultar WebService MyCepAPI utilizando Jersey Client
  Client client = Client.create();
  WebResource webResource = client.resource(config.MYCEP_PATH);
  String jsonRequest = "{\"cepId\":\"" + "9260070" + "\"}";
  System.out.println(jsonRequest);
  ClientResponse response = webResource.accept("application/json")
       .type("application/json").post(ClientResponse.class, jsonRequest);
  
  
  //A Conexão com o MyCepAPI deve devolver Status 200 OK
  assertEquals(200, response.getStatus());
  
  
 }

 
 
 
}
