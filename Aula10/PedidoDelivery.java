public class PedidoDelivery extends Pedido implements Pagamento {
    private String endereco;
    private double taxaEntrega;
    public PedidoDelivery(int numero, String nome, double valor, String endereco, double taxaEntrega) {
        super(numero, nome, valor);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getTaxaEntrega() {
        return taxaEntrega;
    }
    public void setTaxaEntrega(double taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }
    
    public double calcularTotal(){
        return getValor()+taxaEntrega;
    }

    @Override 
    public void pagar(double valor){
        System.out.printf("Pagamento em dinheiro realizado: R$%.2f%n",valor);
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

    @Override 
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Endereço: "+endereco);
        System.out.printf("Taxa de entrega: R$%.2f%n",taxaEntrega);
        System.out.printf("Valor Total: R$%.2f%n",calcularTotal());
    }

}
