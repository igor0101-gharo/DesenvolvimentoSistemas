import java.util.Scanner;

public class AtividadeFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha = 45;
        do{
            System.out.println("===Menu===");
            System.out.println("1-Calcular a Tabuada");
            System.out.println("2-Contagem regressiva");
            System.out.println("0-Sair");
            
            escolha=sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite o número que deseja:");
                    int numero=sc.nextInt();
                    System.out.println("===TABUADA DE "+numero+"===");
                    for(int i=1;i<=10;i++){
                        System.out.println(numero+" x "+i+" = "+(numero*i));
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Digite o numero inicial para a contagem: ");
                    int inicio=sc.nextInt();
                    System.out.println("===CONTAGEM REGRESSIVA===");
                    for(int m= inicio;m>=0;m--){
                        System.out.println(m);
                    }
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Valor inválido.");
                    System.out.println("");
                    break;
            }

        }while (escolha!=0);
            sc.close();
        }
    }

