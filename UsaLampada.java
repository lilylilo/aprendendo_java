package unicid;

public class UsaLampada {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada();
		
		lampada1.Ligar();
		lampada2.Desligar();
		lampada1.observar();
		lampada2.observar();
	}

}
