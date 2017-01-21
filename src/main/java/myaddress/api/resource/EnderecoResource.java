package myaddress.api.resource;
import com.google.gson.Gson;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import myaddress.api.exception.CepInvalidException;
import myaddress.api.exception.EnderecoNotFoundException;
import myaddress.api.model.bo.EnderecoBO;
import myaddress.api.model.bo.RestResponse;
import myaddress.api.service.CepService;
import myaddress.api.service.EnderecoService;
import myaddress.api.service.impl.CepServiceImpl;
import myaddress.api.service.impl.EnderecoServiceImpl;


/**
 * Resource para CRUD de enderecos
 * @version 1.0
 * @author victorsax12@gmail.com
 */
@Path("/endereco")
public class EnderecoResource implements IRestResources<EnderecoBO>{
 
 
   //Call EnderecoService and CepService
   private final EnderecoService enderecoService = new EnderecoServiceImpl();
   private final CepService cepService = new CepServiceImpl();
   

   /**
   * Metodo para Consulta de enderecos pelo ID
   * @return Response
   */
   public Response find(String jsonData) {
    
    try{
     
      //Parsear JsonData para pegar o ID
      Gson gson = new Gson();
      EnderecoBO enderecoObj = gson.fromJson(jsonData, EnderecoBO.class);
      
      //Verificar se o Id for passado por parametro
      if(enderecoObj.getId() == null)
       throw new Exception("O Id do Endereço não foi especificado");
      
      //Call EnderecoService
      return RestResponse.jsonResponse(
              enderecoService.find(enderecoObj.getId()), 
              Response.Status.OK);

    }catch(EnderecoNotFoundException notfound){
     return RestResponse.jsonResponse(notfound.getMessage(), Response.Status.NO_CONTENT);

    }catch(Exception error){
     return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }

   }

   
  
   
   /**
   * Metodo para Consulta de todos os enderecos
   * @return Response
   */
   public Response findAll(){

    try{

      //Call EnderecoService
      return RestResponse.jsonResponse(
              enderecoService.findAll(), 
              Response.Status.OK);
      
    }catch(EnderecoNotFoundException notfound){
     return RestResponse.jsonResponse(notfound.getMessage(), Response.Status.NO_CONTENT);
     
    }catch(Exception error){
     return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }

   }
   
    
   
   
  /**
   * Metodo para Inserir um novo endereco
   * @return Response
   * @param dataObject
   */ 
   public Response add(EnderecoBO dataObject) {
    
    try{
     
     
      //Validar se o Cep é Valido antes de Adicionar
      if(!cepService.validateCEP(dataObject.getCep()))
       throw new CepInvalidException();
      
     
      //Call EnderecoService
      return RestResponse.jsonResponse(
              enderecoService.add(dataObject), 
              Response.Status.OK);
      

    }catch(Exception error){
     return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }
     
   }

   
   
   
   /**
   * Metodo para Editar um endereco
   * @return Response
   * @param dataObject
   */
   public Response update(EnderecoBO dataObject) {
    
    try{

     
      //Validar se o Cep é Valido antes de Adicionar
      if(!cepService.validateCEP(dataObject.getCep()))
       throw new CepInvalidException();
      
      
      //Call EnderecoService
      return RestResponse.jsonResponse(
              enderecoService.update(dataObject), 
              Response.Status.OK);

      
    }catch(Exception error){
     return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }
    
   }


   
   
   /**
   * Metodo para Deletar um endereco pelo ID
   * @return Response
   * @param jsonData
   */
   public Response delete(String jsonData) {
    
    try{
     
      //Parsear JsonData para pegar o ID
      Gson gson = new Gson();
      EnderecoBO enderecoObj = gson.fromJson(jsonData, EnderecoBO.class);
      
      //Verificar se o Id for passado por parametro
      if(enderecoObj.getId() == null)
       throw new Exception("O Id do Endereço não foi especificado");
      
      //Call EnderecoService
      return RestResponse.jsonResponse(
              enderecoService.delete(enderecoObj.getId()), 
              Response.Status.OK);

    }catch(Exception error){
     return RestResponse.jsonResponse(error.getMessage(), Response.Status.INTERNAL_SERVER_ERROR);
    }
   
   
   }

 
}
