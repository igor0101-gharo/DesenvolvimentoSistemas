import java.util.Scanner;

public class MontadoraApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;


        do {
            System.out.println("\n====MENU====");
            System.out.println("1-Cadastrar Moto");
            System.out.println("2-Cadastrar Carro");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção:");
            
            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite 0 , 1 ou 2");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:{
                    System.out.println("Informe a marca: ");
                    String marca = sc.next();

                    System.out.println("informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.println("informe as cilindradas: ");
                    double cilindradas = sc.nextDouble();

                    Moto mt = new Moto(marca, ano, cilindradas);
                        mt.setMarca(marca);
                        mt.setAno(ano);
                        mt.setCilindradas(cilindradas);

                    System.out.println("===DADOS CADASTRADOS: MOTO===");
                    mt.exibirDados();
                    
                }
                    
                    
                    break;
                
                case 2:{
                    System.out.println("Informe a marca: ");
                    String marca = sc.next();

                    System.out.println("informe o ano: ");
                    int ano = sc.nextInt();

                    System.out.println("informe a Quantidade de portas: ");
                    int quantidadeportas = sc.nextInt();

                    Carro c = new Carro(marca, ano, quantidadeportas);
                        c.setMarca(marca);
                        c.setAno(ano);
                        c.setQuantidadeportas(quantidadeportas);

                    System.out.println("===DADOS CADASTRADOS: CARRO===");
                    c.exibirDados();
                    

                }
                    
                    break;
                
                case 0:
                    System.out.println("Encerrando");
                    break;
            
                default:
                    System.out.println("Opção inválida. Digite 1, 2 ou 0.\n");
                    break;
            }
        } while (op!=0);
        
        
        
        
        
        
        
        sc.close();
    }
}
