package aulapratica4;

public class ClientePJ extends Cliente {

	String cnpj;
	
	public ClientePJ(String nome, String endereco, String cnpj) {
		
		super(nome,endereco);
		this.cnpj=cnpj;
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj=cnpj;
	}
	public String toString() {
		return super.toString()+" cnpj: "+cnpj;
	}
	
}
