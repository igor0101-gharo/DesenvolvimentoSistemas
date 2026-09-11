public class Carro extends Veiculo {
    private int quantidadeportas;

    public Carro(String marca, int ano , int quantidadeportas){
        super(marca, ano);
        this.quantidadeportas = quantidadeportas;
    }

    public int getQuantidadeportas(){
        return  quantidadeportas;
    }

    public void setQuantidadeportas(int quantidadeportas){
        this.quantidadeportas = quantidadeportas;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de portas: "+quantidadeportas);
    }
}
