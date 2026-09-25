public class ProdutoDigital extends Produto {

    public ProdutoDigital(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }
    
    @Override 
    public  void venda(double valor,int quantidade){
        System.out.printf("Venda realizada\nValor total: R$%.2f",(valor*quantidade));
    }
    
    public void venda(double valor, int quantidade, double desconto){
        System.out.printf("Venda realizada\nValor total: R$%.2f",(valor*quantidade*desconto));

    }
}
