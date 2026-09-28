import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 10000.00;
        try{
            System.out.println("Digite o valor que deseja sacar.");

            double valorSaque = sc.nextDouble();
            
            if (valorSaque <0){
                System.out.println("Erro: o valor do saque não pode ser negativo");
            }else if(valorSaque>saldo){
                System.out.println("Erro: saldo insuficiente");
            }else{
                saldo -=valorSaque;
                System.out.println("Saque realizado com sucesso");
                System.out.println("Novo saldo: R$ "+saldo);
            }
            
        }catch(InputMismatchException e){
            System.out.println("Erro critico: entrada inválida! por favor, use apenas números e virgula. ");
        }catch(Exception e){
            System.out.println("Ocorreu um erro inesperado: "+e.getMessage());
        }finally{
            System.out.println("Operação finalizada.");
        }
        sc.close();
    }
}
