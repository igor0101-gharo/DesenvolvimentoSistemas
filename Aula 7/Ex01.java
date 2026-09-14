import java.util.ArrayList;

public class Ex01 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marcos");

        //LISTAR
        for (String nome : nomes) {
            System.out.println(nome);
        } 

        //Alterar

        nomes.set(1, "Igor");

        System.out.println("Lista pós alterar");
        for (String nome : nomes) {
            System.out.println(nome);
        } 

        //REMOVER
        nomes.remove(0);
        
        System.out.println("Lista após remover");
        for (String nome : nomes) {
            System.out.println(nome);
        } 

        
    }

}
