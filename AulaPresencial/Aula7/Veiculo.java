package AulaPresencial.Aula7;

public abstract class Veiculo implements VeiculoSeguro{
    private double preco;
    private int numPassageiro;
    private String marca;
    private String placa;
    private static final int idadeMinima = 18;
    private Motor motor;
    
    public Veiculo(double preco, int numPassageiro, String marca, String placa, Motor motor){
        this.preco = preco;
        this.numPassageiro = numPassageiro;
        this.marca = marca;
        this.placa = placa;
        this.motor = motor;
    }

    public Veiculo(double preco, String marca, String placa, Motor motor){
        this.preco = preco;
        this.numPassageiro = 2;
        this.marca = marca;
        this.placa = placa;
        this.motor = motor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getNumPassageiro(){
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
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public static int getIdademinima() {
        return idadeMinima;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMoto(Motor motor) {
        this.motor = motor;
    }
    public void imprimir(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("NumPassageiros: " + getNumPassageiro());
        System.out.println("Idade Minima do Motorista: " + getIdademinima());
        motor.imprimir();
    }
    public void desconto(double porcentagem){
        double valordsct;
        valordsct = getPreco() - (getPreco() * porcentagem/ 100);
        System.out.println("O valor do desconto é: " + valordsct);
    }

    @Override
    public void acelerar(){
        System.out.println("Veiculo acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("Veiculo desacelerando...");
    }

    @Override
    public void frear(){
        System.out.println("Veiculo freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("Veiculo virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("Veiculo virando a esquerda...");
    }
}
