
public class TesteCliente {
	public static void main(String[] args) {
		Cliente cl = new Cliente();
		
		cl.nomeCliente = "Fulano";
		cl.cpfCliente = "111111111-00";
		
		System.out.println("-----------------------------");
		System.out.println("NOME.....: " + cl.nomeCliente);
		System.out.println("CPF......: " + cl.cpfCliente);
		System.out.println("-----------------------------");
	}
}
