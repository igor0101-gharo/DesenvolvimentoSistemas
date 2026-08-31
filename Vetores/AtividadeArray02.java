import java.util.Scanner;

public class AtividadeArray02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 98;
        String[] quartos = new String[5];
        int[] camas = {0,0,0,0,0};
        String[] reservashospede = new String[25];
        int[] reservasquarto = new int[25];
        for (int i = 0;i<reservasquarto.length;i++){
            reservasquarto[i] = -1;
        }
        int tam = 5;
        int qtd = 0;
        int qtd_reservas= 0;



        while (escolha !=6) {
            System.out.println("====SunStay:MENU====");
            System.out.println("1-Registrar Número dos Quartos.");
            System.out.println("2-Registrar Quantidade de Camas");
            System.out.println("3-Reservar Quarto");
            System.out.println("4-Consultar Reservas por Quarto");
            System.out.println("5-Consultar Reservas por hóspede");
            System.out.println("6-Encerrar o sistema");

            escolha =sc.nextInt();

            switch (escolha) {
                case 1:
                    for(int i = 0;i<quartos.length;i++){
                        System.out.println("Digite o número do "+(i+1)+"º quarto:");
                        quartos[i] = sc.next(); 

                    }
                    System.out.println("Cadastro feito com sucesso.");
                    qtd = 5;
                    break;
                case 2:
                    if(qtd != 5){
                        System.out.println("Os números dos quartos ainda não foram cadastrados. utilize a opção 1.");
                    }else{
                        for (int i =0;i<5;i++){
                            System.out.println("Digite o número de camas disponíveis no quarto "+quartos[i]);
                            camas[i] = sc.nextInt();
                            if (camas[i] > 5){
                                System.out.println("só podem haver até 5 camas por quarto.");
                                camas[i] = 5;
                            }
                        }
                        System.out.println("Cadastro feito com sucesso.");
                    }
                    break;
                case 3:
                    if (qtd_reservas == 25){
                        System.out.println("Número limite de reservas atingindo");
                    }else{

                        System.out.println("Digite o número do quarto: ");
                        String reserva_quarto = sc.next();
                        int posreserva = -1;
                        for (int i=0;i<5;i++){
                            if (reserva_quarto.equalsIgnoreCase(quartos[i])){
                                posreserva = i;
                            }
                        }
                            if (posreserva == -1){
                                System.out.println("Este quarto não existe.");
                            }else{
                                if (camas[posreserva] == 0){
                                    System.out.println("Não há camas disponíveis.");
                                }else{
                                    System.out.println("Digite o nome do hospede: ");
                                    reservashospede[qtd_reservas] = sc.next();
                                    reservasquarto[qtd_reservas] = posreserva;
                                    camas[posreserva] = camas[posreserva] - 1;
                                    qtd_reservas += 1;
                                    System.out.println("Reversa realizada com sucesso.");
    
    
    
                                }   
    
                            }
                            
                    }
                    
                    break;
                case 4:
                    System.out.println("Informe o número do quarto: ");
                    String escolhaquarto = sc.next();
                    int quartopos = -1;
                    int qtdRquarto = 0;
                    for (int i= 0;i<quartos.length;i++){
                        if (escolhaquarto.equalsIgnoreCase(quartos[i])){
                            quartopos = i;
                            for (int j = 0;j<reservasquarto.length;j++){
                                if(quartopos == reservasquarto[j]){
                                    qtdRquarto += 1;
                                }
                            }
                        }
                    }

                    if (quartopos == -1){
                        System.out.println("O quarto não existe:");
                    }else if (qtdRquarto == 0){
                        System.out.println("Não há reservas para este quarto.");
                    }else{
                        System.out.println("===RESERVAS PARA ESTE QUARTO===");
                        for (int i = 0;i<reservasquarto.length;i++){
                            if (quartopos == reservasquarto[i]){
                                System.out.println("QUARTO "+quartos[quartopos]+ "| hospede: "+reservashospede[i]);

                            }
                        }

                    }


                    
                    break;
                case 5:
                    System.out.println("Informe o nome do hospede: ");
                    String escolhahospede = sc.next();
                    System.out.println("===RESERVAS FEITAS POR ESSE HOSPEDE===");
                    for (int i =0;i<reservashospede.length;i++){
                        if (escolhahospede.equalsIgnoreCase(reservashospede[i])){
                            System.out.println("QUARTO "+quartos[reservasquarto[i]]+" Reservado");
                        }
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
