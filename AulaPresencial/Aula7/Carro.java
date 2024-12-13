package AulaPresencial.Aula7;

public class Carro extends Veiculo{
    private int volumeMala;

    public Carro(double preco, int numPassageiro, String marca, String placa, Motor motor, int volumeMala){
        super(preco, numPassageiro, marca, placa, motor);
        this.volumeMala = volumeMala;
    }

    public int getVolumeMala() {
        return volumeMala;
    }

    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }
    
    @Override
    public void desconto(double porcentagem){
        double valordsct;
        valordsct = getPreco() - (getPreco() * porcentagem/100);
        System.out.println("O valor do desconto é: " + valordsct);
    }
    
    @Override
    public void acelerar(){
        System.out.println("O carro tá acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("O carro está perdendo velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("O carro está freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("O carro está virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("O carro está virando a esquerda...");
    }


}
