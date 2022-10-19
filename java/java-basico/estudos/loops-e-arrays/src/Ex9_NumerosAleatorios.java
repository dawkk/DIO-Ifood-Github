
public class Ex9_NumerosAleatorios {

  public static void main(String[] args){
    int minimo = 0;
    int maximo = 100;
    int posicaoFinalArray = 19;
  
    int[] array = new int[posicaoFinalArray];
  
    for(int posicaoAtualArray = 0;posicaoAtualArray < posicaoFinalArray; posicaoAtualArray++) {
      int numeroAleatorio = (int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);
      array[posicaoAtualArray] = numeroAleatorio;
    }

    System.out.print("Numeros Aleatorios: ");
    for (int numeroAleatorio : array) {
        System.out.print(numeroAleatorio  + " ");
    }

    System.out.print("\nAntecessor dos Numeros Aleatorios: ");
    for (int numeroAleatorio : array) {
        System.out.print((numeroAleatorio -1) + " ");
    }

    System.out.print("\nSucessores dos Numeros Aleatorios: ");
    for (int numeroAleatorio : array) {
        System.out.print((numeroAleatorio +1) + " ");
    }

  }
}
