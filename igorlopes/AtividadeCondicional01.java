import java.util.Scanner;

public class AtividadeCondicional01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");
        int numero=sc.nextInt();

        if(numero > 0 ){
            System.out.printf("O numero %d é positivo.", numero);
        }else if(numero == 0){
            System.out.printf("O numero %d é nulo.", numero);
        }else {
            System.out.printf("O numero %d é negativo.", numero);
        }
        sc.close();
    
    }
}
