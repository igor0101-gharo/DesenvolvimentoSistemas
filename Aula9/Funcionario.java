public class Funcionario {
    private String nome;
    private String cpf;
    private float salario;
    
    
    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public float getSalario() {
        return salario;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
    }
}
