package unicid;

public class TestaPessoa {

	public static void main(String[] args) {
		// instanciar o objeto
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("Kelly", 20);
		
		System.out.println("Nome..." + p1.nome);
		System.out.println("Idade..." + p1.idade);
		
		System.out.println("Nome..." + p2.nome);
		System.out.println("Idade..." + p2.idade);

	}

}
