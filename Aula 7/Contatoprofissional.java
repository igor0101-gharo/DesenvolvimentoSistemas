public class Contatoprofissional extends Contato {
    private String empresa;
    private String cargo;

    public Contatoprofissional(String nome, String numero,String empresa,String cargo){
        super(nome, numero);
        this.empresa =empresa;
        this.cargo =cargo;
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Tipo: Profissional");
        System.out.println("Empresa: "+empresa);
        System.out.println("Cargo: "+cargo+"\n\n");
    }



}
