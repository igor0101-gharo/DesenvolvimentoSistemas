import java.util.Scanner;

public class AtividadeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 98;

        String[] produtos = new String[5];
        int[] qtd = new int[5];
        int disponivel = 5;


        while (escolha !=6) {
        System.out.println("===MENU===");    
        System.out.println("1-Cadastrar Produto");    
        System.out.println("2-Listar Produtos");    
        System.out.println("3-Pesquisar Produto");    
        System.out.println("4-Alterar Produto");    
        System.out.println("5-Remover Produto");    
        System.out.println("6- Sair");
        
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
            if (disponivel==5){
                System.out.println("Digite o nome do produto: ");
                produtos[0] = sc.next();
                System.out.println("Digite a quantidade do produto: ");
                qtd[0] = sc.nextInt();
                disponivel= disponivel-1;
            }else if(disponivel==4){
                System.out.println("Digite o nome do produto: ");
                produtos[1] = sc.next();
                System.out.println("Digite a quantidade do produto: ");
                qtd[1] = sc.nextInt();
                disponivel= disponivel-1;
                
            }else if(disponivel==3){
                System.out.println("Digite o nome do produto: ");
                produtos[2] = sc.next();
                System.out.println("Digite a quantidade do produto: ");
                qtd[2] = sc.nextInt();
                disponivel= disponivel-1;
                
            }else if(disponivel==2){
                System.out.println("Digite o nome do produto: ");
                produtos[3] = sc.next();
                System.out.println("Digite a quantidade do produto: ");
                qtd[3] = sc.nextInt();
                disponivel= disponivel-1;
                
            }else if(disponivel==1){
                System.out.println("Digite o nome do produto: ");
                produtos[4] = sc.next();
                System.out.println("Digite a quantidade do produto: ");
                qtd[4] = sc.nextInt();
                disponivel= disponivel-1;

            }else if(disponivel==0)
            break;
        
            case 2:
            
            break;
        
            case 3:
            
            break;
        
            case 4:
            
            break;
        
            case 5:
            
            break;
        
            case 6:
            
            break;
        
            default:
                break;

        

        }
        sc.close();
        }
    }
}
