package AulaPresencial;
import java.util.Scanner;

public class Aula2part4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o preço em reais: R$ ");
        double precoReais = teclado.nextDouble();

        System.out.print("Digite a taxa de conversão (reais por dólar): ");
        double taxaConversao = teclado.nextDouble();

        double precoDolares = precoReais / taxaConversao;

        System.out.printf("O valor em dólares é: US$ %.2f", precoDolares);

    }
}
