package AulaPresencial.Aula6;

public class Moto extends Veiculo{
    private int volumeBagageiro;

    public Moto(double preco, Motor motor, String marca, String placa, int volumeBagageiro) {
        super(preco, 2, motor, marca, placa);
        this.volumeBagageiro = volumeBagageiro;
    }

    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }

    public void setVolumeBagageiro(int volumeBagageiro) {
        this.volumeBagageiro = volumeBagageiro;
    }

    @Override
    public double desconto(){
        return getPreco() * 0.92;
    }

    @Override
    public void acelerar(){
        System.out.println("Moto acelerando rapidamente...");
    }

    @Override
    public void desacelerar(){
        System.out.println("Moto desacelerando...");
    }

    @Override
    public void frear(){
        System.out.println("Moto freando...");
    }

    @Override
    public void virarDireita() {
        System.out.println("Moto virando à direita...");
    }

    @Override
    public void virarEsquerda() {
        System.out.println("Moto virando à esquerda...");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Volume do Bagageiro: " + volumeBagageiro + " litros");
    }
    
}
