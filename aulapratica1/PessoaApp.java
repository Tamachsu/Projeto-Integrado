package aulapratica1;

import java.util.Scanner;

public class PessoaApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int op = 0;
		String name;
		
		Pessoa pessoa1 = new Pessoa(1,"Helder");
    	Pessoa pessoa2 = new Pessoa(2,"Ana");
    	
    	//o atributo tá privado então é preciso de utilizar o método getNome
    	System.out.println("O nome da "+pessoa1.getCodigo()+"ª pessoa é: "+pessoa1.getNome());
    	System.out.println("O nome da "+pessoa2.getCodigo()+"ª pessoa é: "+pessoa2.getNome());
    	System.out.println("Modificar o nome?\n1 - Sim 0 - Não ");
		op=scan.nextInt();
    	
    	
    	
    	if(op==1) {
    		System.out.println("Modifique o nome/n");
    		name=scan.next();
    		
    		pessoa1.setNome(name);
    	}
    	else {
        	System.out.println("Obrigado");
    	}
    	
    }

}