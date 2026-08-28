import java.util.Scanner;

public class AtividadeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 98;

        String[] produtos = new String[5];
        int[] quantidade = new int[5];
        int tam = 5;
        int qtd = 0;


        while (escolha !=6) {
        System.out.println("\n\n===MENU===");    
        System.out.println("1-Cadastrar Produto");    
        System.out.println("2-Listar Produtos");    
        System.out.println("3-Pesquisar Produto");    
        System.out.println("4-Alterar Produto");    
        System.out.println("5-Remover Produto");    
        System.out.println("6- Sair");
        
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                if (qtd == tam){
                    System.out.println("Todos os espaços para produtos estão ocupados.");

                }else{
                    System.out.println("Digite o nome do produto que você quer cadastrar: ");
                    produtos[qtd] = sc.next();
                    System.out.println("Digite a quantidade do produto que você quer cadastrar: ");
                    quantidade[qtd] = sc.nextInt();
                    System.out.println("Produto cadastrado com sucesso.");
                    qtd++;

                }

            break;
        
            case 2:
                if (qtd == 0){
                    System.out.println("Não há produtos cadastrados.");
                }else{
                    System.out.println("======Lista de produtos=====");
                    for(int i=0;i<qtd;i++){
                        System.out.println((i+1)+" - "+produtos[i]+" | Quantidade: "+quantidade[i]);
                    }
                }
            
            break;
        
            case 3:
                System.out.println("Informe o nome: ");
                String busca=sc.next();

                int posbusca=-1;
                for (int i=0;i<qtd;i++){
                    if(produtos[i].equalsIgnoreCase(busca));
                    posbusca = i;
                    break;
                }
                if(posbusca == -1){
                    System.out.println("Produto não encontrado");

                }else{
                    System.out.println("Encontrado: "+produtos[posbusca]+ " - Estoque: " + quantidade[posbusca]);
                }
            
            break;
        
            case 4:
                System.out.println("informe o nome para alterar: ");
                String nomeAlterar = sc.next();

                int posAlt = -1;
                for(int i=0;i<qtd;i++){
                    if(produtos[i].equalsIgnoreCase(nomeAlterar)){
                        posAlt=i;
                        break;
                    }
                }
                if (posAlt==-1){
                    System.out.println("Produto não econtrado.");
                }else{
                    System.out.println("Novo nome: ");
                    produtos[posAlt] = sc.next();
                    System.out.println("Nova quantidade: ");
                    quantidade[posAlt] = sc.nextInt();

                    System.out.println("Produto alterado com sucesso.");

                }
            break;
        
            case 5:
                System.out.println("Informe o nome para remover: ");
                String nomeRemover = sc.next();

                int posremover= -1;
                for(int i=0;i<qtd;i++){
                    if (produtos[i].equalsIgnoreCase(nomeRemover)){
                        posremover = i;
                        break;
                    }
                }
                if (posremover == -1){
                    System.out.println("Produto não encontrado.");
                }else{
                    for (int i =posremover;i<qtd-1;i++){
                        produtos[i] = produtos[i+1];
                        quantidade[i] = quantidade[i+1];
                    }
                    produtos[qtd -1]=null;
                    quantidade[qtd- 1]=0;
                    qtd--;
                    System.out.println("Removido com sucesso!");
                }
            break;
        
            case 6:
                System.out.println("Encerrando.");
            
            break;
        
            default:
                break;

        

        }
    }
    sc.close();
}
}
