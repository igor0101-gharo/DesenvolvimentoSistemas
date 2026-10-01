import java.util.ArrayList;
import java.util.Scanner;

public class ContaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Conta>listaContas = new ArrayList<>();
        //variaveis
        String busca;
        boolean encontrado;
        String nome;
        String numero;
        double saldo;
        int op = -1;
        while (op!=4) {
            try {
                System.out.println("\n\n=====SISTEMA DE CADASTRO DE CONTAS=====");
                System.out.println("1-Cadastrar Conta");
                System.out.println("2-Buscar Conta");
                System.out.println("3-Remover Conta");
                System.out.println("4-Sair");
                System.out.println("Escolha a opção");

                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        if (listaContas.size()==100){
                            throw new Exception("Limite de contas cadastradas atingido.");
                        }

                        System.out.println("Informe o número da conta:");
                        numero = sc.nextLine();
                        if(numero.trim().isEmpty()){
                            throw new Exception("O campo número não pode ser vazio.");
                        }

                        for(int i=0;i<listaContas.size();i++){
                            if(listaContas.get(i).getNumeroConta().equalsIgnoreCase(numero)){
                                throw new Exception("Já há uma conta com este número.");
                            }
                        }
                        
                        System.out.println("Informe o nome do titular:");
                        nome = sc.nextLine();
                        if (nome.trim().isEmpty()){
                            throw new Exception("O campo nome não pode ser vazio.");
                        }

                        System.out.println("Informe o Saldo inicial da conta:");
                        saldo = sc.nextDouble();
                        sc.nextLine();
                        if (saldo < 0){
                            throw new Exception("O saldo não pode ser negativo.");
                        }

                        Conta novaConta = new Conta(nome, numero, saldo);
                        listaContas.add(novaConta);


                        break;
                
                    case 2:
                        if(listaContas.isEmpty()){
                            System.out.println("Lista vazia.");
                        }else{
                            System.out.println("Digite o número da conta: ");
                            busca = sc.nextLine();
                            encontrado = false;

                            for (int i = 0;i<listaContas.size();i++){
                                if(listaContas.get(i).getNumeroConta().equalsIgnoreCase(busca)){
                                    System.out.println("======================");
                                    listaContas.get(i).exibirDados();
                                    System.out.println("======================");
                                    encontrado = true;
                                }
                            }
                            if (!encontrado){
                                throw new Exception("Não há Conta Cadastrada com esse número.");
                            }
                        }
                        
                        break;
                
                    case 3:
                        if(listaContas.isEmpty()){
                            System.out.println("Lista vazia.");
                        }else{
                            System.out.println("Digite o número da conta: ");
                            busca = sc.nextLine();
                            encontrado = false;

                            for(int i = 0; i<listaContas.size();i++){
                                if(listaContas.get(i).getNumeroConta().equalsIgnoreCase(busca)){
                                    listaContas.remove(i);
                                    encontrado = true;
                                    System.out.println("Conta Removida.");
                                }
                            }
                            if(!encontrado){
                                throw new Exception("Conta não encontrada");
                            }
                        }
                        break;
                
                    case 4:
                        System.out.println("Saindo.");
                        
                        break;
                    
                    case 5:
                        if(listaContas.isEmpty()){
                            System.out.println("Lista Vazia");
                        }else{
                            System.out.println("=====Lista de contas=====");
                            for(int i =0;i<listaContas.size();i++){
                                System.out.println("======================");
                                listaContas.get(i).exibirDados();
                                System.out.println("======================");
                            }
                        }
                        break;
                
                    default:
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: "+e.getMessage());
            }
            
        }


        
        
        
        
        sc.close();
    }
}
