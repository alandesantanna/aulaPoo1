package AulaPresencial;

import java.util.Scanner;

public class Aula2part5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Número do vendedor: ");
        int numeroVendedor = teclado.nextInt();

        System.out.print("Salário fixo do vendedor: R$ ");
        double salarioFixo = teclado.nextDouble();

        System.out.print("Total de vendas realizadas: R$ ");
        double totalVendas = teclado.nextDouble();

        System.out.print("Percentual de comissão (em decimal): ");
        double percentualComissao = teclado.nextDouble();

        double valorComissao = totalVendas * percentualComissao;
        
        double salarioTotal = salarioFixo + valorComissao;

        System.out.println("\nNúmero do vendedor: " + numeroVendedor);
        System.out.printf("Salário total: R$ %.2f", salarioTotal);

    }
}
