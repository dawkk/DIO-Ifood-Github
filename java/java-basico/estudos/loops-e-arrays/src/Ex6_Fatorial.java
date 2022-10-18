import java.util.Scanner;

public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner escolheNumero = new Scanner(System.in);

    System.out.println("Digite um numero para ver seu fatorial : ");

    int fatorial = escolheNumero.nextInt();
    int multiplicacao = 1;

        System.out.print(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);

  }
}
