package PrimeiraAulaPresencial;
import java.util.Scanner;

public class Aula1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, largura, altura, volume, profudidade;

        System.out.println("Digite a largura: ");
        largura = sc.nextFloat();

        System.out.println("Digite a altura: ");
        altura = sc.nextFloat();

        area = largura * altura;

        System.out.println("Digite a Profudidade: ");
        profudidade = sc.nextFloat();

        volume = area * profudidade;

        System.out.println("A área da base do seu objeto é: " + area);
        System.out.println("O volume do seu objeto 3D é: " + volume);

    }
}