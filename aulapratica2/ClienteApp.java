package aulapratica2;

public class ClienteApp {

	public static void main (String [] args) {
		
		ClientePJ clientepj1 = new ClientePJ("Patinho","Santarem","999212732");
		
		ClientePF clientepf1 = new ClientePF("Dudu","Aveiras","913231421");
		

		System.out.println("O cliente PJ: "+clientepj1.getNome()+
				"\nVive aqui: "+clientepj1.getEndereco()+
				"\nTem o cp: "+clientepj1.getCnpj());
		
		System.out.println("\nO cliente PF: "+clientepf1.getNome()+
				"\nVive aqui: "+clientepf1.getEndereco()+
				"\nTem o cp: "+clientepf1.getCpf());
		
	}
	
}
