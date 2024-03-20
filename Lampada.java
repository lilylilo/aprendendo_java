package unicid;

public class Lampada {
	boolean status;
	
	
	public Lampada() {
		
	}
	public Lampada(boolean status) {
		this.status = status;
	}
	
	
	
	public void Ligar() {
		status = true;
	}
	public void Desligar() {
		status = false;
	}
	public void observar() {
		if (status) {
			System.out.println("Ligada");
		} else {
			System.out.println("Desligada");
		}
	}
}
