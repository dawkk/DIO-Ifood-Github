import java.util.Scanner;

public class Ex3_MaiorEMedia {

  public static void main(String[] args) {
  
    int repeteloop = 0;
    int somanumeros = 0;
    int lenumero = 0;
    int maiornumero = 0;

    double media;

   

    do {
      System.out.println("Digite numero : ");
      Scanner escolhenumero = new Scanner(System.in);
      lenumero = escolhenumero.nextInt();
      if(lenumero > maiornumero) {
        maiornumero = lenumero;
      } 
      somanumeros += lenumero;
      repeteloop++;
    } while(repeteloop <= 4);
    media = somanumeros/5;
    System.out.println("A soma dos 5 numeros é igual a " + somanumeros + " E a média é : " + media + " E o maior numero escolhido foi " + maiornumero);
  } 
  
}


