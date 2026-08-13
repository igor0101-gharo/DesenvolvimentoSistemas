import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);

            System.out.println("Informe a quantidade de força aplicada: ");
            double força=sc.nextDouble();
            System.out.println("Informe a distância percorrida: ");
            double distancia=sc.nextDouble();
            
            double Trabalho=força*distancia;
            
            System.out.println("Trabalho: " +Trabalho);
            sc.close();

    }
}
