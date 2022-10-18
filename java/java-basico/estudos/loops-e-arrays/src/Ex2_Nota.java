import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota = 11;

        while(true) {
            System.out.println("Por favor informe uma nota entre 0 e 10.");
            nota = scan.nextInt();
            if (nota >= 0 && nota <= 10) break;
        }
        System.out.println("Sua nota foi: " + nota);

    }

}