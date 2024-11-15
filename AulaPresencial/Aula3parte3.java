package AulaPresencial;
import java.util.Scanner;

public class Aula3parte3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número do mês (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("O mês tem 31 dias.");
                break;
            case 4, 6, 9, 11:
                System.out.println("O mês tem 30 dias.");
                break;
            case 2:
                System.out.println("O mês tem 28 dias.");
                break;
            default:
                System.out.println("Mês inválido. Digite um número entre 1 e 12.");
        }
       
    }
}