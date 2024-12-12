package AulaPresencial.Aula6;

public class Moto extends Veiculo{
    
    public Moto(double preco, int numPassageiro, String marca, Motor motor, String placa) {
        super(preco, numPassageiro, marca, motor, placa);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando em múltiplos de 200 RPM");
    }

    @Override
    public void desacelerar() {
        System.out.println("Moto perdendo velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("Moto freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("Moto virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("Moto virando a esquerda...");
    }
}
