import java.util.Scanner;

public class AtividadeDWhile01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "";

        do{
            System.out.println("Digite a senha: ");
            senha = sc.next();

        }while(!senha.equals("2024"));
        System.err.println("Acesso Permitido.");
        sc.close();
    }
}
