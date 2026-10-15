package view;

import java.util.Scanner;

import controle.ClienteControle;
import modelo.Cliente;

public class ClienteView {
    private Scanner sc = new Scanner(System.in);
    private ClienteControle controle = new ClienteControle();
    
    public void menu() {
        int opcao;

        do {
            System.out.println("========SISTEMA DE CLIENTES========");
            System.out.println("1-Cadastrar");
            System.out.println("2-Listar");
            System.out.println("3-Buscar");
            System.out.println("4-Alterar");
            System.out.println("5-Remover");
            System.out.println("0-Sair");
            System.out.println("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar();
                    
                    break;
            
                case 2:
                    listar();
                    
                    break;
            
                case 3:
                    buscar();
                    
                    break;
            
                case 4:
                    alterar();
                    
                    break;
            
                case 5:
                    remover();
                    
                    break;
            
                case 0:
                    System.out.println("Sistema encerrado.");
                    
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);
    }


    private void cadastrar(){
        System.out.println("\n--- CADASTRO ---");

        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();
        
        System.out.print("Email: ");
        String email = sc.nextLine();

        controle.cadastrar(codigo, nome, telefone, email);

        System.out.println("Cliente cadastrado com sucesso");
    }

    private void listar(){
        System.out.println("\n--- CLIENTES ---");

        if(controle.listar().isEmpty()) {
            System.out.println("Nenhum cliente cadastrado");
        }else{
            for (Cliente cliente : controle.listar()){
                System.out.println("Código: "+ cliente.getCodigo());
                System.out.println("Nome: "+ cliente.getNome());
                System.out.println("telefone: " +cliente.getTelefone());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("---------------------");
            }
        }
    }


    private void buscar(){
        System.out.println("Digite o Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Cliente cliente = controle.buscar(codigo);

        if(cliente != null){
                System.out.println("Código: "+ cliente.getCodigo());
                System.out.println("Nome: "+ cliente.getNome());
                System.out.println("telefone: " +cliente.getTelefone());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("---------------------");
        }else{
            System.out.println("Cliente não encontrado");
        }
    }

    private void alterar(){
        System.out.println("Digite o Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Cliente cliente = controle.buscar(codigo);

        if(cliente == null){
            System.out.println("Cliente não encontrado");
            return ;
        }

        System.out.print("Novo nome:");
        String nome =sc.nextLine();
        
        System.out.print("Novo telefone:");
        String telefone =sc.nextLine();
        
        System.out.print("Novo E-mail:");
        String email =sc.nextLine();

        boolean alterado = controle.alterar(codigo, nome, telefone, email);

        if (alterado) {
            System.out.println("Cliente alterado.");
        }else{
            System.out.println("Não foi possível alterar.");
            
        }
    }

    private void remover() {
        System.out.println("\nDigite o código:");
        int codigo = sc.nextInt();
        sc.nextLine();

        boolean removido = controle.remover(codigo);

        if (removido){
            System.out.println("Cliente removido.");
        }else{
            System.out.println("Cliente não encontrado.");
        }
    }
}
