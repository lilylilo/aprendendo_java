package prova;

public class TestaProduto {

	public static void main(String[] args) {
		Produto p[] = new Produto[3];
		
		//produto 1
		p[0] = new Produto();
		p[0].setNome("Joao Vitor");
		p[0].setIdentificador(1);
		p[0].setPreco(10.00);
		
		//produto 2
		p[1] = new Produto();
		p[1].setNome("Luis Felipe");
		p[1].setIdentificador(2);
		p[1].setPreco(9.0);
		
		//produto 3
			p[2] = new Produto();
			p[2].setNome("Maria Eduarda");
			p[2].setIdentificador(3);
			p[2].setPreco(18.0);
			
		for(int i=0; i<p.length; i++) {
			System.out.println("Nome: " + p[i].getNome());
			System.out.println("Identificador: " + p[i].getIdentificador());
			System.out.println("Preço: " + p[i].getPreco());
			System.out.println("========================");
		}
		System.out.println("Maior preço: " + maiorValor(p));

	}
	
	public static double maiorValor(Produto[] array) {
		double maior = array[0].getPreco();
		for(int i=1; i<array.length; i++) {
			if(array[i].getPreco() > maior) {
				maior = array[i].getPreco();
			}
		}
		return maior;
	}
}
