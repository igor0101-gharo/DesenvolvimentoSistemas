import java.util.Scanner;

public class AtividadeCondicional06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("informe o primeiro número: ");
        double numero1=sc.nextDouble();
        
        System.out.println("informe o segundo número: ");
        double numero2=sc.nextDouble();
        
        System.out.println("Informe o operador da operação que deseja fazer(+ , - , * ou /)");
        String operador= sc.next();

        if (operador.equals("+")){
            double resultado = numero1 + numero2;
            System.out.printf("Resultado da adição: %.2f", resultado);
        }else if(operador.equals("-")){
            double resultado = numero1 - numero2;
            System.out.printf("Resultado da subtração: %.2f", resultado);
        }else if(operador.equals("*")){
            double resultado = numero1 * numero2;
            System.out.printf("Resultado da multiplicação: %.2f", resultado);
        }else if(operador.equals("/")){
            double resultado = numero1 / numero2;
            System.out.printf("Resultado da divisão: %.2f", resultado);
        }else{
            System.out.printf("Operador inválido");
        }
        sc.close();

    }
}
