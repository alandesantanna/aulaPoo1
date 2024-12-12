package AulaPresencial.Aula6;

public class Onibus extends Veiculo{
    
    public Onibus(double preco, int numPassageiro, String marca, Motor motor, String placa) {
        super(preco, numPassageiro, marca, motor, placa);
    }

    @Override
    public void acelerar(){
        System.out.println("Onibus acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("Onibus perdendo a velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("Onibus freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("Onibus virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("Onibus virando a esquerda...");
    }

}
