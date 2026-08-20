import java.util.Scanner;

public class WhileAtividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        while (numero>=0) {
            System.out.println("Digite numeros positivos. numero negativo encerra o programa.");
            numero = sc.nextDouble();
        }
        System.out.println("Fim");
        sc.close();
    }
}
