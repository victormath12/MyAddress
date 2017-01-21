package myaddress.api.service.impl;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import myaddress.api.exception.CepInvalidException;
import myaddress.api.service.CepService;
import myaddress.api.util.ConfigAPI;

/**
 * Classe que determina as funcionalidades de consulta de CEPs no webservice MyCepAPI
 * Classe que implementa os metodos da Inteface CepService
 * @version 1.0
 * @author victorsax12@gmail.com
 */
 public class CepServiceImpl implements CepService{

 
 
  /**
   * Realiza a Validação de um CEP de acordo com os dados do Webservice MyCepAPI
   * @param cep
   * @return CepBO
   * @throws CepInvalidException
   */
  public boolean validateCEP(int cep) throws CepInvalidException{
    
    try{
     
      //Call ConfigAPI
      ConfigAPI config = new ConfigAPI();
      
     
      //Consultar WebService MyCepAPI utilizando Jersey Client
      Client client = Client.create();
      WebResource webResource = client.resource(config.MYCEP_PATH);
      String jsonRequest = "{\"cepId\":\"" + cep + "\"}";
      
      System.out.println(jsonRequest);
      
      ClientResponse response = webResource.accept("application/json")
           .type("application/json").post(ClientResponse.class, jsonRequest);
      
      
      System.out.println(response.getStatus());

      //Se a resposta for OK (200) retorna true
      if(response.getStatus() == 200){
        String entity = response.getEntity(String.class);
        System.out.println(entity);
        
        if(entity.contains("204"))
         throw new Exception("CEP Inválido");
        else
         return true;

      }else{
        throw new Exception(response.getEntity(String.class));
      }
      
    }catch(Exception erro){
      throw new CepInvalidException(erro.getMessage());
    }
   
 }
  

}
