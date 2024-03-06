import java.util.Scanner;

/*Crie uma classe que leia um parâmetro passado na linha de comando noseguinte formato: dd/mm/aaaa. 
 A saída gerada por essa execução deve ser aimpressão separada do dia, do mês e do ano - utilizando apenas os métodos da classe String.*/

public class Ex03_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma data (dd/mm/yyyy)");
		String novaData = sc.nextLine();
		
		System.out.println("Dia " + novaData.substring(0,2));
		System.out.println("Mês " + novaData.substring(3,5));
		System.out.println("Ano " + novaData.substring(6,10));
		
	}

}
