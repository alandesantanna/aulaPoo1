package AulaPresencial.Aula4;

public class Motor {
     private String tipoCombustivel;
     private int potencia;
     private double peso;
     private boolean ligado;

    public Motor(){
        this.tipoCombustivel = "Desconhecido";
        this.potencia = 0;        
        this.peso = 0.0;
        this.ligado = false;
    }

    public Motor(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = 0;
        this.peso = 0.0;
        this.ligado = false;
    }

    public Motor(String tipoCombustivel, int potencia){
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.peso = 0.0;
        this.ligado = false;
    }

    public Motor(String tipoCombustivel, int potencia, double peso){
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.peso = peso;
        this.ligado = false;
    }

    public Motor(String tipoCombustivel, int potencia, double peso, boolean ligado){
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.peso = peso;
        this.ligado = ligado;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }
    public void exibirStatus(){
        System.out.println("O tipo de combustivel desse motor é:" + getTipoCombustivel());
        System.out.println("A potencia desse motor é:" + getPotencia());
        System.out.println("Peso do moto: " + getPeso());
    }
     
}