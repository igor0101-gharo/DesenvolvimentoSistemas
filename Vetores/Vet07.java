import java.util.Scanner;

public class Vet07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        
        //cadastrar
        System.out.println("===Cadastro Nomes===");
        for(int i=0;i<nomes.length;i++){
            System.out.println("Digite o Nome: ");
            nomes[i] = sc.next();
        }
        //listar

        System.out.println("\nLista atual:");
        listar(nomes);
        
        //Alterar
        System.out.println("\nDigite posição para alterar: ");
        int posalterar =sc.nextInt();
        sc.nextLine();
        
        if(posalterar>=0 && posalterar<nomes.length){
            System.out.println("Digite o novo nome: ");
            nomes[posalterar] = sc.next();
        }else{
            System.out.println("Posição inválida.");
        }
        
        //listar

        System.out.println("\nLista atualizada:");
        listar(nomes);

        //Remover
        System.out.println("\nDigite a posição para remover: ");
        int posremover = sc.nextInt();

        if (posremover >=0 && posremover<nomes.length){
            for(int i =posremover;i<nomes.length;i++){
                nomes[i]=nomes[i+1];
            }
            nomes[nomes.length-1]=null;
        }else{
            System.out.println("Posição inválida.");

        }
        System.out.println("\nLista após remoção");
        listar(nomes);
        sc.close();
    }

    public static void listar(String[] array) {
        for(int i=0;i<array.length;i++){
            System.out.println(i+" - "+array[i]);
        }
    }
}
