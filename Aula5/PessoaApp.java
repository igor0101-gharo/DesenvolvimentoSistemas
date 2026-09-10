public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Igor");
        Pessoa p2 = new Pessoa(2, "Maria");

        //acessar
        System.out.println("Pessoa "+p1.getCodigo()+ " Nome: "+p1.getNome());
        
        //modificar
        p1.setNome("Vanessa");


        System.out.println("Pessoa " + p1.getCodigo()+ " Nome: "+p1.getNome());


    }
}
