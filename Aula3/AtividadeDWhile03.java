import java.util.Scanner;

public class AtividadeDWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 0;

        do{
            System.out.println("====MENU====");
            System.out.println("1-Caneta Esferográfica");
            System.out.println("2-Caneta Gel");
            System.out.println("3-Caneta Tinteiro");
            System.out.println("0-Sair");
            
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nEconômica e de longa duração.\n");
                    break;
                case 2:
                    System.out.println("\nTinta mais pigmentada e escrita suave.\n");
                    break;
                case 3:
                    System.out.println("\nClássica e elegante, usada para caligrafia.\n");
                    break;
                case 0:
                    System.out.println("\nEncerrando...\n");
                    break;
            
                default:
                    System.out.println("\nOpção inválida.\n");
                    break;
            }
        }while (escolha!=0);

        sc.close();
    }
}
