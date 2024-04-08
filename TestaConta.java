
public class TestaConta {
	public static void main(String[] args) {
		// Criacao da conta
		Conta c = new Conta(1000.00,"102030","Kevin", "89441320",89);
		// Impressao dos dados da conta
		c.imprimeDados();
		// Saque da conta
		c.saque(500.00);
		// Impressao dos dados da conta
		c.imprimeDados();
		// Deposito em conta
		c.deposito (200.00);
		// Impressao dos dados da conta
		c.imprimeDados();
		// Impressao do saldo da conta, utilizando o metodo getSaldo();
		System.out.println(c.getSaldo());
		}
}
