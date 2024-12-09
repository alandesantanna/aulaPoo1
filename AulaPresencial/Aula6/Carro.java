package AulaPresencial.Aula6;

public class Carro extends Veiculo {
    private int volumeMala;

    public Carro(double preco, int numeroPassageiros, Motor motor, String placa, int volumeMala){
        super(preco, numeroPassageiros, motor, placa, volumeMala, placa);
        this.volumeMala = volumeMala;
    }

    public int getVolumeMala() {
        return volumeMala;
    }

    public void setVolumeMala(int volumeMala) {
        this.volumeMala = volumeMala;
    }

    @Override
    public double desconto(){
        return getPreco() * 0.90;
    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("Carro desacelerando...");
    }

    @Override
    public void frear(){
        System.out.println("Carro freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("Carro virando à direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("Carro virando a esquerda...");
    }
    
}
