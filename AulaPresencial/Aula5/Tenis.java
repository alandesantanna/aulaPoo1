package AulaPresencial.Aula5;

public class Tenis extends Calcado {
    private boolean cadarco;
    private boolean esportivo;

    public Tenis(String marca, double preco, String cor, int tamanho, boolean cadarco, boolean esportivo) {
        super(marca, preco, cor, tamanho);
        this.cadarco = cadarco;
        this.esportivo = esportivo;
    }

    public boolean isCadarco() {
        return cadarco;
    }

    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }

    public boolean isEsportivo() {
        return esportivo;
    }

    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cadarço: " + (cadarco ? "Sim" : "Não"));
        System.out.println("Esportivo: " + (esportivo ? "Sim" : "Não"));
    }
}
