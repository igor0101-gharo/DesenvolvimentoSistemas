import java.util.Scanner;

public class AtividadeFor05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        int numero=sc.nextInt();
        System.out.println("===TBAUADA DE "+numero+"===");
        for(int i = 1;i<=10;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        
        sc.close();
    }
}
