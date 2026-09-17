public class Cavalo extends Servivo{
    
    
    private String raca;

    public Cavalo(){

    }


    public Cavalo(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }


    public String getRaca() {
        return raca;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }
    @Override 
    public String exibirInfo(){
        return "Cavalo | Nome: "+getNome()
        +"|Idade: "+getIdade()
        +"|Raça: "+(raca==null ?"":raca);
    }
    
}
