import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome=sc.nextLine();
        System.out.println("Digite sua primeira nota: ");
        double nota1=sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2=sc.nextDouble();

        double media = (nota1+nota2)/2;

        System.out.printf("Aluno: %s%nNota 1: %.2f%nNota 2: %.2f%nMédia: %.2f%n",nome,nota1,nota2,media);
        sc.close();
    }
}
