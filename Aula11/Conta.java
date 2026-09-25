public class Conta {
    private int numeroConta;
    private String titular;
    protected double saldo;
    private Agencia agencia;
    
    public Conta(int numeroConta, String titular, double saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public  void depositar(double valor){
        if (valor>0){
            saldo=saldo+valor;
            System.out.println("Depósito realizado com sucesso");
            System.out.printf("Novo Saldo: R$%.2f",saldo);
        }else{
            System.out.println("Valor do depósito inválido");
        }
    }

    public  void consultarSaldo(){
        System.out.printf("Saldo disponível: R$%.2f%n",saldo);
    }

    public void mostrarDados(){
        System.out.println("=======DADOS DA CONTA=======");
        agencia.mostrarDados();
        System.out.println("Conta: "+numeroConta);
        System.out.println("Titular: "+titular);
        System.out.printf("Saldo: R$%.2f%n",saldo);
    }
}
