import java.util.Scanner;

public class Ex4_ParEImpar {
  public static void main(String[] args) {
    Scanner escolheNumero = new Scanner(System.in);
    
    int contaPares = 0, contaImpares = 0;
    int numerosEscolhidos;
    int numero;

    System.out.println("Digite quantos numeros ira digitar: ");
    numerosEscolhidos = escolheNumero.nextInt();
    

    int repeteLoop = 0;
        do {
            System.out.println("Número: ");
            numero = escolheNumero.nextInt();

            if (numero % 2 == 0 ) contaPares++;
            else contaImpares++;

            repeteLoop++;
        } while(repeteLoop < numerosEscolhidos);

        System.out.println("Quantidade de numeros Pares: " + contaPares);
        System.out.println("Quantidade de numeros Ímpares: " + contaImpares);
  }

}
