package projeto.modelo;

public class Gerente extends Funcionario{
    private String departamento;


    public Gerente(){}

    public Gerente(int matricula, String nome, int idade, String departamento) {
        super(matricula, nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

        @Override 
    public String toString() {
        return "Tipo: Gerente\nmatrícula: "+getMatricula() +"nome: "+ getNome()+ "\nIdade: "+getIdade()+ "\ndepartaemnto:" +departamento;
    }
}
