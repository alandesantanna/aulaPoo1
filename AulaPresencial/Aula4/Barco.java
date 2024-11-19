package AulaPresencial.Aula4;
import java.util.Random;

public final class Barco extends Motor{
    private double comprimento;
    private int capacidade;
    private boolean temCabine;
    private String material;

    public Barco(){
        this.comprimento = 0.0;
        this.capacidade = 0;
        this.temCabine = false;
        this.material = "desconhecido";
    }

    public Barco(double comprimento){
        this.comprimento = comprimento;
        this.capacidade = 0;
        this.temCabine = false;
        this.material = "desconhecido";
    }

    public Barco(double comprimento, int capacidade){
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.temCabine = false;
        this.material = "desconhecido";
    }

    public Barco(double comprimento, int capacidade, boolean temCabine){
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.temCabine = temCabine;
        this.material = "desconhecido";
    }

    public Barco(double comprimento, int capacidade, boolean temCabine, String material){
        this.comprimento = comprimento;
        this.capacidade = capacidade;
        this.temCabine = temCabine;
        this.material = material;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isTemCabine() {
        return temCabine;
    }

    public void setTemCabine(boolean temCabine) {
        this.temCabine = temCabine;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void ancorar(){
        System.out.println("Barco ancorado");
    }

    public void levantarAncora(){
        System.out.println("Ancora levantada");
        System.out.println("Podemos navegar");
    }

    public void navegar(){
        System.out.println("Estamos em alto mar");
    }

    private int gerarCapacidade() {
        Random random = new Random();
        return random.nextInt(21);
    }

    public void exibirCapacidade(){
        System.out.println("A capacidade maxima de pessoas é: " + gerarCapacidade());
    }

    @Override
    public void exibirStatus(){
        System.out.println("O comprimento do barco é:" + getComprimento());
        exibirCapacidade();
        System.out.println("tem cabine? " + isTemCabine());
        System.out.println("O material do barco é: " + getMaterial());
    }
}