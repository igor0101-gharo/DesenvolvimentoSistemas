import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        
        Carro c = new Carro(null, null, 0);
        
        System.out.println("informe a marca: ");
        c.setMarca(sc.next());
        System.out.println("informe o modelo: ");
        c.setModelo(sc.next());
        System.out.println("informe o ano de fabricação: ");
        c.setAnofabricacao(sc.nextInt());

        System.out.println("Carro da marca "+c.getMarca()+", modelo "+c.getModelo()+", fabricado no ano "+c.getAnofabricacao());

        
        
        sc.close();
    }
}
