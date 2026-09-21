public class FuncionarioFree extends Funcionario implements Pagamento {

    public FuncionarioFree(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }
    
    @Override  
    public void pagar(float valor){
    }

    public void pagar(float valor, int horastrabalhadas){
        float total = valor*horastrabalhadas;
        System.out.printf("Pagamento realizado\n");
        System.out.printf("Valor: R$%.2f",total);
    }
    
    public void pagar(float valor, int horastrabalhadas, float bonus){
        float total = valor*horastrabalhadas + bonus;
        System.out.printf("Pagamento realizado\n");
        System.out.printf("Valor: R$%.2f",total);
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.printf("Salário por hora: R$%.2f\n",getSalario());
    }


}
