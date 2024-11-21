package AulaPresencial.Aula5;

public class Main {
    public static void main(String[] args) {
        Chinelo chinelo1 = new Chinelo("Havaianas", 25.99, "Azul", 40, true, true);
        Tenis tenis1 = new Tenis("Nike", 299.99, "Preto", 42, true, true);
        Sapato sapato1 = new Sapato("Oxford", 199.99, "Marrom", 41, "Formal");

        System.out.println("Chinelo:");
        chinelo1.imprimir();
        System.out.println("\nTênis:");
        tenis1.imprimir();
        System.out.println("\nSapato:");
        sapato1.imprimir();
    }
}
