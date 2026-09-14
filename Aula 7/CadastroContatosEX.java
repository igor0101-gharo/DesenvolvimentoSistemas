import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatosEX {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        ArrayList<Contato>contatos = new ArrayList<>();
        String nome;
        String numero;

        while (true) {
            System.out.println("\n=====AGENDA DE CONTATOS=====");
            System.out.println("1-Cadastrar contato pessoal");
            System.out.println("2-Cadastrar contato profissional");
            System.out.println("3-Listar todos os contatos");
            System.out.println("4-Pesquisar contato");
            System.out.println("5-Alterar contato");
            System.out.println("6-Excluir contato");
            System.out.println("7-Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                    nome = sc.next();

                    System.out.println("Informe o telefone:");
                    numero = sc.next();

                    System.out.println("Informe o parentesco:");
                    String parentesco = sc.next();

                    contatos.add(new Contatopessoal(nome, numero, parentesco));
                    System.out.println("\nContato pessoal cadastrado!");
                    
                    break;
            
                case 2:
                    System.out.println("Informe o nome: ");
                    nome = sc.next();

                    System.out.println("Informe o telefone:");
                    numero = sc.next();

                    System.out.println("Informe a empresa: ");
                    String empresa = sc.next();

                    System.out.println("Informe o cargo:");
                    String cargo = sc.next();

                    contatos.add(new Contatoprofissional(nome, numero, empresa, cargo));
                    System.out.println("\nContato profissional cadastrado!");
                    
                    break;
            
                case 3:
                    System.out.println("=====Contatos Cadastrados=====\n");
                    for (int i = 0;i<contatos.size();i++){
                        contatos.get(i).exibirDados();
                    }
                    
                    
                    break;
            
                case 4:
                    System.out.println("Informe o nome do contato para pesquisar: ");
                    String busca = sc.next();

                    boolean encontrado = false;

                    for(int i =0;i<contatos.size();i++){
                        if(contatos.get(i).getNome().equalsIgnoreCase(busca)){
                            System.out.println("Contato encontrado!\n");
                            contatos.get(i).exibirDados();
                            encontrado = true;
                        }
                    }

                    if(!encontrado){
                        System.out.println("Contato não encontrado.");
                    }

                    
                    break;
            
                case 5:
                    for(int i = 0;i<contatos.size();i++){
                        System.out.println((i+1)+" - "+contatos.get(i).getNome());
                    }

                    System.out.println("Digite o índice do contato que deseja alterar: ");
                    int indice = sc.nextInt();

                    if(indice>0 && indice<=contatos.size()){
                        System.out.println("Novo nome:");
                        String novoNome = sc.next();

                        System.out.println("Novo telefone:");
                        String novoNumero = sc.next();
                        contatos.get(indice-1).setNome(novoNome);
                        contatos.get(indice-1).setNumero(novoNumero);

                    }else{
                        System.out.println("Indice inválido!");
                    }
                    
                    break;
            
                case 6:
                    for(int i = 0;i<contatos.size();i++){
                        System.out.println((i+1)+" - "+contatos.get(i).getNome());
                    }
                    System.out.println("Digite o indice que deseja excluir: ");
                    int pos =sc.nextInt();

                    if(pos>0 && pos<=contatos.size()){
                        contatos.remove(pos-1);
                        System.out.println("Contato excluído com sucesso.");
                    }else{
                        System.out.println("número inválido");
                    }


                    
                    break;
            
                case 7:
                    System.out.println("Encerrando...");
                    sc.close();
                    return ;
                    
            
                default:
                    break;
            }





        }
    }
}
