public class FuncionarioCLT extends Funcionario implements Pagamento{

    public FuncionarioCLT(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }
    
    @Override 
        public void pagar(float valor){
        System.out.println("Pagamento de salário realizado:");
        System.out.printf("Valor: R$%.2f",valor);
    }
    
    public void pagar(float valor, float bonus){
        System.out.println("Pagamento de salário realizado:");
        System.out.printf("Valor: R$%.2f",(valor+bonus));
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("Salário mensal: R$%.2f\n",getSalario());
    }



}
