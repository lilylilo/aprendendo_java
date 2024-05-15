import java.util.Scanner;

public class Administracao {

	public static void main(String[] args) {
		//cria objeto com 3 estados e 5 municipios
		Populacao p = new Populacao (3,5);
		
		Scanner sc = new Scanner(System.in);
		int pop = 0;
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<5; coluna++) {
				System.out.println("Digite a população");
				pop = sc.nextInt();
				p.atualizarPopulacao(linha, coluna, pop);
			}
		}
		//imprime a media de 1 estado
		p.mediaEstado(0);
	}

}
