import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<FuncionarioCLT>clts =new ArrayList<>();
        ArrayList<FuncionarioFree>free =new ArrayList<>();
        String nome;
        String cpf;
        float salario;
        String nomebusca;
        int horastrabalhadas;
        float bonus;

        int op;
        int op2;


        do {
            System.out.println("\n=====SISTEMA DE CADASTRO DE FUNCIONÁRIOS=====");
            System.out.println("1-Cadastrar Funcionário");
            System.out.println("2-Mostrar dados cadastrados");
            System.out.println("3-Pagamento");
            System.out.println("4-Pagamento com bônus");
            System.out.println("5-Fazer consulta");
            System.out.println("0-Sair");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite números");
                sc.next();
            }

            op =sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:

                    System.out.println("Digite o nome do funcionário");
                    nome = sc.next();
                    
                    System.out.println("Digite o CPF do funcionário");
                    cpf =sc.next();

                    System.out.println("Digite o Salário do funcionário");
                    salario = sc.nextFloat();

                    System.out.println("O funcionário é CLT(1) ou Freelance(2)?");
                    while (!sc.hasNextInt()) {
                        System.out.println("Opção inválida. Digite números");
                        sc.next();
                    }

                    op2 = sc.nextInt();
                    sc.nextLine();

                    switch (op2) {
                        case 1:


                            clts.add(new FuncionarioCLT(nome, cpf, salario));
                            System.out.println("Funcionário clt cadastrado");
                            
                            break;
                    
                        case 2:
                            free.add(new FuncionarioFree(nome, cpf, salario));
                            System.out.println("Funcionário Freelance cadastrado");

                            break;
                    
                        default:

                            System.out.println("Valor inválido. Operação cancelada.");
                            break;
                    }






                    break;
            
                case 2:

                    System.out.println("-----Lista de funcionários cadastrados-----");
                    System.out.println("-----CLT-----");
                    if (clts.isEmpty()){
                        System.out.println("Sem funciónarios CLTs cadastrados.");
                    }else{
                        for(int i = 0;i<clts.size();i++){
                            clts.get(i).exibirDados();
                        }
                    }

                    System.out.println("-----FREeLANCE-----");
                    if(free.isEmpty()){
                        System.out.println("Sem funcionários Freelance cadastrados");
                    }else{
                        for(int i = 0; i<free.size();i++){
                            free.get(i).exibirDados();
                        }
                    }
                    
                    
                    break;
            
                case 3:
                    System.out.println("Digite o nome do funcionário que deseja pagar");
                    nomebusca = sc.next();
                    boolean encontrado = false ;

                    for (int i = 0;i<clts.size();i++){
                        if (clts.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            System.out.println("Funcionário "+clts.get(i).getNome()+":");
                            clts.get(i).pagar(clts.get(i).getSalario());
                            encontrado = true;
                        }
                    }
                    
                    for (int i = 0;i<free.size();i++){
                        if(free.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            System.out.println("Digite a quantidade de horas trabalhadas");
                            horastrabalhadas = sc.nextInt();
                            System.out.println("Funcionário "+free.get(i).getNome()+":");
                            free.get(i).pagar(free.get(i).getSalario(),horastrabalhadas);
                            encontrado = true;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Funcionário não encontrado.");
                    }

                    
                    break;
            
                case 4:
                    System.out.println("Digite o nome do funcionário que deseja pagar");
                    nomebusca = sc.next();
                    encontrado = false ;

                    for (int i = 0;i<clts.size();i++){
                        if (clts.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            System.out.println("Digite o bônus a ser oferecido");
                            bonus = sc.nextFloat();
                            System.out.println("Funcionário "+clts.get(i).getNome()+":");
                            clts.get(i).pagar(clts.get(i).getSalario(),bonus);
                            encontrado = true;
                        }
                    }
                    
                    for (int i = 0;i<free.size();i++){
                        if(free.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            System.out.println("Digite a quantidade de horas trabalhadas");
                            horastrabalhadas = sc.nextInt();
                            System.out.println("Digite o bônus a ser oferecido");
                            bonus = sc.nextFloat();
                            System.out.println("Funcionário "+free.get(i).getNome()+":");
                            free.get(i).pagar(free.get(i).getSalario(),horastrabalhadas, bonus);
                            encontrado = true;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Funcionário não encontrado.");
                    }

                    break;
            
                case 5:
                    System.out.println("Digite o nome do funcionário que deseja encontrar");
                    nomebusca = sc.next();
                    encontrado = false ;

                    for (int i = 0;i<clts.size();i++){
                        if (clts.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            clts.get(i).exibirDados();
                            encontrado = true;
                        }
                    }

                    for (int i = 0;i<free.size();i++){
                        if(free.get(i).getNome().equalsIgnoreCase(nomebusca)){
                            free.get(i).exibirDados();
                            encontrado = true;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Funcionário não encontrado.");
                    }


                    
                    break;
            
                case 0:
                    System.out.println("Encerrando....");
                    
                    break;
            
                default:
                    System.out.println("Valor inválido.");

                    break;
            }
            
        } while (op !=0);
        
        
        
        
        
        
        
        
        sc.close();
    }
}
