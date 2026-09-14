import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();


        numeros.add(45);
        numeros.add(50);
        numeros.add(55);

        for (int numero : numeros){
            System.out.println(numero);
        }

        numeros.set(1, 69);

        System.out.println("\nLista pós alteração.");

        for (int numero : numeros){
            System.out.println(numero);
        }
        
        numeros.remove(0);

        System.out.println("\nLista pós remoção");

        for (int numero : numeros){
            System.out.println(numero);
        }

        System.out.println("\n Digite o número que deseja remover: ");
        int numeroremove = sc.nextInt();

        numeros.remove(Integer.valueOf(numeroremove));

        for (int numero : numeros){
            System.out.println(numero);
        }



        sc.close();

    }
}
