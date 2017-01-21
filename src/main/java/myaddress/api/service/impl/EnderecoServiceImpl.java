package myaddress.api.service.impl;
import java.util.List;
import myaddress.api.exception.EnderecoNotFoundException;
import myaddress.api.exception.PersistenceException;
import myaddress.api.model.bo.EnderecoBO;
import myaddress.api.model.dao.EnderecoDAO;
import myaddress.api.model.dao.EnderecoDAOImpl;
import myaddress.api.service.EnderecoService;


/**
 * Classe que determina as funcionalidades do Service de Enderecos
 * Classe que implementa os metodos da Inteface EnderecoService
 * @version 1.0
 * @author victorsax12@gmail.com
 */
public class EnderecoServiceImpl implements EnderecoService{
 
 
 
  //Call EnderecoDAO
  private final EnderecoDAO enderecoDAO = new EnderecoDAOImpl();
 

  
  /**
  * @see EnderecoService
  * @throws EnderecoNotFoundException
  * @throws PersistenceException
  */
  public EnderecoBO find(Integer id) throws EnderecoNotFoundException, PersistenceException{
   
   //Selecionar endereco pelo ID
   EnderecoBO endereco = enderecoDAO.find(id);
   
   //Verificar se retornou algum registro
   if(endereco == null)
    throw new EnderecoNotFoundException();
   
   return endereco;
  
  }

  
  
  
  /**
  * @see EnderecoService
  * @throws EnderecoNotFoundException
  * @throws PersistenceException
  */
  public List<EnderecoBO> findAll() throws EnderecoNotFoundException, PersistenceException{

   //Selecionar todos da base de dados
   List<EnderecoBO> listaEnderecos = enderecoDAO.findAll();
   
   //Verificar se retornou algum registro
   if(listaEnderecos == null || listaEnderecos.size() <= 0)
    throw new EnderecoNotFoundException();
   
   return listaEnderecos;
  
  }

  
  
  
  /**
  * @see EnderecoService
  * @throws PersistenceException
  */
  public EnderecoBO add(EnderecoBO endereco) throws PersistenceException{
   
   //Fazer o Insert e retornar o objeto inserido
   EnderecoBO enderecoInserted = enderecoDAO.add(endereco);
   
   //Verificar se retornou algum registro
   if(enderecoInserted == null)
    throw new PersistenceException();
   
   return endereco;
  
  }
  
  
  
  
  /**
  * @see EnderecoService
  * @throws PersistenceException
  */
  public boolean update(EnderecoBO endereco) throws PersistenceException{
   
   //Fazer o Update e retornar True se foi com sucesso
   return  enderecoDAO.update(endereco);
  
  }

  
  
  
  /**
  * @see EnderecoService
  * @throws PersistenceException
  */
  public boolean delete(Integer id) throws PersistenceException{
   
   //Deletar endereco pelo ID
   return enderecoDAO.delete(id);

  }
 

  
}
