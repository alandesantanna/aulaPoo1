package AulaPresencial.Aula7;

public class Motor {
    private int potencia;
    private int rpm;
    private String tipoCombustivel;
    
    public Motor(int potencia, int rpm, String tipoCombustivel){
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getRpm() {
        return rpm;
    }
    public void setRpm(int rpm) {
        this.rpm = rpm;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void imprimir(){
        System.out.println("Potência: " + getPotencia() + "HP");
        System.out.println("RPM: " + getRpm());
        System.out.println("Tipo de Combustivel: " + getTipoCombustivel());
    }

    public void entradaDados(int potencia, int rpm, String tipoCombustivel){
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }
    

}
