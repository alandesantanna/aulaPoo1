package AulaPresencial.Aula7;

public class Onibus extends Veiculo{

    public Onibus(double preco, int numPassageiro, String marca, String placa, Motor motor){
        super(preco, numPassageiro, marca, placa, motor);
    }

    @Override
    public void desconto(double porcentagem){
        double valordsct;
        valordsct = getPreco() - (getPreco() * porcentagem/100);
        System.out.println("O valor do desconto é: " + valordsct);
    }
    
    @Override
    public void acelerar(){
        System.out.println("O onibus tá acelerando...");
    }

    @Override
    public void desacelerar(){
        System.out.println("O onibus está perdendo velocidade...");
    }

    @Override
    public void frear(){
        System.out.println("O onibus está freando...");
    }

    @Override
    public void virarDireita(){
        System.out.println("O onibus está virando a direita...");
    }

    @Override
    public void virarEsquerda(){
        System.out.println("O onibus está virando a esquerda...");
    }


}
