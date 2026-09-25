

public class ProdutoFisico extends Produto {


    public ProdutoFisico(String codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    @Override 
    public void venda(double valor,int quantidade){

    }

    
    public void venda(double valor, int quantidade,double frete){
        System.out.printf("Venda realizada\nValor total: R$%.2f",(valor*quantidade+frete));
    }
    
    public void venda(double valor, int quantidade, double frete, double desconto){
        System.out.printf("Venda realizada\nValor total: R$%.2f",(valor*quantidade*desconto+frete));

    }
}
