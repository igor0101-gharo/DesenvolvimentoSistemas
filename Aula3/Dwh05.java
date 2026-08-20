import java.util.Scanner;

public class Dwh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("1-Iniciar jogo");
            System.out.println("2-Carregar jogo");
            System.out.println("3-Configurações");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");

            op =sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Iniciando");
                case 2:
                    System.out.println("carregando");
                case 3:
                    System.out.println("configurações");
                case 0:
                    System.out.println("Saindo");
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }while(op!=0);
        
        
        sc.close();
    }
    

}
