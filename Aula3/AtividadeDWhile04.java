import java.util.Scanner;

public class AtividadeDWhile04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int escolha = 0;

        do{
            System.out.println("====MENU====");
            System.out.println("1-Mochila Escolar");
            System.out.println("2-Mochila de Viagem");
            System.out.println("3-Mochila Esportiva");
            System.out.println("0-Sair");
            
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\nCompacta e ideal para estudantes.\n");
                    break;
                case 2:
                    System.out.println("\nEspaçosa, ideal para longas viagens.\n");
                    break;
                case 3:
                    System.out.println("\nLeve, resistente e ergonômica.\n");
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
