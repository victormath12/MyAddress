package myaddress.api.model.dao;
import java.util.List;
import myaddress.api.exception.PersistenceException;
import myaddress.api.model.bo.EnderecoBO;

/**
* Interface que determina os metodos base do DAO de Endereco
* @version 1.0
* @author victorsax12@gmail.com
*/
public interface EnderecoDAO {
 
 
 
  /**
	 * Retorna um Objeto EnderecoBO (Com o endereco completo) a partir de um ID
  * @param id
	 * @return EnderecoBO
  * @throws PersistenceException
	 */
 EnderecoBO find(final Integer id) throws PersistenceException;
 
 
 
 /**
	 * Retorna uma lista com todos os enderecos
	 * @return List de EnderecoBO
  * @throws PersistenceException
	 */
 List<EnderecoBO> findAll() throws PersistenceException;
 
 
 
 /**
	 * Adiciona um novo endereco a partir de um objeto EnderecoBO, se obter sucesso, retornará o objeto EnderecoBO completo
  * Senão, retornará um objeto EnderecoBO nulo (Null)
  * @param endereco
	 * @return EnderecoBO
  * @throws PersistenceException
	 */
 EnderecoBO add(final EnderecoBO endereco) throws PersistenceException;
 
 
 
 /**
	 * Editar um endereco a partir de um objeto EnderecoBO, se obter sucesso, retornará TRUE
  * @param endereco
	 * @return boolean
  * @throws PersistenceException
	 */
 boolean update(final EnderecoBO endereco) throws PersistenceException;
 
 
 
 /**
	 * Deletar um endereco a partir do ID, retorna TRUE se deletar com sucesso
  * @param id
	 * @return boolean
  * @throws PersistenceException
	 */
 boolean delete(final Integer id) throws PersistenceException;
 

 
}
