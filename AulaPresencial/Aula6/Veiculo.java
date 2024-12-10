package AulaPresencial.Aula6;

public abstract class Veiculo implements VeiculoSeguro{
    private double preco;
    private int numPassageiro;
    private String marca;
    private Motor motor;
    private static final int idadeMinima = 18;
    private String placa;

    public Veiculo(double preco, int numPassageiro, String marca, Motor motor, String placa){
        this.preco = preco;
        this.numPassageiro = numPassageiro;
        this.marca = marca;
        this.motor = motor;
        this.placa = placa;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getNumPassageiro(){
        return numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro){
        this.numPassageiro = numPassageiro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int getIdademinima() {
        return idadeMinima;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public void acelerar(){
        System.out.println(this.marca + "está acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println(this.marca + "está desacelerando...");
    }

    @Override
    public void frear(){
        System.out.println(this.marca + "está freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println(this.marca + "tá virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println(this.marca + "tá virando a esquerda...");
    }
}
