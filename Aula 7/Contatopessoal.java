public class Contatopessoal extends Contato {
    private String parentesco;

    public Contatopessoal(String nome, String numero, String parentesco){
        super(nome, numero);
        this.parentesco = parentesco;
    }

    public String getParentesco(){
        return  parentesco;
    }

    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Tipo: Pessoal");
        System.out.println("Parentesco: "+parentesco+"\n\n");
    }
}
