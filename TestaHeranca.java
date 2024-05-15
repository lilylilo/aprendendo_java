
public class TestaHeranca {

	public static void main(String[] args) {
		// instancia >> ligo uma classe a outra
		Conta c = new Conta ();
		Poupanca p = new Poupanca();
		// iniciar os atributos
		c.setTitular("Jose");
		c.setNrConta(1);
		
		p.setTitular("Maria");
		p.setNrConta(2);
		p.setDataAniversario("15/05/24");
		p.setSaldo(1000.0);
	}

}
