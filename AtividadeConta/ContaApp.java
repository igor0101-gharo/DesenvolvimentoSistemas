import java.util.Scanner;

public class ContaApp {
    public static void main(String[] args) {
        CadastroConta cadastro =  new CadastroConta();
        Scanner sc = new Scanner(System.in);
        
        int op = -1;
        
        while (op!=4) {
            try {
                System.out.println("======CADASTRO DE CONTAS======");
                System.out.println("1-Cadastrar Conta.");
                System.out.println("2-Buscar Conta.");
                System.out.println("3-Remover conta.");
                System.out.println("4-Sair.");
                System.out.println("Escolha a opção: ");
                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        
                        break;
                
                    case 2:
                        
                        break;
                
                    case 3:
                        
                        break;
                
                    case 4:
                        
                        break;
                
                    default:
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            
        }
        
        
        
        sc.close();
    
    
    }


}
