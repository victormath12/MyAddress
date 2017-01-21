package myaddress.api.util;

/**
 * Classe de configuração que contem as constantes da aplicação
 * @author victorsax12@gmail.com
 */
public class ConfigAPI {
 
 
 
   //DATABASE CONNECTION
   public final String SGBD = "MYSQL";
   public final String DATABASE = "my_address";
   public final String USER = "root";
   public final String PASS = "";
   public final String DRIVER = "com.mysql.jdbc.Driver";
   public final String HOST = "jdbc:mysql://localhost/";
   //public final String HOST = "my-address.mysql.uhserver.com";
   
   
   //WEBSERVICE MYCEP
   //public final String MYCEP_PATH = "http://localhost:8040/MyCepAPI/api/cep/find";
   public final String MYCEP_PATH = "http://www.autos4u.com.br/MyCepAPI/api/cep/find";
 
 
}
