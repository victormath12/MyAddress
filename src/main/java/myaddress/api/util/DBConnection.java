package myaddress.api.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
 
 
 
 //Call ConfigAPI
 static ConfigAPI config = new ConfigAPI();



 //Metodo que Conecta com o banco de dados
 public Connection ConnectDB() throws SQLException{

     try{
      
       Class.forName(config.DRIVER);
       return DriverManager.getConnection(config.HOST + config.DATABASE, config.USER, config.PASS);

     }catch(ClassNotFoundException classEx){
        throw new RuntimeException("Não foi encontrado o Driver do " + config.PASS);

     }catch(SQLException sqlEx){
         throw new RuntimeException("Falha ao conectar com o banco de dados: " + sqlEx.getMessage());
     }
 }
 
 
 
 //Metodo que Conecta com o banco de dados
 public Connection ConnectDB(ConfigAPI config) throws SQLException{

     try{
      
       Class.forName(config.DRIVER);
       return DriverManager.getConnection(config.HOST + config.DATABASE, config.USER, config.PASS);

     }catch(ClassNotFoundException classEx){
        throw new RuntimeException("Não foi encontrado o Driver do " + config.PASS);

     }catch(SQLException sqlEx){
         throw new RuntimeException("Falha ao conectar com o banco de dados: " + sqlEx.getMessage());
     }
 }

 
}
