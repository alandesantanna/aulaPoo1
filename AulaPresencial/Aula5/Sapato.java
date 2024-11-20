package AulaPresencial.Aula5;

public class Sapato extends Calcado {
    private String modelo;

    public Sapato(String marca, double preco, String cor, int tamanho, String modelo) {
        super(marca, preco, cor, tamanho);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Modelo: " + modelo);
    }
}

