package AulaPresencial.Aula3;

public class Pendrive {
    String marca;
    int capacidade;
    float comprimento;
    float largura;
    float profundidade;
    float peso;
    float preco;

    public Pendrive(){   
    }

    public Pendrive(String m, int c, float com, float lar, float pro, float pe, float pr){
        this.marca = m;
        this.capacidade = c;
        this.comprimento = com;
        this.largura = lar;
        this.profundidade = pro;
        this.peso = pe;
        this.preco = pr;
    }

    public Pendrive(String m, int c, float com, float lar, float pro, float pe){
        this.marca = m;
        this.capacidade = c;
        this.comprimento = com;
        this.largura = lar;
        this.profundidade = pro;
        this.peso = pe;
    }

    public Pendrive(String m, int c, float com, float lar, float pro){
        this.marca = m;
        this.capacidade = c;
        this.comprimento = com;
        this.largura = lar;
        this.profundidade = pro;
    }

    public Pendrive(String m, int c, float com, float lar){
        this.marca = m;
        this.capacidade = c;
        this.comprimento = com;
        this.largura = lar;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setCapacidade(float capacidade){
        this.capacidade = (int) capacidade;
    }

    public float getComprimento() {
        return comprimento;
    }
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public float getProfundidade() {
        return profundidade;
    }
    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pendrive [marca=" + marca + ", capacidade=" + capacidade + ", comprimento=" + comprimento + ", largura="
                + largura + ", profundidade=" + profundidade + ", peso=" + peso + ", preco=" + preco + "]";
    }
    
}
