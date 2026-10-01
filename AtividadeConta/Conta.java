public class Conta {
    private String nomeTitular;
    private String numeroTitular;
    private double saldo;
    public Conta(String nomeTitular, String numeroTitular, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroTitular = numeroTitular;
        this.saldo = saldo;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public String getNumeroTitular() {
        return numeroTitular;
    }
    public void setNumeroTitular(String numeroTitular) {
        this.numeroTitular = numeroTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setDados(String nome,String numero, double saldo){
        try {
            
            if (nome.trim().isEmpty()){
                throw new Exception("Nome não pode ser vazio.");
            }
            if (numero.trim().isEmpty()){
                throw new Exception("Número não pode ser vazio.");
            }
            if (saldo < 0){
                throw new Exception("O saldo não pode ser negativo");
            }
        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
    public void exibirInfo(){
        System.out.println("Nome do titular: "+nomeTitular);
        System.out.println("Número da conta: "+numeroTitular);
        System.out.printf("Saldo: R$%.2f%n",saldo);
    } 
}
