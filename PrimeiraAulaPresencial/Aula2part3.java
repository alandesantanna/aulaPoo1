package PrimeiraAulaPresencial;

import java.util.Scanner;

public class Aula2part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, dif, quadradoDaDiferenca, quadradoPrimeiro, quadradoSegundo, diferencaDosQuadrados;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        dif = n1 - n2;
        quadradoDaDiferenca = dif * dif;
        System.out.println("O quadrado da diferença é: " + quadradoDaDiferenca);

        quadradoPrimeiro = n1 * n1;
        quadradoSegundo = n2 * n2;

        diferencaDosQuadrados = quadradoPrimeiro - quadradoSegundo;
        
        System.out.println("A diferença dos quadrados é: " + diferencaDosQuadrados);
        
    }
}
