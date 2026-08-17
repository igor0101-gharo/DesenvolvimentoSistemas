import java.util.Scanner;

public class AtividadeCondicional03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade=sc.nextInt();

        if(idade <= 12 && idade >=0){
            System.out.println("Criança.");
        }else if(idade <18){
            System.out.println("Adolescente.");
        }else if(idade <60){
            System.out.println("Adulto.");
        }else if(idade >=60){
            System.out.println("Idoso.");
        }else{
            System.out.println("valor inválido");
        }
        sc.close();
    }
}
