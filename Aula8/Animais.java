import java.util.ArrayList;

public class Animais {
    private ArrayList<Servivo>listaAnimais;

    public Animais(){
        listaAnimais = new ArrayList<>();

    }

    public void adicionarAnimais(Servivo a){
        listaAnimais.add(a);

        System.out.println("Animal cadastrado.");
    }


    public void listarAnimais(){
        if(listaAnimais.isEmpty()){
            System.out.println("Lista vazia.");
        }else{
            System.out.println("\n----Lista de Animais----");
            for (int i =0;i<listaAnimais.size();i++){
                System.out.println((i+1)+"- "+listaAnimais.get(i));
            }
        }
    }

    public void atualizarAnimal(int indice, Servivo novoServivo){
        if (indice>=0 && indice<listaAnimais.size()){
            listaAnimais.set(indice, novoServivo);
            System.out.println("Animal cadastrado com sucesso");
        }else{
            System.out.println("indice inválido");
        }
    }

    public void removerAnimal(int indice){
        if (indice>=0 && indice<listaAnimais.size()){
            listaAnimais.remove(indice);
            System.out.println("Animal removido com sucesso");
        }else{
            System.out.println("indice inválido");
        }
    }
}
