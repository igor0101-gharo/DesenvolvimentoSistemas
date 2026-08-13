import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Informe seu peso: ");
            double peso=sc.nextDouble();
            System.out.println("Informe sua altura: ");
            double altura=sc.nextDouble();
            
            double imc=peso/(altura*altura);
            
            System.out.println("Seu IMC: "+imc);
            sc.close();
    }
}
