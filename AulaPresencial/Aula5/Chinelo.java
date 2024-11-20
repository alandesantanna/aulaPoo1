package AulaPresencial.Aula5;

public class Chinelo extends Calcado {
    private boolean acessorio;
    private boolean tiras;

    public Chinelo(String marca, double preco, String cor, int tamanho, boolean acessorio, boolean tiras) {
        super(marca, preco, cor, tamanho);
        this.acessorio = acessorio;
        this.tiras = tiras;
    }

    public boolean isAcessorio() {
        return acessorio;
    }

    public void setAcessorio(boolean acessorio) {
        this.acessorio = acessorio;
    }

    public boolean isTiras() {
        return tiras;
    }

    public void setTiras(boolean tiras) {
        this.tiras = tiras;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Acessório: " + (acessorio ? "Sim" : "Não"));
        System.out.println("Tiras: " + (tiras ? "Sim" : "Não"));
    }
}
