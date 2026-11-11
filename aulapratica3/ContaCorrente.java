package aulapratica3;

public class ContaCorrente {
	
	private int numero,agencia;
	private float limite;

	public ContaCorrente(int numero, int agencia) {
		this.numero=numero;
		this.agencia=agencia;
	}
	
	public ContaCorrente(int numero, int agencia, float limite) {
		this.numero=numero;
		this.agencia=agencia;
		this.limite=limite;
	}
}
