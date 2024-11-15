package AulaPresencial;
import java.util.Scanner;

public class Aula3parte2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do jogador: ");
        int idade = sc.nextInt();

        if (idade <= 10) {
            System.out.println("Categoria: Mirim");
        } else if (idade <= 18) {
            System.out.println("Categoria: Juvenil");
        } else if (idade <= 40) {
            System.out.println("Categoria: Adulto");
        } else {
            System.out.println("Categoria: Master");
        }

    }

}
