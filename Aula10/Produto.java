

public class Produto implements Venda {
    private String codigo;
    private String nome;
    private double preco;
    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override 
    public void venda(double valor, int quantidade){
        
    }
    public void venda(double valor, int quantidade, double frete){

    }
    
    public void venda(double valor, int quantidade, double frete, double desconto){

    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Codigo: "+codigo);
        System.out.printf("Preço: R$%.2f\n",preco);
    }

    
}
