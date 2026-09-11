import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        String nome;
        double salario;
        String disciplina;
        String setor;
        boolean cadastroProfessor = false;
        boolean cadastroTecnico = false;
        Professor pf = new Professor(null,0,null);
        Tecnico tc = new Tecnico(null, 0, null);

        do {
            System.out.println("\n=====SISTEMA DE FUNCIONÁRIOS=====");
            System.out.println("1-Cadastrar Professor");
            System.out.println("2-Cadastrar Técnico");
            System.out.println("3-Exibir Professor");
            System.out.println("4-Exibir Técnico");
            System.out.println("0-Sair");
            System.out.println("Escoha uma das opções");

            while (!sc.hasNextInt()) {
                System.out.println("Input inválido. Digite apenas números");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome:");
                    nome = sc.next();

                    System.out.println("Informe o salário:");
                    salario = sc.nextDouble();

                    System.out.println("Informe a disciplina: ");
                    disciplina = sc.next();

                    
                    pf.setNome(nome);
                    pf.setSalario(salario);
                    pf.setDisciplina(disciplina);

                    cadastroProfessor = true;

                    System.out.println("Professor Cadastrado");
                
                  
                    
                    break;
            
                case 2:
                      System.out.println("Informe o nome:");
                    nome = sc.next();

                    System.out.println("Informe o salário:");
                    salario = sc.nextDouble();

                    System.out.println("Informe o setor: ");
                    setor = sc.next();

               
                    tc.setNome(nome);
                    tc.setSalario(salario);
                    tc.setSetor(setor);

                    cadastroTecnico = true;

                    System.out.println("Técnico Cadastrado");

                
                    
                    break;
            
                case 3:
                    if(!cadastroProfessor){
                        System.out.println("Professor ainda não cadastrado.");
                    }else{
                        System.out.println("====PROFESSOR CADASTRADO====");
                        pf.exibirInfo();
                    }
                    
                    break;
            
                case 4:
                    if(!cadastroTecnico){
                        System.out.println("Técnico ainda não cadastrado");
                    }else{
                        System.out.println("====TÉCNICO CADASTRADO====");
                        tc.exibirInfo();
                    }
                    
                    break;
            
                case 0:
                    System.out.println("Encerrando...");
                    break;
            
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


        } while (op!=0);
        
        
        
        
        
        
        sc.close();
    }
}
