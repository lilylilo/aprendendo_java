/*Faça a classe TestaPiloto contendo o método main para testar o funcionamento da classe e instancia
2 pilotos, sendo um comandante e outro co-piloto.
*/
package prova;

public class TestaPiloto {

	public static void main(String[] args) {
		//instanciar os objetos da classe Piloto
		Piloto p1 = new Piloto ("Marco Santos");
		Piloto p2 = new Piloto ("Simone Silva");
		
		//adicionando horas
		p1.adicionaHoras(300);
		p2.adicionaHoras(15);
		
		//imprimir
		p1.imprime();
		p2.imprime();
	}

}
