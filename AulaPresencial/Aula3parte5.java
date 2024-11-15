package AulaPresencial;
import java.util.Scanner;

public class Aula3parte5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite números inteiros positivos (digite -1 para parar):");

        do {
            numero = sc.nextInt();

            if (numero == -1) {
                break;
            }

            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero + " é múltiplo de 2 e 3.");
            } else {
                System.out.println(numero + " não é múltiplo de 2 e 3.");
            }
        } while (true);
    }
}