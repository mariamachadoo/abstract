package ClasseAbstrata;

public class Endereco extends Cidade {

	private String rua;
	private int numero;
	private String bairro;
	private String cep;
	private String cidade;
      
    public String getrua() {
	return rua;
    }
    public void setrua(String rua) {
	this.rua = rua;
    }
	public int getnumero() {
		return numero;
	}
	public void setnumero(int numero) {
		this.numero = numero;
	}
	public String getbairro() {
		return bairro;
	}
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	public String getcep() {
		return cep;
	}
	public void setcep(String cep) {
		this.cep = cep;
	}
	public String getcidade() {
		return cidade;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
}
