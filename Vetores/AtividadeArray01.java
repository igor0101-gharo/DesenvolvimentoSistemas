import java.util.Scanner;

public class AtividadeArray01 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int escolha = 98;

        String[] produtos = new String[5];
        int[] qtd = {-1,-1,-1,-1,-1};
        String nome_produto = "";
        int posremover = -1;


        while (escolha !=6) {
        System.out.println("===MENU===");    
        System.out.println("1-Cadastrar Produto");    
        System.out.println("2-Listar Produtos");    
        System.out.println("3-Pesquisar Produto");    
        System.out.println("4-Alterar Produto");    
        System.out.println("5-Remover Produto");    
        System.out.println("6- Sair");
        
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Quantos produtos deseja cadastrar?");
                int qtd_cadastro = sc.nextInt();

                if (qtd_cadastro > 0 && qtd_cadastro <=5){
                    for(int i = 0;i<qtd_cadastro;i++){
                        if (qtd[i] ==-1){
                            System.out.println("Digite o nome do produto: ");
                            produtos[i] = sc.next();
                            System.out.println("Digite a quantidade do produto: ");
                            qtd[i] = sc.nextInt();

                        }else{
                            System.out.println("Posição "+(i+1)+" da lista já está ocupada por "+ produtos[i]);
                        }
                    }
                }else{
                    System.out.println("Valor inválido.");
                }
                
                break;
            case 2:
                for(int i = 0; i<produtos.length;i++){
                    if (qtd[i] == -1){
                        System.out.println((i+1)+" - Sem dados");
                    }else{
                        System.out.println((i+1)+" - "+produtos[i]+" - quantidade: "+qtd[i]);
                    }
                }
                break;
            case 3:
                System.out.println("Digite o nome do produto: ");
                nome_produto = sc.next();
                for (int i=0;i<produtos.length;i++){
                    if(nome_produto.equals(produtos[i])){
                        System.out.println((i+1)+" - "+produtos[i]+" - quantidade: "+qtd[i]);
                    }
                }
                break;
            case 4:
                System.out.println("Digite o nome do produto: ");
                nome_produto = sc.next();
                for (int i=0;i<produtos.length;i++){
                    if(nome_produto.equals(produtos[i])){
                        System.out.println("Digite o novo nome:");
                        produtos[i] = sc.next();
                        System.out.println("Digite a nova quantidade:");
                        qtd[i] = sc.nextInt();
                    }
                }
                break;
            case 5:
                posremover = -1;
                System.out.println("Digite o nome do produto: ");
                nome_produto = sc.next();
                for (int i=0;i<produtos.length;i++){
                    if(nome_produto.equals(produtos[i])){
                        posremover = i;
                    }
                }
                if(posremover!=-1){
                    for(int i = posremover; i<produtos.length;i++){
                        produtos[i] = produtos[i+1];
                        qtd[i] = qtd[i+1];
                    }
                    produtos[produtos.length-1] = null;
                    qtd[qtd.length-1] = -1;
                    System.out.println("Item removido com sucesso.");
                }
                break;
            case 6:
                System.out.println("Encerrando.");
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }

    }
}
}
