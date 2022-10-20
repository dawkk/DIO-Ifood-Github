// Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna).

public class Ex10_ArrayMultidimensional {
  public static void main(String[] args){
    int minimo = 0;
    int maximo = 9;
    int contaNumerosMatriz = 0;
    int menorNumero = 9;
    String stringify = " Array numero ";
  
    int[][][][] multidimensionalArray = new int[4][4][4][4];
  
    for(int selecionaPrimeiroArray = 0;selecionaPrimeiroArray < multidimensionalArray.length; selecionaPrimeiroArray++) {
      for(int selecionaSegundoArray = 0; selecionaSegundoArray < multidimensionalArray[selecionaPrimeiroArray].length;selecionaSegundoArray++) {
        for(int selecionaTerceiroArray = 0; selecionaTerceiroArray < multidimensionalArray.length;selecionaTerceiroArray++){
          for(int selecionaQuartoArray = 0; selecionaQuartoArray < multidimensionalArray.length;selecionaQuartoArray++) {
            int numeroAleatorio = (int)Math.floor(Math.random()*(maximo-minimo+1)+minimo);
            int numeroAtual = numeroAleatorio;
            multidimensionalArray[selecionaPrimeiroArray][selecionaSegundoArray][selecionaTerceiroArray][selecionaQuartoArray] = numeroAtual;
            System.out.print("arr[" + selecionaPrimeiroArray + "][" + selecionaSegundoArray + "][" + selecionaTerceiroArray + "][" + selecionaQuartoArray + "] = "
            + multidimensionalArray[selecionaPrimeiroArray][selecionaSegundoArray][selecionaTerceiroArray][selecionaQuartoArray] + "\n");
            contaNumerosMatriz++;
            if(numeroAtual <= menorNumero) {
              menorNumero = numeroAtual;
              stringify = " Array numero [" + Integer.toString(selecionaPrimeiroArray) + "][" + Integer.toString(selecionaSegundoArray) + "][" + Integer.toString(selecionaTerceiroArray) + "][" + Integer.toString(selecionaQuartoArray) + "]";
            }
          }
        }
      }
    }
    System.out.println("Temos " + contaNumerosMatriz + "/256 atribuidos!");
    System.out.println("Encontramos o menor numero como " + menorNumero + stringify);
  }
}
