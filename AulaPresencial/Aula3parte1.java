package AulaPresencial;
import java.util.Scanner;

public class Aula3parte1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 4 == 0) {
            System.out.println("O número " + numero + " é múltiplo de 3 e 4 ao mesmo tempo.");
        } else {
            System.out.println("O número " + numero + " não é múltiplo de 3 e 4 ao mesmo tempo.");
        }
    }
}
