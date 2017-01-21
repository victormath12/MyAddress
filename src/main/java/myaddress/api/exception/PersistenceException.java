package myaddress.api.exception;

/**
 * @author victorsax12@gmail.com
 */
public class PersistenceException extends Exception {

  public PersistenceException(){
      super("Falha ao realizar operação na base de dados.");
  }
  
  public PersistenceException(String msg){
      super(msg);
  }

  public PersistenceException(String msg, Throwable cause){
      super(msg, cause);
  }
 
}
