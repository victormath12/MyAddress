package myaddress.api.exception;

/**
 * @author victorsax12@gmail.com
 */
public class CepInvalidException extends Exception {

  public CepInvalidException(){
      super("CEP Inválido");
  }
  
  public CepInvalidException(String msg){
      super(msg);
  }

  public CepInvalidException(String msg, Throwable cause){
      super(msg, cause);
  }
 
}
