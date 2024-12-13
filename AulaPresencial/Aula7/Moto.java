package AulaPresencial.Aula7;

public class Moto extends Veiculo{

    public Moto(double preco, String marca, String placa, Motor motor){
        super(preco, marca, placa, motor);
    }

    @Override
    public void desconto(double porcentagem){
        double valordsct;
        valordsct = getPreco() - (getPreco() * porcentagem / 100);
        System.out.println("O valor do desconto é: " + valordsct);
    }

    @Override
    public void acelerar(){
        System.out.println("A moto tá acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("A moto está perdendo velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("A moto está freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("A moto está virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("A moto está virando a esquerda...");
    }



}
