import java.util.Scanner;

public class AtividadeCondicional02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero=sc.nextInt();

        if (numero%2 == 0){
            System.out.printf("O numero %d é par.",numero);
        }else{
            System.out.printf("O numero %d é ímpar.",numero);
        }
        sc.close();
    }
}
