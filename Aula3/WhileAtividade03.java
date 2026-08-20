import java.util.Scanner;

public class WhileAtividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";

        while (!nome.equals("Anderson")) {
            System.out.println("Digite o nome do professor mais fofo do SENAI: ");
            nome = sc.next();
        }
        System.out.println("Parabéns!");
        sc.close();
    }
}
