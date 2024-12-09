package AulaPresencial.Aula6;

public abstract class Veiculo implements VeiculoSeguranca {
    private double preco;
    private int numeroPassageiros;
    private Motor motor;
    private String marca;
    private static final int idadeMinimaMotorista = 18;
    private String placa;

    public Veiculo(double preco, int numeroPassageiros, Motor motor, String marca, String placa){
        this.preco = preco;
        this.numeroPassageiros = numeroPassageiros;
        this.motor = motor;
        this.marca = marca;
        this.placa = placa;
    }

    public Veiculo(double preco, int numeroPassageiros, Motor motor, String marca, int idadeMinimaMotorista, String placa){
        this.preco = preco;
        this.numeroPassageiros = numeroPassageiros;
        this.motor = motor;
        this.marca = marca;
        this.placa = placa;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getIdadeMinimaMotorista() {
        return idadeMinimaMotorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract double desconto();

    public void cadastrar(){
        System.out.println("Veiculo cadastrado: " + marca + "- Placa: " + placa);
    }

    public void imprimir(){
        System.out.println("Marca: " + marca + "| Placa: " + placa + "| Preço: " +  preco + "| Passageiros: " + numeroPassageiros );
        motor.imprimir();
    }


}
