import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Produto p1 = new Produto(null, 0, 0);


        System.out.println("Digite o nome do produto: ");
        p1.setNome(sc.next());
        
        System.out.println("Digite o preço do produto: ");
        p1.setpreco(sc.nextDouble());
        
        System.out.println("Digite a quantidade do produto: ");
        p1.setQuantidade(sc.nextInt());

        System.out.println("Produto: "+p1.getNome());
        System.out.format("Preço unitário: R$ %.2f\n",p1.getPreco());
        System.out.println("Quantidade:"+p1.getQuantidade());
        System.out.println("Preço total: R$"+(p1.getPreco()*p1.getQuantidade()));
        
        
        
        
        
        sc.close();
    }
}
