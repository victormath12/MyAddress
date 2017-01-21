package myaddress.api.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import myaddress.api.exception.PersistenceException;
import myaddress.api.model.bo.EnderecoBO;
import myaddress.api.util.DBConnection;

/**
* Classe que determina as funcionalidades do DAO de Enderecos
* Classe DAO que implementa os metodos da Inteface EnderecoDAO
* @version 1.0
* @author victorsax12@gmail.com
*/
public class EnderecoDAOImpl implements EnderecoDAO{

 
 
 /**
 * @see EnderecoDAO
 * @throws PersistenceException
 */
 public EnderecoBO find(Integer id) throws PersistenceException{
  
  try{
   
   
     //Objeto de EnderecoBO
     EnderecoBO endereco = null;

     //Database Connection
     Connection connection = new DBConnection().ConnectDB();

     //Monta Query DB
     String sql = "SELECT * FROM ENDERECOS WHERE ID = ?";
     PreparedStatement ps = connection.prepareStatement(sql);
     ps.setInt(1, id);

     ResultSet rs = ps.executeQuery();

     if(rs.next()){
      endereco = EnderecoFactory(rs);
     }

     ps.close();
     connection.close();

     return endereco;  

     
  }catch(SQLException erro){
   throw new PersistenceException(erro.getMessage());
  }
  
 }

 
 
 /**
 * @see EnderecoDAO
 * @throws PersistenceException
 */
 public List<EnderecoBO> findAll() throws PersistenceException{
  
  try{

   
     //Lista de enderecos
     List<EnderecoBO> listaEnderecos = new ArrayList<EnderecoBO>();


     //Database Connection
     Connection connection = new DBConnection().ConnectDB();

     //Monta Query DB
     String sql = "SELECT * FROM ENDERECOS";
     PreparedStatement ps = connection.prepareStatement(sql);
     ResultSet rs = ps.executeQuery();

     while(rs.next()){
      EnderecoBO endereco = EnderecoFactory(rs);
      listaEnderecos.add(endereco);
     }

     ps.close();
     connection.close();
     
     return listaEnderecos;  
     
     
  }catch(SQLException erro){
   throw new PersistenceException(erro.getMessage());
  }
   
   
 }

 
 

 /**
 * @see EnderecoDAO
 * @throws PersistenceException
 */
 public EnderecoBO add(EnderecoBO endereco) throws PersistenceException{

  try{
   

    //Database Connection
    Connection connection = new DBConnection().ConnectDB();


    //Monta Query DB
    String sql = "INSERT INTO ENDERECOS (RUA, NUMERO, COMPLEMENTO, CEP, BAIRRO, CIDADE, ESTADO)"
               + "VALUES (?,?,?,?,?,?,?)";
    PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, endereco.getRua());
    ps.setInt(2, endereco.getNumero());
    ps.setString(3, endereco.getComplemento());
    ps.setInt(4, endereco.getCep());
    ps.setString(5, endereco.getBairro());
    ps.setString(6, endereco.getCidade());
    ps.setString(7, endereco.getEstado());


    //Executa Query e obtem o ID gerado pelo Auto-Increment
    ps.executeUpdate();
    ResultSet rs = ps.getGeneratedKeys();


    //Se retornar um ID é porque obteve sucesso no Insert
    if(rs.next()){
      endereco.setId(rs.getInt(1));       
    }else{
      endereco = null;       
    }

    ps.close();
    connection.close();
    return endereco;

  }catch(SQLException erro){
   throw new PersistenceException(erro.getMessage());
  }
   

 }

 
 
 
 /**
 * @see EnderecoDAO
 * @throws PersistenceException
 */
 public boolean update(EnderecoBO endereco) throws PersistenceException{
  
  try{
   

    //Database Connection
    Connection connection = new DBConnection().ConnectDB();


    //Monta Query DB
    String sql = "UPDATE ENDERECOS "
               + "SET RUA = ?, NUMERO = ?, COMPLEMENTO = ?, CEP = ?, "
               + "BAIRRO = ?, CIDADE = ?, ESTADO = ? "
               + "WHERE ID = ?";


    PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, endereco.getRua());
    ps.setInt(2, endereco.getNumero());
    ps.setString(3, endereco.getComplemento());
    ps.setInt(4, endereco.getCep());
    ps.setString(5, endereco.getBairro());
    ps.setString(6, endereco.getCidade());
    ps.setString(7, endereco.getEstado());
    ps.setInt(8, endereco.getId());


    //Executa Query e obtem o ID gerado pelo Auto-Increment
    ps.executeUpdate();
    ResultSet rs = ps.getGeneratedKeys();
    ps.close();
    connection.close();
    return true;
  
  }catch(SQLException erro){
   throw new PersistenceException(erro.getMessage());
  }
 
 
 }
 
 
 
 
 
 /**
 * @see EnderecoDAO
 * @throws PersistenceException
 */
 public boolean delete(Integer id) throws PersistenceException{

  try{
   
   
     //Database Connection
     Connection connection = new DBConnection().ConnectDB();

     //Monta Query DB
     String sql = "DELETE FROM ENDERECOS WHERE ID = ?";
     PreparedStatement ps = connection.prepareStatement(sql);
     ps.setInt(1, id);
     ps.execute();
     ps.close();
     connection.close();

      return true;

      
  }catch(SQLException erro){
   throw new PersistenceException(erro.getMessage());
  }
  

 }
 
 
 
 
 
 /**
 * Método Factory responsavel por criar os objetos a partir do ResultSet
 * @throws SQLException
 */
 private static EnderecoBO EnderecoFactory(ResultSet rs) throws SQLException{
  
   EnderecoBO endereco = new EnderecoBO();
   endereco.setId(rs.getInt("ID"));
   endereco.setRua(rs.getString("RUA"));
   endereco.setNumero(rs.getInt("NUMERO"));
   endereco.setComplemento(rs.getString("COMPLEMENTO"));   
   endereco.setCep(rs.getInt("CEP"));
   endereco.setBairro(rs.getString("BAIRRO"));
   endereco.setCidade(rs.getString("CIDADE"));
   endereco.setEstado(rs.getString("ESTADO"));
   return endereco;
   
 }
 
 

}
