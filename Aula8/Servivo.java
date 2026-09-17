public abstract class Servivo {
    

    private String nome;
    
    
    private  int idade;

    public Servivo(){

    }

    public Servivo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract String exibirInfo();
}
