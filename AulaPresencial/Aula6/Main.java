package AulaPresencial.Aula6;

public class Main {
    public static void main(String[] args) {
        Motor motorCarro = new Motor(120, 6000, "Gasolina");
        
        Carro carro = new Carro(500.00, 5, "Toyota", motorCarro, "ABC-1234");


        Motor motorMoto = new Motor(50, 8000, "Gasolina");
        
        Moto moto = new Moto(15000.00, 2, "Honda", motorMoto, "XYZ-5678");

        Motor motorOnibus = new Motor(300, 3000, "Diesel");
        
        Onibus onibus = new Onibus(2000.00, 50, "Volksbus", motorOnibus, "ONB-9999");

        System.out.println("Dados do Carro:");
        carro.imprimir();
        carro.acelerar();
        carro.frear();
        carro.virarDireita();

        System.out.println("-----------------------");

        System.out.println("\nDados da Moto:");
        moto.imprimir();
        moto.acelerar();
        moto.frear();
        moto.virarEsquerda();

        System.out.println("-----------------------");

        System.out.println("\nDados do Ônibus:");
        onibus.imprimir();
        onibus.acelerar();
        onibus.frear();
    }
}
