package myaddress.api.exception;

/**
 * @author victorsax12@gmail.com
 */
public class EnderecoNotFoundException extends Exception {

  public EnderecoNotFoundException(){
      super("Não Encontramos nenhum Endereço");
  }
  
  public EnderecoNotFoundException(String msg){
      super(msg);
  }

  public EnderecoNotFoundException(String msg, Throwable cause){
      super(msg, cause);
  }
 
}
