import java.util.Scanner;

public class AtividadeCondicional07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite a cor do dvd: ");
        String cor = sc.next().toUpperCase();

        if (cor.equals("VERDE")){
            System.out.println("Preço: R$10,00 ");
        }else if(cor.equals("AZUL")){
            System.out.println("Preço: R$20,00");
        }else if(cor.equals("AMARELO")){
            System.out.println("Preço: R$30,00");
        }else if(cor.equals("VERMELHO")){
            System.out.println("Preço: R$40,00");
        }else{
            System.out.println("Valor inválido");
        }
        sc.close();
    }
}
