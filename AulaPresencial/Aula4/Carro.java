package AulaPresencial.Aula4;

public final class Carro extends  Motor {
    private int numeroPortas;
    private String modelo;
    private String cor;
    private boolean arCondicionado;
    
    public Carro(){
        this.numeroPortas = 0;
        this.modelo = "desconhecido";
        this.cor = "desconhecido";
        this.arCondicionado = false;
    }

    public Carro(int numeroPortas){
        this.numeroPortas = numeroPortas;
        this.modelo = "desconhecido";
        this.cor = "desconhecido";
        this.arCondicionado = false;
    }

    public Carro(int numeroPortas, String modelo){
        this.numeroPortas = numeroPortas;
        this.modelo = modelo;
        this.cor = "desconhecido";
        this.arCondicionado = false;
    }

    public Carro(int numeroPortas, String modelo, String cor){
        this.numeroPortas = numeroPortas;
        this.modelo = modelo;
        this.cor = cor;
        this.arCondicionado = false;
    }

    public Carro(int numeroPortas, String modelo, String cor, boolean arCondicionado){
        this.numeroPortas = numeroPortas;
        this.modelo = modelo;
        this.cor = cor;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public void abrirPorta(){
        System.out.println("Porta aberta");
    }
    
    public void fecharPorta(){
        System.out.println("Porta Fechada");
    }

    public void ativarArCondicionado(){
        this.setArCondicionado(true);
    }

    public void desativarArCondicionado(){
        this.setArCondicionado(false);
    }
}
