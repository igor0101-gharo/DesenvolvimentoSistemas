import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informar a nota do aluno: ");
        double nota=sc.nextDouble();
        
        System.out.println("informar a frequência do aluno(porcentagem): ");
        double frequencia=sc.nextDouble();


        if (nota >=7 && frequencia>=75){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();

    }
}
