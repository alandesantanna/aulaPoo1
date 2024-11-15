package AulaPresencial;
import java.util.Scanner;

public class Aula3parte4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Verifica se o primeiro número é menor que o segundo
        if (num1 > num2) {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        } else {
            System.out.println("Números pares entre " + num1 + " e " + num2 + ":");

            // Percorre os números entre num1 e num2
            for (int i = num1; i <= num2; i++) {
                // Verifica se o número é par
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
