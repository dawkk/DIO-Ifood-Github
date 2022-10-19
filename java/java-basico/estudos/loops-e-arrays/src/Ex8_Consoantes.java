import java.util.Scanner;

public class Ex8_Consoantes {
  public static void main(String[] args) {
    Scanner escolheLetras = new Scanner(System.in);

    System.out.println("Escolha 6 caracteres");

    int contaConsoantes = 0;
    int numeroMaximoArray = 6;
    String[] array = new String[6];

    for(int posicaoAtualArray = 0;posicaoAtualArray < numeroMaximoArray; posicaoAtualArray++) {
      array[posicaoAtualArray] = escolheLetras.nextLine();
    }

    for(int posicaoAtualArray = numeroMaximoArray -1;posicaoAtualArray >= 0; posicaoAtualArray--) {
      if(array[posicaoAtualArray].toLowerCase() != "a" || array[posicaoAtualArray].toLowerCase() != "e" || array[posicaoAtualArray].toLowerCase() != "i" || array[posicaoAtualArray].toLowerCase() != "o" || array[posicaoAtualArray].toLowerCase() != "u") {
        contaConsoantes++;
        System.out.println(array[posicaoAtualArray] + posicaoAtualArray);
      } else {
        
      }
    }
    System.out.println("Foram contadas " + contaConsoantes + " Consoantes");

  }
  
}
