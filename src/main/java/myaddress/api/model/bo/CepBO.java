package myaddress.api.model.bo;

/**
 * @author victorsax12@gmail.com
 */
public class CepBO {
 
 
 //Attributes
 private Integer cepId;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
 

 
 //Getters e Setters
 public Integer getCepId() {
  return cepId;
 }

 public void setCepId(Integer cepId) {
  this.cepId = cepId;
 }

 public String getRua() {
  return rua;
 }

 public void setRua(String rua) {
  this.rua = rua;
 }

 public String getBairro() {
  return bairro;
 }

 public void setBairro(String bairro) {
  this.bairro = bairro;
 }

 public String getCidade() {
  return cidade;
 }

 public void setCidade(String cidade) {
  this.cidade = cidade;
 }

 public String getEstado() {
  return estado;
 }

 public void setEstado(String estado) {
  this.estado = estado;
 }
 

}
