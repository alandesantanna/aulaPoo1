package AulaPresencial.Aula6;

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
        System.out.println("Potência: " + this.potencia + "HP");
        System.out.println("RPM: " + rpm);
        System.out.println("Tipo de Combustivel: " + tipoCombustivel);
    }

    public void entradaDados(int potencia, int rpm, String tipoCombustivel){
        this.potencia = potencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }
}