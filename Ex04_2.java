package aula2802;
import java.util.Scanner;
//Crie uma classe que gere um número aleatório entre os valores máximo e mínimo recebidos do usuário na linha de comando.

public class Ex04{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Valor Mínimo");
    int min = sc.nextInt();

    System.out.println("Valor Máximo");
    int max = sc.nextInt();

    System.out.println((int) (min + (Math.random()*(max-min))));
  }
}
