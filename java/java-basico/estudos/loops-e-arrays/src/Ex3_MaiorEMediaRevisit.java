import java.util.Scanner;
import java.util.Arrays;

public class Ex3_MaiorEMediaRevisit {

  public static void main(String[] args) {
  
    int repeteloop = 5;
    int somanumeros = 0;
    int[] array = new int[4];
    double media;
    Scanner escolhenumero = new Scanner(System.in);

    do {
      System.out.println("Digite seu próximo numero : posição atual numero " + repeteloop + " de 5 numeros");
      array[repeteloop] = escolhenumero.nextInt();
      somanumeros += somanumeros+array[repeteloop];
      repeteloop--; 
    } while(repeteloop == 0);

    Arrays.sort(array, 1, 4);
    media = somanumeros/5;
    System.out.println("A soma dos 5 numeros é igual a " + somanumeros + " A média é : " + media + " E o maior numero é " + array[4]);
  }
}


