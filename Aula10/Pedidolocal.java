public class Pedidolocal extends Pedido implements Pagamento {

    public Pedidolocal(int numero, String nome, double valor) {
        super(numero, nome, valor);
    }
    
    public void pagar(double valor){
        System.out.printf("pagamento em dinheiro realizado: R$%.2f%n",valor);
    }
    
    public void pagar(double valor, String chavePix){
        System.out.printf("pagamento em Pix realizado: R$%.2f%n",valor);
        System.out.println("Chave pix: "+chavePix);
    }
    
    public void pagar(double valor, int parcela){
        double valorParcela = valor/parcela;
        System.out.printf("pagamento via cartão realizado: R$%.2f%n",valor);
        System.out.println("Parcelas "+parcela);
        System.out.printf("Valor de cada parcela: R$%.2f%n",valorParcela);
        
    }
}
