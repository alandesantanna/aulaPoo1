package PrimeiraAulaPresencial;
import java.util.Scanner;

public class Aula2part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      

        float tempo, velocidade, distancia, lCombustivel; 
        
        System.out.println("Digite o tempo de viagem: ");
        tempo = sc.nextFloat();

        System.out.println("Digite a sua velociadade: ");
        velocidade = sc.nextFloat();

        distancia = tempo * velocidade;

        lCombustivel = (distancia/12);

        System.out.println("Velocidade Média: " + velocidade);
        System.out.println("Tempo gasto " + tempo);
        System.out.println("Distancia percorrida: " + distancia);
        System.out.println("Quantidade de litros: " + lCombustivel);

    }
}
