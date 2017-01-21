package myaddress.api.resource;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface que determina de forma Generica os principais metodos de comunicacao RESTful da API
 * @version 1.0
 * @author victorsax12@gmail.com
 * @param <T>
 */
public interface IRestResources<T>{
 
 
 
 /**
 * Metodo genérico para Consulta pelo ID
 * @param jsonData
	* @return Response
	*/
 @GET
 @Path("/find/{data}")
 @Produces(MediaType.APPLICATION_JSON)
 public Response find(@NotNull @PathParam("data") String jsonData);
 
 
 
 /**
 * Metodo genérico para Consulta de todos os registros
	* @return Response
	*/
 @GET
 @Path("/findAll")
 @Produces(MediaType.APPLICATION_JSON)
 public Response findAll();
 
 
 
 /**
 * Metodo genérico para Adicionar um novo registro
 * @param dataObject
	* @return Response
	*/
 @POST
 @Path("/add")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Response add(T dataObject);

 
 
 
 /**
 * Metodo genérico para Editar um registro
 * @param dataObject
	* @return Response
	*/
 @PUT
 @Path("/update")
 @Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.APPLICATION_JSON)
 public Response update(T dataObject);
 

 
 
 /**
 * Metodo genérico para Deletar um registro
 * @param jsonData
	* @return Response
	*/
 @DELETE
 @Path("/delete/{data}")
 @Produces(MediaType.APPLICATION_JSON)
 public Response delete(@NotNull @PathParam("data") String jsonData);
 
 
 
}
