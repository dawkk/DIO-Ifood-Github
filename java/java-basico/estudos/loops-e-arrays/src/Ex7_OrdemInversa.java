import java.util.Scanner;

public class Ex7_OrdemInversa {
  public static void main(String[] args) {
    Scanner escolheNumeros = new Scanner(System.in);

    System.out.println("Digite quantos numeros inteiros gostaria de guardar no array");

    int numeroMaximoArray;
    numeroMaximoArray = escolheNumeros.nextInt();
    int[] array = new int[numeroMaximoArray];

    System.out.println("Agora escreva quais numeros quer guardar");

    for(int posicaoAtualArray = 0;posicaoAtualArray < numeroMaximoArray; posicaoAtualArray++) {
      array[posicaoAtualArray] = escolheNumeros.nextInt();
    }

    System.out.println("Os numeros do Array são: ");
    for(int posicaoAtualArray = numeroMaximoArray -1;posicaoAtualArray >= 0; posicaoAtualArray--) {
      System.out.println(array[posicaoAtualArray]);
    }
  }
}
