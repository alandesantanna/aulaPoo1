package AulaPresencial.Aula7;

import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
            Motor motorCarro = new Motor(120, 6000, "Gasolina");
        Motor motorMoto = new Motor(50, 9000, "Gasolina");
        Motor motorOnibus = new Motor(250, 3000, "Diesel");

        Carro carro = new Carro(50000, 5, "Toyota", "ABC-1234", motorCarro, 25);
        
        Moto moto = new Moto(15000, "Honda", "XYZ-9876", motorMoto);
        
        Onibus onibus = new Onibus(300000, 50, "Mercedes", "BUS-5678", motorOnibus);
        
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