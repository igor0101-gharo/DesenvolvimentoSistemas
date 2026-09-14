import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato>contatos = new ArrayList<>();

        while (true) {
            System.out.println("=====SDCC=====");
            System.out.println("1-Cadastrar Contato");
            System.out.println("2-Listar Contato");
            System.out.println("3-Excluir Contato");
            System.out.println("4-Alterar Contato");
            System.out.println("5-Pesquisar Contato");
            System.out.println("6- Sair");
            System.out.println("Opção: ");

            int op = sc.nextInt();
            sc.nextLine();


            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();

                    System.out.println("Informe o telefone");
                    String numero = sc.next();


                    contatos.add(new Contato(nome, numero));

                    System.out.println("Cadastro realizado!");
                    break;
            
                case 2:
                    System.out.println("Nomes Cadastrados:\n");
                    for (int i = 0;i<contatos.size();i++){
                        System.out.println((i+1) +" - "+contatos.get(i));
                    }
                    
                    break;
            
                case 3:
                    System.out.println("Informe o indice para remover: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    if(indice>0 && indice<=contatos.size()){
                        contatos.remove(indice-1);
                        System.out.println("Contato removido!");
                    }else{
                        System.out.println("Contato inválido!");
                    }


                    
                    break;
            
                case 4:
                    System.out.println("informe o número para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos>0 && pos<=contatos.size()){
                        System.out.println("Novo nome");
                        String novoNome = sc.next();

                        System.out.println("Novo número");
                        String novoNumero = sc.next();
                        contatos.get(pos -1).setNome(novoNome);
                        contatos.get(pos-1).setNumero(novoNumero);
                    }else{
                        System.out.println("Contato inválido");
                    }
                    
                    break;
            
                case 5:
                    System.out.println("Informe o nome para pesquisar:");
                    String busca = sc.next();

                    boolean encontrado = false;

                    for(int i =0;i<contatos.size();i++){
                        if(contatos.get(i).getNome().equalsIgnoreCase(busca)){
                            System.out.println("Encontrado: "+contatos.get(i));

                            encontrado = true;
                        }
                    }
                    
                    if(!encontrado){
                        System.out.println("contato não encontrado");
                    }
                    break;
            
                case 6:
                    System.out.println("Encerrando.");

                    sc.close();
                    return ;
                    
            
                default:
                    System.out.println("opção inválida.");
                    break;
            }
        }
        
        
        
        
        
        
    }
}
