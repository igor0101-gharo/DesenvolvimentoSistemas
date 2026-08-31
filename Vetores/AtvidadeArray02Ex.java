import java.util.Scanner;

public class AtvidadeArray02Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxquartos = 5;
        int maxReservas = 25;

        int[] numeroQuartos = new int [maxquartos];
        int[] camasDisponiveis = new int[maxquartos];

        String[] hospedes = new String[maxReservas];
        int[] quartoReserva = new int[maxReservas];

        int quantidadeQuartos;
        int totalReservas = 0;

        boolean quartosCadastrados = false;
        boolean camasCadastradas = false;

        int opcao;

        System.out.println("Informe a quantidade de quartos disponiveis (máximo 5):");
        quantidadeQuartos = sc.nextInt();

        while (quantidadeQuartos<1 || quantidadeQuartos>5) {
            System.out.println("Quantidade inválida. Digie um valor entre 1 e 5");
            quantidadeQuartos = sc.nextInt();
        }

        do{
            System.out.println("\n\n===MENU===");
            System.out.println("1-Registrar Números dos quartos.");
            System.out.println("2-Registrar Quantidade de camas");
            System.out.println("3-Reservar quartos.");
            System.out.println("4-Consultar reservas por quarto");
            System.out.println("5-Consultar reservas por hóspede");
            System.out.println("6-Mostrar relatório geral");
            System.out.println("7-Encerrar");
            System.out.println("Escolha opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n---Cadastro dos Quartos");
                    for (int i=0;i<quantidadeQuartos;i++){
                        System.out.println("Informe o número do quarto: "+(i+1)+" :");
                        numeroQuartos[i] = sc.nextInt();

                    }

                    quartosCadastrados = true;
                    System.out.println("Quartos cadastrados com sucesso!");
                    
                    break;
                case 2:
                    if (!quartosCadastrados){
                        System.out.println("Cadastre primeiro o número dos quartos!");
                    }else{
                        System.out.println("\n---Cadastro de camas por quarto---");
                        for(int i =0;i<quantidadeQuartos;i++){
                            System.out.println("Informe a quantidade de camas do quarto "+numeroQuartos[i]+":");
                            camasDisponiveis[i] =sc.nextInt();
                        }
                        camasCadastradas = true;
                        System.out.println("Quantidade de camas cadastradas com sucesso.");
                    }
                    break;
                case 3:
                    if(!quartosCadastrados){
                        System.out.println("Cadastre primeiro os quartos!");
                    }else if (!camasCadastradas){
                        System.out.println("Cadastre as camas disponiveis primeiro!");
                    }else if (totalReservas>= maxReservas){
                        System.out.println("Limite máximo de reservas atingidos");
                    }else{
                        int numquarto;
                        int posicaoquarto = -1;

                        System.out.println("Informe o número do quarto para reserva:");
                        numquarto = sc.nextInt();
                        sc.nextLine();

                        for(int i=0;i<quantidadeQuartos;i++){
                            if(numquarto == numeroQuartos[i]){
                                posicaoquarto = i;
                                break;
                            }
                        }
                        if (posicaoquarto == -1){
                            System.out.println("Este quarto não existe.");
                        }else if(camasDisponiveis[posicaoquarto]<=0){
                            System.out.println("Não há camas disponíveis neste quarto.");
                        }else{
                            System.out.println("Informe o nome do hóspede");
                            hospedes[totalReservas] = sc.next();
                            quartoReserva[totalReservas] = numquarto;

                            camasDisponiveis[posicaoquarto]--;
                            totalReservas++;

                            System.out.println("Reservada realizada com sucesso.");
                        }
                    }
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
            
                default:
                    break;
            }




        }while(opcao !=7);
        
        
        
        
        
        
        
        sc.close();
    }
}
