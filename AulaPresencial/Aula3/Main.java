package AulaPresencial.Aula3;
public class Main {

    public static void main(String[] args) {
    Pendrive pendrive1 = new Pendrive();
    
    pendrive1.setMarca("Sandisk");
    pendrive1.setCapacidade(8);
    pendrive1.setComprimento(16.5f);
    pendrive1.setLargura(2.5f);
    pendrive1.setProfundidade(3.5f);
    pendrive1.setPeso(2.3f);
    pendrive1.setPreco(24.99f);

    System.out.println(pendrive1.toString());
    
    Pendrive pendrive2 = new Pendrive();

    pendrive2.setMarca("Evo");
    pendrive2.setCapacidade(16.5f);
    pendrive2.setComprimento(12f);
    pendrive2.setLargura(4.5f);
    pendrive2.setProfundidade(1.5f);
    pendrive2.setPeso(5.4f);
    pendrive2.setPreco(20.99f);

    System.out.println(pendrive2.toString());

    }
}