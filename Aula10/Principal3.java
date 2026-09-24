import java.util.ArrayList;
import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String codigo;
        double preco;
        int index;
        ArrayList<Produto>listaProdutos = new ArrayList<>();
        int op;
        int op2;
        boolean encontrado = false;

        do {
            System.out.println("\n\n=====CADASTRO DE PRODUTOS=====");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Mostrar produtos");
            System.out.println("3-Realizar venda");
            System.out.println("4-Realizar venda com desconto");
            System.out.println("0-Sair");


            while (!sc.hasNextInt()) {
                System.out.println("Valor inválido. Digite apenas números");
                sc.next();
            }

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("O produto é físico(1) ou digital(2)?");

                    while (!sc.hasNextInt()) {
                        System.out.println("Valor inválido. Digite 1 ou 2");
                        sc.next();
                    }

                    op2 = sc.nextInt();
                    sc.nextLine();

                    switch (op2) {
                        case 1:
                            System.out.println("Digite o nome do produto");
                            nome = sc.next();

                            System.out.println("Digite o código do produto");
                            codigo = sc.next();

                            System.out.println("Digite o preço do produto");
                            preco = sc.nextDouble();

                            listaProdutos.add(new ProdutoFisico(codigo, nome, preco));
                            
                            break;
                    
                        case 2:
                            System.out.println("Digite o nome do produto");
                            nome = sc.next();

                            System.out.println("Digite o código do produto");
                            codigo = sc.next();

                            System.out.println("Digite o preço do produto");
                            preco = sc.nextDouble();

                            listaProdutos.add(new ProdutoDigital(codigo, nome, preco));
                            
                            break;
                    
                        default:
                            System.out.println("Valor inválido");
                            break;
                    }

                    
                    break;
            
                case 2:
                    if (listaProdutos.isEmpty()){
                        System.out.println("Não há produtos cadastrados.");
                    }else{
                        for(int i=0;i<listaProdutos.size();i++){
                            listaProdutos.get(i).exibirInfo();
                            if(listaProdutos.get(i) instanceof ProdutoFisico){
                                System.out.println("Produto físico\n");
                            }else if (listaProdutos.get(i) instanceof ProdutoDigital){
                                System.out.println("Produto digital\n");
                            }
                        }
                    }
                    
                    break;
            
                case 3:
                    if (listaProdutos.isEmpty()){
                        System.out.println("Não há produtos cadastrados.");
                    }else{
                        System.out.println("Digite o nome do produto que quer vender:");
                        nome = sc.next();
                        encontrado = false;
                        index = -1;

                        for (int i=0;i<listaProdutos.size();i++){
                            if(listaProdutos.get(i).getNome().equalsIgnoreCase(nome)){
                                encontrado = true;
                                index = i;
                            }
                        }

                    }
                    
                    break;
            
                case 4:
                    
                    break;
            
                case 0:
                    
                    break;
            
                default:
                    break;
            }
            
        } while (op != 0);
        
        
        
        
        sc.close();
    }
}
