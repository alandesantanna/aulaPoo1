package PrimeiraAulaPresencial;

import java.util.Scanner;

public class Aula2part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float raio, altura, volume;

        System.out.println("Digite o valor do raio: ");
        raio = sc.nextFloat();

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextFloat();

        volume = 3.14159f * raio * raio * altura;

        System.out.println("O volume da lata é " + volume);

    }
}
