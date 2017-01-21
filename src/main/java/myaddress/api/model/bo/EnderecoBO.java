package myaddress.api.model.bo;

/**
 * BO (Business Object) que define um Endereço
 * @author victorsax12@gmail.com
 */
public class EnderecoBO {
 
 
 //Atributos
 private Integer id;
 private String rua;
 private Integer numero;
 private String complemento;
 private int cep;
 private String bairro;
 private String cidade;
 private String estado;


 
 //Construtor
 public EnderecoBO(){super();}

 public EnderecoBO(Integer id, String rua, Integer numero, String complemento, Integer cep, String bairro, String cidade, String estado) {
  this.id = id;
  this.rua = rua;
  this.numero = numero;
  this.complemento = complemento;
  this.cep = cep;
  this.bairro = bairro;
  this.cidade = cidade;
  this.estado = estado;
 }

 
 
  
 //Getters e Setters
 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getRua() {
  return rua;
 }

 public void setRua(String rua) {
  this.rua = rua;
 }

 public Integer getNumero() {
  return numero;
 }

 public void setNumero(Integer numero) {
  this.numero = numero;
 }

 public String getComplemento() {
  return complemento;
 }

 public void setComplemento(String complemento) {
  this.complemento = complemento;
 }

 public Integer getCep() {
  return cep;
 }

 public void setCep(Integer cep) {
  this.cep = cep;
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
