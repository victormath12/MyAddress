package myaddress.api.service;

import myaddress.api.exception.CepInvalidException;

/**
 * Interface que determina os metodos base do service de CEP (CepServiceImpl)
 * @version 1.0
 * @author victorsax12@gmail.com
 */
public interface CepService {
  
 
 /**
	 * Realiza a Validação de um CEP de acordo com os dados do Webservice MyCepAPI
  * @param cep
	 * @return boolean
  * @throws CepInvalidException
	 */
 boolean validateCEP(final int cep) throws CepInvalidException;
 
 
 
}
