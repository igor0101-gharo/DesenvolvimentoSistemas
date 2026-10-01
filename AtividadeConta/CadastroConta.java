import java.util.ArrayList;
import java.util.List;

public class CadastroConta {
    private List<Conta> listaContas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        try {
            if(listaContas.size()==100){
                throw new Exception("Limite de número de cadastros atingido.");
            }
            for (int i = 0;i<listaContas.size();i++){
                if(listaContas.get(i).getNumeroTitular().equalsIgnoreCase(conta.getNumeroTitular())){
                    throw new Exception("Já há uma Conta com este número.");
                }
            }
            listaContas.add(conta);
            System.out.println("Conta adicionada com sucesso.");
            
        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
    }
    public void exibirDados(){
        for(int i = 0; i<listaContas.size();i++){
            System.out.println("==================");
            listaContas.get(i).exibirInfo();
            System.out.println("==================");
        }
    }
    
    public void removerConta(int index){
        if (index>=0 && index<listaContas.size()){
            listaContas.remove(index);
            System.out.println("Conta removida com sucesso.");
        }
    }

    public void buscarConta(String numero){
        boolean encontrado = false;
        int indice = -1;
        try {
            for (int i = 0;i<listaContas.size();i++){
                if(listaContas.get(i).getNumeroTitular().equalsIgnoreCase(numero)){
                    encontrado = true;
                    indice = i;
                }
            }
    
            if(!encontrado){
                throw new Exception("Não há conta cadastrada com esse número.");
            }

            listaContas.get(indice).exibirInfo();
            
        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }


    }

    public boolean verificarLista(){
        boolean listaCheia = true;
        if(listaContas.isEmpty()){
            listaCheia = false;
        }
        return listaCheia;
    }

}
