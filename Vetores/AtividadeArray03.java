import java.util.Scanner;

public class AtividadeArray03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] lista_numeros = new double[5];
        int escolha = 98;
        int qtd = 0;
        int tam = 5;

        while (escolha != 0) {
            System.out.println("\n\n\n====MENU====");
            System.out.println("1-Inserir número.");
            System.out.println("2-listar números.");
            System.out.println("3-Remover número.");
            System.out.println("0- Sair.");

            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    if (qtd == tam){
                        System.out.println("Não há mais espaço disponíviel na lista.");
                    }else{
                        System.out.println("Digite o número:");
                        lista_numeros[qtd] = sc.nextDouble();
                        qtd+=1;
                    }
                    
                    break;
                case 2:
                    if (qtd==0){
                        System.out.println("Não há números cadastrados.");
                    }else{
                        for (int i = 0; i<qtd;i++){
                            System.out.println("Indice: "+i+" | Número: "+lista_numeros[i]);
                        }
                    }
                    
                    break;
                case 3:
                    if (qtd == 0){
                        System.out.println("Erro. Array vazio.");
                    }else{
                        System.out.println("Digite o indice do número que quer apagar.");
                        int posapagar = sc.nextInt();
                        if (posapagar>=0 && posapagar<lista_numeros.length){
                            for (int j = posapagar; j<lista_numeros.length-1;j++){
                                lista_numeros[j] = lista_numeros[j+1];
                            }
                            lista_numeros[lista_numeros.length-1] = 0;
                            qtd--;
                        }else{
                            System.out.println("Posição inválida.");
                        }
                    }
                    
                    break;
                case 0:
                    System.out.println("encerrando.");
                    break;
            
                default:
                    break;
            }
        }

        
        
        
        
        
        
        
        sc.close();
    }
}
