/*Construa uma classe Piloto contendo como atributos a quantidade de horas de voo e o nome do
piloto. Implemente nesta classe um método construtor que receba como parâmetro uma String com o
nome do piloto, e os métodos de acesso/modificadores apenas para o atributo do nome do piloto.
Todo objeto piloto instanciado deve inicialmente estar com a quantidade de horas de voo zerada. A
classe deve disponibilizar um método adicionaHoras(int horas) que adiciona uma quantidade de
horas de voo ao piloto. Crie um método imprime que imprima o nome do piloto e a quantidade de
horas de voo, sendo que deverá ser impresso o tipo do piloto: até 200 horas, co-piloto, caso contrário
comandante*/

package prova;

public class Piloto {
	// atributos
	private String nome;
	private int horas;
	public Piloto(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void adicionaHoras (int horas) {
		this.horas = horas;
	}
	public void imprime() {
		System.out.println("Nome do piloto: " + nome);
		if (horas > 200)
			System.out.println("comandante");
		else
			System.out.println("co-piloto");
		}
	
}
