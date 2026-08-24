import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        for(int i=1;i<=3;i++){
            System.out.println("Informe o nome "+i);
            String nome=sc.nextLine();
            System.out.println("O nome informado foi "+nome);
        }
        
        sc.close();
    }
}
