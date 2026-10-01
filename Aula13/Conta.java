public class Conta {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    public Conta(String nomeTitular, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDados(){
        System.out.println("Nome do titular: "+nomeTitular);
        System.out.println("Número da conta: "+numeroConta);
        System.out.printf("Saldo: R$%.2f%n",saldo);
    }
}
