import java.util.Scanner;

public class Ex5_Tabuada {
  public static void main(String[] args) {
    Scanner escolheNumero = new Scanner(System.in);

    int tabuada;
    int numeroTabuada;
    int resultadoMultiplica;

    System.out.println("Digite a tabuada de qual numero gostaria de ver entre 1 a 10: ");
    tabuada = escolheNumero.nextInt();
    

    if(tabuada >= 0 && tabuada <= 10) {
      System.out.println("Tabuada de " + tabuada);
      for(numeroTabuada = 1;numeroTabuada <= 10;numeroTabuada++) {
      resultadoMultiplica = tabuada * numeroTabuada;
      System.out.println(tabuada + " X " + numeroTabuada + " = " + resultadoMultiplica);
      };

    } else { System.out.println("Erro: numero invalido, o numero precisa estar entre 1 a 10.");
  };

  }
}
