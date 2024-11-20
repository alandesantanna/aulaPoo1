package AulaPresencial.Aula5;

public class Calcado{
    private String marca;
    private double preco;
    private String cor;
    private int tamanho;

    public Calcado(){
        this.marca = "desconhecida";
        this.preco = 0.0;
        this.cor = "desconhecido";
        this.tamanho = 0;
    }

    public Calcado(String marca){
        this.marca = marca;
        this.preco = 0.0;
        this.cor = "desconhecido";
        this.tamanho = 0;
    }

    public Calcado(String marca, double preco){
        this.marca = marca;
        this.preco = preco;
        this.cor = "desconhecido";
        this.tamanho = 0;
    }

    public Calcado(String marca, double preco, String cor){
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = 0;
    }

    public Calcado(String marca, double preco, String cor, int tamanho){
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void cadastrar(String marca, double preco, String cor, int tamanho) {
        this.marca = marca;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }
    
}