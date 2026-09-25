public class ContaCorrente extends Conta implements Pagamento{

    public ContaCorrente(int numeroConta, String titular, double saldo, Agencia agencia) {
        super(numeroConta, titular, saldo, agencia);
    }
    
    @Override 
    public void pagar(double valor){
        if (valor <=0){
            System.out.println("Pagamento inválido");
        }else if(valor>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo=saldo-valor;
            System.out.println("Pagamento em dinheiro realizado!");
            System.out.printf("Valor pago: R$%.2f%n",valor);
            System.out.printf("Saldo atual: R$%.2f%n",saldo);
        }
    }

    public void pagar(double valor, String chavePix){
        if (valor<=0){
            System.out.println("Pagamento inválido.");
        }else if(valor>saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            saldo =saldo-valor;
            System.out.println("Pagameno via Pix realizado");
            System.out.println("Chave Pix: "+chavePix);
            System.out.printf("Valor pago: R$ %.2f%n",valor);
            System.out.printf("Saldo atual: R$ %.2f%n",saldo);
        }
    }
    
    public void pagar(double valor, int parcela){
        if (valor<=0){
            System.out.println("Pagamento inválido.");
        }else if(parcela<=0) {
            System.out.println("Quantidade de parcelas inválida");
        }else if(valor>saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            saldo =saldo-valor;
            double valorParcela=valor/parcela;
            System.out.println("Pagameno via Cartão realizado");
            System.out.println("Quantidade de parcelas: "+parcela);
            System.out.printf("Valor da compra: R$ %.2f%n",valor);
            System.out.printf("Valor de cada parcela: R$ %.2f%n",valorParcela);
            System.out.printf("Saldo atual: R$ %.2f%n",saldo);
        }
    }
}
