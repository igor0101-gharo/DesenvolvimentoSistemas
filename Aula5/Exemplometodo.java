public class Exemplometodo {
    
    //sem parametro e sem retorno
    public static void mensagem() {
        System.out.println("Seja bem vindo");

    }
    //com parametro e sem retorno
    public static void mostrarnome(String nome) {
        System.out.println("Nome: "+nome);
        
    }

    //Sem parâmetro e com retorno
    public static int obterNumero() {
        return  10;
    }

    //com parâmetro e com retorno
    public static int somar(int n1, int n2) {
        return n1+n2;
        
    }

    public static void main(String[] args) {
        mensagem();
        mostrarnome("Carlos");
        int numero = obterNumero();
        System.out.println("Número: "+numero);
        int resultado = somar(10, 5);
        System.out.println("Soma: "+resultado );
    }
}
