import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int numero;
        String chavePix;
        int parcelas;
        int opcao2;
        String endereco;
        double taxaEntrega;

        
        while (true) {
            System.out.println("=====SISTEMA DE PEDIDOS=====");
            System.out.println("1-Realizar pedido Local");
            System.out.println("2-Realizar pedido delivery");
            System.out.println("0-Sair");

            int opcao =sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente:");
                    nome = sc.nextLine();
                    System.out.println("Digite o número do pedido:");
                    numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o valor do pedido:");
                    valor = sc.nextDouble();
                    sc.nextLine();

                    Pedidolocal plocal = new Pedidolocal(numero, nome, valor);
                    
                    
                    System.out.println("Escolha a forma de pagamento: ");
                    System.out.println("1-Dinheiro. ");
                    System.out.println("2-pix. ");
                    System.out.println("3-Cartão. ");

                    opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1:
                            plocal.pagar(valor);
                            System.out.println("========================");
                            plocal.mostrarDados();
                            
                            
                            break;
                            
                            case 2:
                            System.out.println("Digite a Chave Pix:");
                            chavePix = sc.next();
                                
                            plocal.pagar(valor, chavePix);
                            System.out.println("========================");
                            plocal.mostrarDados();
                            break;
                    
                        case 3:
                            System.out.println("Digite a quantidade de parcelas:");
                            parcelas = sc.nextInt();
                            plocal.pagar(valor, parcelas);
                            System.out.println("========================");
                            plocal.mostrarDados();
                            break;
                    
                        default:
                            break;
                    }

                    
                    break;
            
                case 2:
                    System.out.println("Digite o nome do cliente:");
                    nome = sc.nextLine();
                    System.out.println("Digite o número do pedido:");
                    numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o valor do pedido:");
                    valor = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite o endereço:");
                    endereco = sc.nextLine();
                    System.out.println("Digite a taxa de entrega:");
                    taxaEntrega = sc.nextDouble();
                    sc.nextLine();

                    PedidoDelivery pdDelivery = new PedidoDelivery(numero, nome, valor, endereco, taxaEntrega);
                    
                    
                    System.out.println("Escolha a forma de pagamento: ");
                    System.out.println("1-Dinheiro. ");
                    System.out.println("2-pix. ");
                    System.out.println("3-Cartão. ");

                    opcao2 = sc.nextInt();

                    switch (opcao2) {
                        case 1:
                            pdDelivery.pagar(valor);
                            System.out.println("========================");
                            pdDelivery.mostrarDados();
                            
                            
                            break;
                            
                            case 2:
                            System.out.println("Digite a Chave Pix:");
                            chavePix = sc.next();
                                
                            pdDelivery.pagar(valor, chavePix);
                            System.out.println("========================");
                            pdDelivery.mostrarDados();
                            break;
                    
                        case 3:
                            System.out.println("Digite a quantidade de parcelas:");
                            parcelas = sc.nextInt();
                            pdDelivery.pagar(valor, parcelas);
                            System.out.println("========================");
                            pdDelivery.mostrarDados();
                            break;
                    
                        default:
                            break;
                    }

                    
                    break;
            
                case 0:
                    System.out.println("Saindo.....");
                    sc.close();
                    return ;
            
                default:
                    break;
            }
        }
        
        
        

    }
}
