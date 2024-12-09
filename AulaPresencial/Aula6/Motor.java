package AulaPresencial.Aula6;

public class Motor {
    private int pontencia;
    private int rpm;
    private String tipoCombustivel;

    public Motor(int pontencia, int rpm, String tipoCombustivel){
        this.pontencia = pontencia;
        this.rpm = rpm;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPontencia() {
        return pontencia;
    }

    public void setPontencia(int pontencia) {
        this.pontencia = pontencia;
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
        System.out.println("Potência: " + pontencia + " | RPM: " + rpm + " | Combustivel" + tipoCombustivel);
    }
}
