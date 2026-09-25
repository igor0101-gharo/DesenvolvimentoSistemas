public class Pedido {
    private int numero;
    private String nome;
    private double valor;
    public Pedido(int numero, String nome, double valor) {
        this.numero = numero;
        this.nome = nome;
        this.valor = valor;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostrarDados(){
        System.out.println("====DADOS DO PEDIDO====");
        System.out.println("Número: "+numero);
        System.out.println("Cliente: "+nome);
        System.out.printf("Valor do pedido: R$%.2f%n",valor);
    }
}
