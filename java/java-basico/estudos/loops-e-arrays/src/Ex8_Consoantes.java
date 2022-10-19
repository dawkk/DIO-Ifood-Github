import java.util.Scanner;

public class Ex8_Consoantes {
  public static void main(String[] args) {
    Scanner escolheLetras = new Scanner(System.in);

    System.out.println("Escolha 6 caracteres");

    int contaConsoantes = 0;
    int numeroMaximoArray = 6;
    String[] array = new String[6];

    for(int posicaoAtualArray = 0;posicaoAtualArray < numeroMaximoArray; posicaoAtualArray++) {
      String letra = escolheLetras.next();

      if(!(letra.equalsIgnoreCase("a") |
      letra.equalsIgnoreCase("e") |
      letra.equalsIgnoreCase("i") |
      letra.equalsIgnoreCase("o") |
      letra.equalsIgnoreCase("u"))) {
        array[posicaoAtualArray] = letra;
        contaConsoantes++;
      }
    }
    System.out.println("----------------");

    for(int posicaoAtualArray = contaConsoantes + 1;posicaoAtualArray >= 0; posicaoAtualArray--) {
      if (array[posicaoAtualArray] != null)
          System.out.print(array[posicaoAtualArray] + " ");
    }
    System.out.println("Foram contadas " + contaConsoantes + " Consoantes");
    System.out.println(array.length);

  }
  
}
