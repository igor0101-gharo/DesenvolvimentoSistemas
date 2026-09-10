import java.util.Scanner;

public class Clienteapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;

        do {
            System.out.println("====SISTEMA DE CADASTRO DE CLIENTES====");
            System.out.println("1-Pessoa física");
            System.out.println("2-Pessoa Jurídica");
            System.out.println("0-Sair");
            System.out.println("Escolha a opção:");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida.Digite 0, 1 ou 2");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.next();

                    System.out.println("Informe o endereço: ");
                    String endereco = sc.next();

                    System.out.println("Informe o CPF: ");
                    String cpf = sc.next();


                    ClientePF pf = new ClientePF(nome, endereco, cpf);
                    pf.setNome(nome);
                    pf.setEndereco(endereco);
                    pf.setCpf(cpf);

                    System.out.println("----Dados do cliente PF----");
                    pf.exibirDados();
                    
                    break;
                case 2:
                    System.out.println("Informe o nome: ");
                    String nomepj = sc.next();

                    System.out.println("Informe o endereço: ");
                    String enderecopj = sc.next();

                    System.out.println("Informe o CNPJ: ");
                    String cnpj = sc.next();


                    ClientePJ pj = new ClientePJ(nomepj, enderecopj, cnpj);
                    pj.setNome(nomepj);
                    pj.setEndereco(enderecopj);
                    pj.setCnpj(cnpj);

                    System.out.println("----Dados do cliente PJ----");
                    pj.exibirDados();
                    
                    
                    break;
                case 0:
                    System.out.println("Encerrando....");
                    
                    break;
            
                default:
                    break;
            }
        } while (op!=0);
        
        
        
        sc.close();
    }
}
