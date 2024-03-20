package unicid;

public class Computador {
	//atributos
	String marca;
	String cor;
	String modelo;
	String serie;
	Double valor;
	
	//construtor vazio
	public Computador() {
		
	}
	
	//construtor com os atributos
	public Computador(String marca, String cor, String modelo, String serie, Double valor) {
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.serie = serie;
		this.valor = valor;
	}

	//método
	public void imprimirDados() {
		System.out.println("Marca..." + marca);
		System.out.println("Cor..." + cor);
		System.out.println("Modelo..." + modelo);
		System.out.println("Serie..." + serie);
		System.out.println("Valor..." + valor);
	}
}

