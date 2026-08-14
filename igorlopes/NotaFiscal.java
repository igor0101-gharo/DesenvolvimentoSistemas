import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome=sc.nextLine();
        
        System.out.println("Digite o nome do produto: ");
        String nome_produto=sc.nextLine();
        
        System.out.println("Digite a quantidade: ");
        int quantidade=sc.nextInt();
        
        System.out.println("Digite o valor unitário: ");
        double valor_unit=sc.nextDouble();

        double valor_total= valor_unit*quantidade;

        System.out.printf("---------- NOTA FISCAL ----------%nCliente: %s%nProduto: %s%nQuantidade: %d%nValor Unitário: R$%.2f%nTotal: R$%.2f%n---------------------------------",
            nome,nome_produto,quantidade,valor_unit,valor_total
        );
        sc.close();
    }
}
