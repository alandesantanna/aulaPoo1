package AulaPresencial.Aula4;

public final class Moto extends Motor {
    private boolean temBagageiro;
    private String tipo;
    private int cilindradas;
    private boolean luzesLigadas;

    public Moto(){
        this.temBagageiro = false;
        this.tipo = "desconhecido";
        this.cilindradas = 0;
        this.luzesLigadas = false;
    }
    
    public Moto(boolean temBagageiro){
        this.temBagageiro = temBagageiro;
        this.tipo = "desconhecido";
        this.cilindradas = 0;
        this.luzesLigadas = false;
    }

    public Moto(boolean temBagageiro, String tipo){
        this.temBagageiro = temBagageiro;
        this.tipo = tipo;
        this.cilindradas = 0;
        this.luzesLigadas = false;
    }

    public Moto(boolean temBagageiro, String tipo, int cilindradas){
        this.temBagageiro = temBagageiro;
        this.tipo = tipo;
        this.cilindradas = cilindradas;
        this.luzesLigadas = false;
    }

    public Moto(boolean temBagageiro, String tipo, int cilindradas, boolean luzesLigadas){
        this.temBagageiro = temBagageiro;
        this.tipo = tipo;
        this.cilindradas = cilindradas;
        this.luzesLigadas = luzesLigadas;
    }

    public boolean isTemBagageiro() {
        return temBagageiro;
    }

    public void setTemBagageiro(boolean temBagageiro) {
        this.temBagageiro = temBagageiro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isLuzesLigadas() {
        return luzesLigadas;
    }

    public void setLuzesLigadas(boolean luzesLigadas) {
        this.luzesLigadas = luzesLigadas;
    }

    public void colocarCapacete(){
        System.out.println("Capacete colocado");
    }

    public void retirarCapacete(){
        System.out.println("Capacete retirado");
    }

    public void desligarLuzes(){
        this.setLuzesLigadas(false);
    }

    public void ligarLuzes(){
        this.setLuzesLigadas(true);
    }
}
