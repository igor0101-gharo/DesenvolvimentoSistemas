import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in); 

        System.out.println("Informe o primeiro número: ");
        double n1=sc.nextDouble();
        System.out.println("Informe o Segundo número: ");
        double n2=sc.nextDouble();
        System.out.println("Informe o Terceiro número: ");
        double n3=sc.nextDouble();

        double media=(n1+n2+n3)/3;
        System.out.println("A média é: "+media);
        sc.close();
    }
}
