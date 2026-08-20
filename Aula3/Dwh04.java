import java.util.Scanner;

public class Dwh04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String senha = "";
        do{
            System.out.println("Digite a Senha:");
            senha = sc.next();
        }while(!senha.equals("coxinha123"));
        System.out.println("Acesso permitido!");

        sc.close();
    }
}
