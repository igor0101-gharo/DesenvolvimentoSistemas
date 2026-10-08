import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Carro> listaCarros = new ArrayList<>();
        int numero;
        boolean executando = true;
        String lista;


        while (executando) {
            String opcao = JOptionPane.showInputDialog(null,
                "Escolha uma opção:\n"+
            "1-Cadastrar Carro\n"+
            "2-Listar Carros\n"+
            "3-Detalhar Carro\n"+
            "4-Alterar Carro\n"+
            "5-Remover Carro\n"+
            "6-Gravar Informações em Arquivo\n"+
            "7-sair","Menu Principal",
        JOptionPane.QUESTION_MESSAGE );

        
        if(opcao==null){
            JOptionPane.showMessageDialog(null, "Operação Cancelada");
            break;
        }


        switch (opcao) {
            case "1":
                String marca = JOptionPane.showInputDialog(
                    null,
                    "Digite a marca do carro.",
                    "Cadastro: marca.",
                    JOptionPane.QUESTION_MESSAGE

                );
                if (marca == null || marca.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                    break;
                }
                String modelo = JOptionPane.showInputDialog(
                    null,
                    "Digite o modelo do carro.",
                    "Cadastro: modelo.",
                    JOptionPane.QUESTION_MESSAGE

                );
                if (modelo == null || modelo.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                    break;
                }
                String ano = JOptionPane.showInputDialog(
                    null,
                    "Digite o ano do carro.",
                    "Cadastro: ano.",
                    JOptionPane.QUESTION_MESSAGE

                );
                if (ano == null || ano.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                    break;
                }
                

                Carro carro = new Carro(marca, modelo, ano);
                listaCarros.add(carro);
                break;
        
            case "2":
                if(listaCarros.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
                }else{
                    lista = "Carros cadastrados:\n\n";
                    for(int i=0;i<listaCarros.size();i++){
                        lista += (i+1)+" - "+listaCarros.get(i).exibirDados();
                    }

                    JOptionPane.showMessageDialog(null, lista,"Lista de Carros",JOptionPane.INFORMATION_MESSAGE);
                }
                
                break;
        
            case "3":
                if (listaCarros.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
                }else{
                    String input = JOptionPane.showInputDialog(null,"Digite o número do carro.","Escoher Carro",JOptionPane.QUESTION_MESSAGE);
                    
                    try{
                        numero = Integer.parseInt(input);
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro.");
                        break;
                    }

                    if(numero>0 && numero<=listaCarros.size()){
                        JOptionPane.showMessageDialog(null, "Carro encontrado:\n"+listaCarros.get(numero-1).exibirDados());
                    }else{
                        JOptionPane.showMessageDialog(null, "Não há carro com este número.");

                    }
                    
                }
                
                
                break;
                
                case "4":
                    if (listaCarros.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
                    }else{
                        String input = JOptionPane.showInputDialog(null,"Digite o número do carro.","Escoher Carro",JOptionPane.QUESTION_MESSAGE);
                        
                        try{
                            numero = Integer.parseInt(input);
                        }catch (NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro.");
                            break;
                        }
    
                    if(numero>0 && numero<=listaCarros.size()){
                        String novamarca = JOptionPane.showInputDialog(
                        null,
                        "Digite a nova marca do carro.",
                        "Cadastro: nova marca.",
                        JOptionPane.QUESTION_MESSAGE

                    );
                    if (novamarca == null || novamarca.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                        break;
                    }
                    String novomodelo = JOptionPane.showInputDialog(
                        null,
                        "Digite o novo modelo do carro.",
                        "Cadastro: novo modelo.",
                        JOptionPane.QUESTION_MESSAGE

                    );
                    if (novomodelo == null || novomodelo.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                        break;
                    }
                    String novoano = JOptionPane.showInputDialog(
                        null,
                        "Digite o novo ano do carro.",
                        "Cadastro: novo ano.",
                        JOptionPane.QUESTION_MESSAGE

                    );
                    if (novoano == null || novoano.trim().isEmpty()){
                        JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                        break;
                    }

                    listaCarros.get(numero-1).setMarca(novamarca);
                    listaCarros.get(numero-1).setModelo(novomodelo);
                    listaCarros.get(numero-1).setAno(novoano);

                    JOptionPane.showMessageDialog(null, "Informações do carro Nº"+numero+ " alteradas.");
                    }else{
                            JOptionPane.showMessageDialog(null, "Não há carro com este número.");
    
                        }
                    }
                
                break;
        
            case "5":
                if (listaCarros.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado");
                }else{
                    String input = JOptionPane.showInputDialog(null,"Digite o número do carro.","Escoher Carro",JOptionPane.QUESTION_MESSAGE);
                    
                    try{
                        numero = Integer.parseInt(input);
                    }catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro.");
                        break;
                    }

                    if(numero>0 && numero<=listaCarros.size()){
                        listaCarros.remove(numero-1);
                        JOptionPane.showMessageDialog(null, "Carro Removido.");
                    }else{
                        JOptionPane.showMessageDialog(null, "Não há carro com este número.");

                    }
                    
                }

                
                break;
        
            case "6":
                try{
                    FileWriter writer = new FileWriter("carros.txt");
                    lista = "Carros cadastrados:\n\n";
                    for(int i=0;i<listaCarros.size();i++){
                        lista += (i+1)+" - "+listaCarros.get(i).exibirDados();
                    }
                    writer.write(lista);
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Arquivo escrito com sucesso.");
                }catch(IOException e){
                    JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                }
                
                break;
        
            case "7":
                JOptionPane.showMessageDialog(null, "Encerrando");
                executando = false;
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "opção inválida");
                break;
        }
        }
    }
}
