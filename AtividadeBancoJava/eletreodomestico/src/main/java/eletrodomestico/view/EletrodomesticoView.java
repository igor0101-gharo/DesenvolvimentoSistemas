package eletrodomestico.view;


import javax.swing.JOptionPane;

import eletrodomestico.controle.EletrodomesticoControle;
import eletrodomestico.modelo.Eletrodomestico;

public class EletrodomesticoView {
    private EletrodomesticoControle controle = new EletrodomesticoControle();
    int id;

    //metodos
private void cadastrar(){
        String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do eletrodomestico:",
            "Cadastro:nome",
            JOptionPane.QUESTION_MESSAGE

        );

        if (nome == null || nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }
        String marca = JOptionPane.showInputDialog(null,
            "Digite a marca do eletrodomestico:",
            "Cadastro:marca",
            JOptionPane.QUESTION_MESSAGE

        );

        if (marca == null || marca.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }
        String voltagem = JOptionPane.showInputDialog(null,
            "Digite a voltagem do eletrodomestico:",
            "Cadastro:voltagem",
            JOptionPane.QUESTION_MESSAGE

        );

        if (voltagem == null || voltagem.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        String numero = JOptionPane.showInputDialog(null,
            "Digite o preço do eletrodomestico:",
            "Cadastro:preço",
            JOptionPane.QUESTION_MESSAGE
        );

        try{
            double preco = Double.parseDouble(numero);
            if(preco < 0){
                JOptionPane.showMessageDialog(null, "preço inválido");
                return ;
            }else{
                if (controle.cadastrar(0, nome, marca, voltagem, preco)){
                    JOptionPane.showMessageDialog(null, "Eletrodomestico cadastrado com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar.");

                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número.");
            return ;
        }

    }
    


private void listar(){
    if(controle.listar().isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum eletrodomestico cadastrado.");
    }else{
        String lista = "Carros cadastrados: \n\n";
        for(int i = 0;i<controle.listar().size();i++){
            lista += "-id:"+(controle.listar().get(i).getId())+
            " | Nome:" + (controle.listar().get(i).getNome())+
            " | Marca: "+(controle.listar().get(i).getMarca())+
            " | Voltagem: "+(controle.listar().get(i).getVoltagem())+
            " | preco:R$ "+ (controle.listar().get(i).getPreco())+"\n";
        }

        JOptionPane.showMessageDialog(null, lista,"Lista de eletrodomesticos",JOptionPane.INFORMATION_MESSAGE);

    }
}
    

private void alterar(){

    String numero = JOptionPane.showInputDialog(null,
        "Digite o ID do eletrodomestico.",
        "Alteração",
        JOptionPane.QUESTION_MESSAGE
    );

    try{
        id = Integer.parseInt(numero);
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro");
        return ;
    }

    Eletrodomestico eletrodomesticoalt = controle.buscar(id);

    if (eletrodomesticoalt == null){
        JOptionPane.showMessageDialog(null, "Não há eletrodomestico com esse id");
        return ;
    }

    String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do eletrodomestico:",
            "Cadastro:nome",
            JOptionPane.QUESTION_MESSAGE

        );

        if (nome == null || nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }
        String marca = JOptionPane.showInputDialog(null,
            "Digite a marca do eletrodomestico:",
            "Cadastro:marca",
            JOptionPane.QUESTION_MESSAGE

        );

        if (marca == null || marca.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }
        String voltagem = JOptionPane.showInputDialog(null,
            "Digite a voltagem do eletrodomestico:",
            "Cadastro:voltagem",
            JOptionPane.QUESTION_MESSAGE

        );

        if (voltagem == null || voltagem.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        String numero2 = JOptionPane.showInputDialog(null,
            "Digite o preço do eletrodomestico:",
            "Cadastro:preço",
            JOptionPane.QUESTION_MESSAGE
        );

        try{
            double preco = Double.parseDouble(numero2);
            if(preco < 0){
                JOptionPane.showMessageDialog(null, "preço inválido");
                return ;
            }else{
                if (controle.alterar(id, nome, marca, voltagem, preco)){
                    JOptionPane.showMessageDialog(null, "Eletrodomestico alterado com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possível alterar.");

                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número.");
            return ;
        }

}



private void remover(){
    String numero = JOptionPane.showInputDialog(null,
        "Digite o ID do eletrodomestico.",
        "Alteração",
        JOptionPane.QUESTION_MESSAGE
    );

    try{
        id = Integer.parseInt(numero);
    }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "O valor digitado não é um número inteiro");
        return ;
    }

        Eletrodomestico eletrodomesticoalt = controle.buscar(id);

    if (eletrodomesticoalt == null){
        JOptionPane.showMessageDialog(null, "Não há eletrodomestico com esse id");
        return ;
    }else{
        int resposta = JOptionPane.showConfirmDialog(null, "Eletrodomestico encontrado\n" + 
        "id:"+(eletrodomesticoalt.getId())+
            " | Nome:" + (eletrodomesticoalt.getNome())+
            " | Marca: "+(eletrodomesticoalt.getMarca())+
            " | Voltagem: "+(eletrodomesticoalt.getVoltagem())+
            " | preco:R$ "+ (eletrodomesticoalt.getPreco())+"\nDeseja prosseguir com a exclusão?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if(resposta == JOptionPane.YES_OPTION){
            if (controle.remover(id)){
                JOptionPane.showMessageDialog(null, "Eletrodomestico removido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível remover o eletrodomestico");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }





}


// menu
public void menu(){
    boolean executando = true;

    while(executando){
        String opcao = JOptionPane.showInputDialog(null,
            "Escolha uma opção:\n"+
            "1-Cadastrar eletrodomestico\n"+
            "2-listar\n"+
            "3-Alterar eletrodomestico\n"+
            "4-remover eletrodomestico\n"+
            "0-Sair", "menu principal",JOptionPane.QUESTION_MESSAGE
        );


        if (opcao ==null){
            JOptionPane.showMessageDialog(null, "operação cancelada");
            break;
        }

        switch (opcao) {
            case "1":
                cadastrar();
                
                break;
        
            case "2":
                listar();
                break;
        
            case "3":
                alterar();
                break;
        
            case "4":
                remover();
                break;
        
            case "0":
                JOptionPane.showMessageDialog(null, "Encerrando");
                executando = false;
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "opcão inválida");
                break;
        }
    }
}
}