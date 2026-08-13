import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Informe Nome: ");
        String nome=sc.nextLine();


        System.out.println("Informe n1: ");
        double p1=sc.nextDouble();

        System.out.println("Informe n2: ");
        double p2=sc.nextDouble();

        double media=(p1+p2)/2;

        System.out.println("Olá "+nome+" sua média é: "+media);


        sc.close();
    }
}
