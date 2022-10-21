public class Calculadora {

  public static void soma(double numero1, double numero2) {
    double resultado = numero1 + numero2;
    System.out.println("A soma de " + numero1 + " + " + numero2 + "É igual a " + resultado);
  }

  public static void subtrai(double numero1, double numero2) {
    double resultado = numero1 - numero2;
    System.out.println("A subtração de " + numero1 + " - " + numero2 + "É igual a " + resultado);
  }

  public static void divide(double numero1, double numero2) {
    double resultado = numero1/numero2;
    System.out.println("A divisão de " + numero1 + " / " + numero2 + "É igual a " + resultado);
  }

  public static void multiplica(double numero1, double numero2) {
    double resultado = numero1*numero2;
    System.out.println("A multiplicação de " + numero1 + " * " + numero2 + "É igual a " + resultado);
  }
  
}
