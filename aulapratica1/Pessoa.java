package aulapratica1;
public class Pessoa {

    private int codigo;
    private String nome;
    
    //usar this para me referir aos parametros
    public Pessoa(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public int getCodigo() {
    	return codigo;
    }
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome=nome;
    }
}