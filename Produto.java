package prova;

public class Produto {
	private int identificador;
	private String nome;
	private double preco;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		if(identificador > 0)
			this.identificador = identificador;
		else
			System.out.println("Identificador deve ser maior que zero.");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 1.0 && preco < 10000.0)
			this.preco = preco;
		else
			System.out.println("Preço deve estar entre 1.00 e 10000.00");
	}
	
}
