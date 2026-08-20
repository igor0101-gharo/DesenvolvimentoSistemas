import java.util.Scanner;

public class MenusAtividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 14;

        while (escolha!=0) {
            System.out.println("====MENU====");
            System.out.println("1-Caixa de papelão");
            System.out.println("2-Sacola plástica");
            System.out.println("3-Embalagem de vidro");
            System.out.println("0-Sair");
            
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nIdeal para transporte e armazenamento.\n");
                    break;
                case 2:
                    System.out.println("\nLeve e prática, mas pouco sustentável.\n");
                    break;
                case 3:
                    System.out.println("\nResistente e reutilizável.\n");
                    break;
                case 0:
                    System.out.println("\nEncerrando...\n");
                    break;
            
                default:
                    System.out.println("\nOpção inválida.\n");
                    break;
            }
        }
        sc.close();
    }
}
