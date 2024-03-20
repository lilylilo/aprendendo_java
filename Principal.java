package unicid;

public class Principal {
	public static void main(String[] args) {
		//criar objeto da classe Computador
		Computador c1 = new Computador();
		Computador c2 = new Computador("HP", null, null, null, null);
		
		//imprimir
		System.out.println("Marca..." + c1.marca);
		System.out.println("Marca..." + c2.marca);
	}
}
