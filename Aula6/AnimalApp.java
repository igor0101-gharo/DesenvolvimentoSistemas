import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String nome;
        int idade;
        String raca;
        String cor;
        Cachorro cachorro1 = null;
        Gato gato1 = null;

        int op;

        do {
            System.out.println("\n=====CLÍNICA VETERINÁRIA=====");
            System.out.println("1-Cadastrar Cachorro");
            System.out.println("2-Cadastrar Gato");
            System.out.println("3-Mostrar dados do Cachorro");
            System.out.println("4-Mostrar dados do Gato");
            System.out.println("5-Fazer Cachorro emitir som");
            System.out.println("6-Fazer Gato emitir som");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida. Digite números.");
                sc.next();
            }

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome: ");
                    nome = sc.next();

                    System.out.println("Digite a idade: ");
                    idade = sc.nextInt();

                    System.out.println("Digite a raça: ");
                    raca = sc.next();

                    cachorro1 = new Cachorro(nome, idade, raca);

                    System.out.println("Cachorro cadastrado com sucesso.");
                    
                    break;
            
                case 2:
                     System.out.println("Digite o nome: ");
                    nome = sc.next();

                    System.out.println("Digite a idade: ");
                    idade = sc.nextInt();

                    System.out.println("Digite a cor: ");
                    cor = sc.next();

                    gato1 = new Gato(nome, idade, cor);

                    System.out.println("Gato cadastrado com sucesso.");
                    
                    break;
            
                case 3:
                    if(cachorro1!=null){
                        cachorro1.exibirInfo();
                    }else{
                        System.out.println("Cachorro ainda não cadastrado.");
                    }
                    
                    break;
            
                case 4:
                    if(gato1!=null){
                        gato1.exibirInfo();
                    }else{
                        System.out.println("Gato ainda não Cadastrado");
                    }
                    
                    break;
            
                case 5:
                    if(cachorro1!=null){
                        cachorro1.emitirSom();
                    }else{
                        System.out.println("Cachorro ainda não cadastrado.");
                    }
                    
                    
                    break;
            
                case 6:
                    if(gato1!=null){
                        gato1.emitirSom();
                    }else{
                        System.out.println("Gato ainda não Cadastrado");
                    }
                    
                    
                    break;
            
                case 0:
                    System.out.println("Encerrando...");
                    
                    break;
            
                default:
                    System.out.println("Opção inválida.");
                    break;
            }





        } while (op!=0);

        
        
        
        
        
        
        
        
        sc.close();
    }
}
