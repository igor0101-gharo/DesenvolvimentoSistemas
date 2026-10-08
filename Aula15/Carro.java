

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, String ano) {
        super(marca, modelo, ano);
    }
    
    @Override 
    public String exibirDados(){
        String dados = "Marca do carro: "+getMarca()+"\nModelo do carro: "+getModelo()+"\nAno de fabricação: "+getAno()+"\n\n";
        return  dados;
    }
}
