package AulaPresencial.Aula6;

public class Carro extends Veiculo{

    public Carro(double preco, int numPassageiro,String marca, Motor motor, String placa) {
        super(preco, numPassageiro, marca, motor, placa);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando em múltiplos de 100 RPM");
    }

    @Override
    public void desacelerar() {
        System.out.println("Carro perdendo velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("Carro freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("Carro virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("Carro virando a esquerda...");
    }
}
