import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Número da agência: ");
        int numeroAgencia = sc.nextInt();
        sc.nextLine();


        System.out.println("Nome agência: ");
        String nome =sc.next();

        Agencia agencia = new Agencia(nome, numeroAgencia);

        System.out.println("\n=====CADASTRO DA CONTA=====");

        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();


        System.out.println("Nome do Titular");
        String titular = sc.next();

        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        ContaCorrente conta = new ContaCorrente(numeroConta, titular, saldo, agencia);
        

        while(true){
            System.out.println("\n\n===============================");
            System.out.println("           BANCO MASTER");
            System.out.println("===============================");
            System.out.println("1-Mostrar dados da conta");
            System.out.println("2-Consulta saldo");
            System.out.println("3-Depositar");
            System.out.println("4-Pagar com Pix");
            System.out.println("5-Pagar com Cartão");
            System.out.println("6-Pagar com dinheiro");
            System.out.println("0-Sair");
            
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    conta.mostrarDados();
                    break;
            
                case 2:
                    conta.consultarSaldo();
                    break;
            
                case 3:
                    System.out.println("Informe o valor a depositar: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);

                    break;
            
                case 4:
                    System.out.println("Informe o valor do Pix: ");
                    double valorPix = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a chave: ");
                    String chavePix = sc.nextLine();

                    conta.pagar(valorPix, chavePix);
                    
                    break;
            
                case 5:
                    System.out.println("Informe o valor da compra:");
                    double valorCartao = sc.nextDouble();

                    System.out.println("Informe a quantidade de parcelas:");
                    int quantidadeParcelas = sc.nextInt();

                    conta.pagar(valorCartao, quantidadeParcelas);
                    break;
            
                case 6:
                    System.out.println("Informe o valor da compra:");
                    double valorDinheiro = sc.nextDouble();

                    conta.pagar(valorDinheiro);
                    break;
            
                case 0:
                    System.out.println("Saindo.......");

                    sc.close();
                    return ;
            
                default:
                    System.out.println("opção inválida");
                    break;
            }
        
        
        }
        
        
        
        
        
        
        
        
        
    }
}
