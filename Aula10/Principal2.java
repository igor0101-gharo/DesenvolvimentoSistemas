import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //listas
        ArrayList<Carro>listacarros = new ArrayList<>();
        ArrayList<Moto>listamotos = new ArrayList<>();
        ArrayList<Veiculo>listaAlugados = new ArrayList<>();
        ArrayList<Integer>diasAluguel = new ArrayList<>();

        //variaveis para adquirir os atributos
        String placa;
        String modelo;
        String ano;
        int dias;
        double valorDiaria;
        double desconto;


        //variaveis de navegação
        int op;
        int op2;
        boolean encontrado = false;
        boolean encontradoCarro = false;
        boolean encontradoMoto = false;
        int index;


        //menu

        do {
            System.out.println("\n\n=====SISTEMA DE CADASTRO DE VEÍCULOS=====");
            System.out.println("1-Cadastrar um carro");
            System.out.println("2-Cadastrar uma moto");
            System.out.println("3-Mostrar carros cadastrados");
            System.out.println("4-Mostrar motos cadastradas");
            System.out.println("5-Alugar um veículo");
            System.out.println("6-Ver veículos Alugados");
            System.out.println("7-Calcular aluguel");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida");
                sc.next();
            }

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite a placa do Carro:");
                    placa = sc.next();
                    
                    encontrado = false;
                    for (int i=0;i<listacarros.size();i++){
                        if (listacarros.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontrado = true;
                        }
                    }

                    for (int i=0;i<listamotos.size();i++){
                        if (listamotos.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontrado = true;
                        }
                    }

                    if(encontrado){
                        System.out.println("Já há um veículo cadastrado com essa placa. Interropendo cadastro.");
                    }else{
                        System.out.println("Digite o modelo do Carro:");
                        modelo = sc.next();
    
                        System.out.println("Digite o ano de fabricação:");
                        ano = sc.next();
    
                        System.out.println("Digite o valor da diária");
                        valorDiaria = sc.nextDouble();
                        
                        listacarros.add(new Carro(placa, modelo, ano, valorDiaria));
                        System.out.println("Carro cadastrado com sucesso.");
                    }
                    
                    
                    
                    
                    break;
                    
                    case 2:
                        
                    System.out.println("Digite a placa da Moto:");
                    placa = sc.next();
                        
                    encontrado = false;
                    for (int i=0;i<listacarros.size();i++){
                        if (listacarros.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontrado = true;
                        }
                    }
    
                    for (int i=0;i<listamotos.size();i++){
                        if (listamotos.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontrado = true;
                        }
                    }

                    if(encontrado){
                        System.out.println("Já há um veiculo cadastrado com essa placa. Interropendo cadastro.");
                    }else{
                        System.out.println("Digite o modelo da Moto:");
                        modelo = sc.next();
    
                        System.out.println("Digite o ano de fabricação:");
                        ano = sc.next();
    
                        System.out.println("Digite o valor da diária");
                        valorDiaria = sc.nextDouble();
                        
                        listamotos.add(new Moto(placa, modelo, ano, valorDiaria));
                        System.out.println("Moto cadastrada com sucesso.");
                    }
                    break;
            
                case 3:
                    if(listacarros.isEmpty()){
                        System.out.println("Não há carros cadastrados.");
                    }else{
                        System.out.println("====LISTA DE CARROS CADASTRADOS====");
                        for(int i=0;i<listacarros.size();i++){
                            System.out.println("=====================\n");
                            listacarros.get(i).exibirInfo();
                            System.out.println("=====================\n");
                        }
                    }
                    
                    break;
            
                case 4:
                    if(listamotos.isEmpty()){
                        System.out.println("Não há motos cadastrados.");
                    }else{
                        System.out.println("====LISTA DE MOTOS CADASTRADAS====");
                        for(int i=0;i<listamotos.size();i++){
                            System.out.println("=====================");
                            listamotos.get(i).exibirInfo();
                            System.out.println("=====================");
                        }
                    }
                    
                    
                    break;
            
                case 5:
                    System.out.println("Digite a placa do veiculo que você deseja alugar");
                    placa = sc.next();
                    encontradoCarro = false;
                    encontradoMoto = false;
                    index = -1;
                    for (int i=0;i<listacarros.size();i++){
                        if (listacarros.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontradoCarro = true;
                            index = i;
                        }
                    }
    
                    for (int i=0;i<listamotos.size();i++){
                        if (listamotos.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontradoMoto = true;
                            index = i;
                        }
                    }
                    
                    if(index == -1){
                        System.out.println("Não há veículo cadastrado com essa placa");
                    }else if(encontradoCarro){
                        System.out.println("Digite a quantidade de dias do aluguel.");
                        dias = sc.nextInt();

                        modelo = listacarros.get(index).getModelo();
                        ano = listacarros.get(index).getAno();
                        valorDiaria = listacarros.get(index).getValorDiaria();

                        listaAlugados.add(new Carro(placa, modelo, ano, valorDiaria));
                        diasAluguel.add(dias);

                        System.out.println("Carro alugado com sucesso.");


                    }else if(encontradoMoto){
                        System.out.println("Digite a quantidade de dias do aluguel.");
                        dias = sc.nextInt();

                        modelo = listamotos.get(index).getModelo();
                        ano = listamotos.get(index).getAno();
                        valorDiaria = listamotos.get(index).getValorDiaria();

                        listaAlugados.add(new Moto(placa, modelo, ano, valorDiaria));
                        diasAluguel.add(dias);

                        System.out.println("Moto alugada com sucesso.");

                    }

                    break;
            
                case 6:
                    if (listaAlugados.isEmpty()){
                        System.out.println("Nenhum veículo alugado.");
                    }else{

                        System.out.println("=====LISTA DE VEICULOS ALUGADOS=====");
                        for(int i =0;i<listaAlugados.size();i++){
                            System.out.println("=================\n");
                            listaAlugados.get(i).exibirInfo();
                            System.out.println("=================\n");
                        }
                        
                    }
                    break;
            
                case 7:
                    System.out.println("Digite a placa do veiculo alugado");
                    placa = sc.next();
                    encontrado = false;
                    index = -1;

                    for (int i = 0;i<listaAlugados.size();i++){
                        if(listaAlugados.get(i).getPlaca().equalsIgnoreCase(placa)){
                            encontrado = true;
                            index = i;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Veículo não encontrado.");
                    }else{
                        System.out.println("Deseja oferecer um desconto?\n1-Sim\n2-Não");
                        while (!sc.hasNextInt()) {
                            System.out.println("Opção inválida, digite um número.");
                            sc.next();
                        }

                        op2 = sc.nextInt();
                        sc.nextLine();
                        
                        switch (op2) {
                            case 1:
                                System.out.println("Digite o valor do desconto: ");
                                desconto = sc.nextDouble();

                                listaAlugados.get(index).calcularAluguel(listaAlugados.get(index).getValorDiaria(),diasAluguel.get(index), desconto);
                                break;
                        
                            case 2:
                                listaAlugados.get(index).calcularAluguel(listaAlugados.get(index).getValorDiaria(),diasAluguel.get(index));
                                
                                break;
                        
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }
                    }
                    
                    break;
            

                case 0:
                    System.out.println("Encerrando...");
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
        } while (op!=0);
        
        
        
        
        
        
        
        
        
        
        sc.close();
    }
}
