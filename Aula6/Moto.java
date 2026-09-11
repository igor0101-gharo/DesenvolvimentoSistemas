public class Moto extends Veiculo  {
    private double cilindradas;

    public Moto(String marca, int ano, double cilindradas){
        super(marca, ano);
        this.cilindradas = cilindradas;

    }

    public double getCilindradas(){
        return  cilindradas;
    }

    public void setCilindradas(double cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cilindradas: "+cilindradas+ "cc");
    }
}
