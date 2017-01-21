package myaddress.api.model.bo;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

/**
 * @author victorsax12@gmail.com
 */
public class RestResponse{
 
 
 //Attributes
 private Object data;
 private Integer status;
 
 
 //Factory
 public static Response jsonResponse(Object data, Status status){
  RestResponse restResponse = new RestResponse();
  restResponse.setData(data);
  restResponse.setStatus(status.getStatusCode());
  return Response.status(status).entity(restResponse).build();
  
 }

 
 //Getters & Setters
 public Object getData() {
  return data;
 }

 public void setData(Object data) {
  this.data = data;
 }

 public Integer getStatus() {
  return status;
 }

 public void setStatus(Integer status) {
  this.status = status;
 }

 
}
