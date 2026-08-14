public class Produto {
    public static void main(String[] args) {
        String nome_produto="Teclado";
        int quantidade=10;
        double preco_unit=100.50;

        System.out.printf("Produto: %s%nQuantidade: %d%nPreço unitário: R$%.2f%n ",nome_produto,quantidade,preco_unit);
    }
}