import java.util.Scanner;

public class AtividadeArray02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 98;
        String[] quartos = new String[5];
        int[] camas = new int[5];
        String[] hospedes = new String[5];
        int tam = 5;
        int qtd = 0;



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
                    System.out.println("Digite o número do quarto: ");
                    String reserva_quarto = sc.next();
                    for (int i=0;i<5;i++){
                        
                    }
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            
                default:
                    break;
            }
        }
        
        
        
        
        
        
        
        sc.close();

    }
}
