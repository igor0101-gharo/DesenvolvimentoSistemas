package projeto.view;


import javax.swing.JOptionPane;

import projeto.controle.FuncionarioControle;
import projeto.modelo.Funcionario;
import projeto.modelo.Gerente;
import projeto.modelo.Operador;

public class FuncionarioView {
    private FuncionarioControle controle = new FuncionarioControle();
    int matricula;
    int idade;

    //metodos
    private void cadastrarOperador(){

        String numero = JOptionPane.showInputDialog(null,
            "Digite a matrícula para cadastro.",
            "Cadastro:Matrícula",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            matricula = Integer.parseInt(numero);
            if (matricula<0){
                JOptionPane.showMessageDialog(null, "matricula inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        if (controle.buscar(matricula) != null){
            JOptionPane.showMessageDialog(null, "Já há um funcionário com essa matrícula, encerrando o processo.");
            return ;
        }


        String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do funcionário para cadastro.",
            "Cadastro: Nome",
            JOptionPane.QUESTION_MESSAGE
        );

        if(nome == null || nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
        }
        




        numero = JOptionPane.showInputDialog(null,
            "Digite a idade para cadastro.",
            "Cadastro:idade",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            idade = Integer.parseInt(numero);
            if (idade<0){
                JOptionPane.showMessageDialog(null, "idade inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        String funcao = JOptionPane.showInputDialog(null,
            "Digite a função do funcionário para cadastro.",
            "Cadastro: função",
            JOptionPane.QUESTION_MESSAGE
        );

        if(funcao == null || funcao.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
        }

        if (controle.cadastrarOperador(matricula, nome, idade, funcao)){
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");

        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar.");
        }

    }
    
    private void cadastrarGerente(){

        String numero = JOptionPane.showInputDialog(null,
            "Digite a matrícula para cadastro.",
            "Cadastro:Matrícula",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            matricula = Integer.parseInt(numero);
            if (matricula<0){
                JOptionPane.showMessageDialog(null, "matricula inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        if (controle.buscar(matricula) != null){
            JOptionPane.showMessageDialog(null, "Já há um funcionário com essa matrícula, encerrando o processo.");
            return ;
        }


        String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do funcionário para cadastro.",
            "Cadastro: Nome",
            JOptionPane.QUESTION_MESSAGE
        );

        if(nome == null || nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
        }
        




        numero = JOptionPane.showInputDialog(null,
            "Digite a idade para cadastro.",
            "Cadastro:idade",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            idade = Integer.parseInt(numero);
            if (idade<0){
                JOptionPane.showMessageDialog(null, "idade inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        String departamento = JOptionPane.showInputDialog(null,
            "Digite o departamento do funcionário para cadastro.",
            "Cadastro: departamento",
            JOptionPane.QUESTION_MESSAGE
        );

        if(departamento == null || departamento.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
        }

        if (controle.cadastrarGerente(matricula, nome, idade, departamento)){
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso.");

        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar.");
        }

    }
    
   private void listar(){
    if(controle.listar().isEmpty()){
        JOptionPane.showMessageDialog(null, "Nenhum funcionário encontrado.");
    }else{
        String lista = "Funcionários cadastrados: \n\n";
        for(Funcionario funcionario : controle.listar()){
            
                lista += funcionario + "\n\n";
            }

            JOptionPane.showMessageDialog(null, lista,"Lista de funcionários",JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private void alterar(){
        if (controle.listar().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
            return ;
        }

        String numero = JOptionPane.showInputDialog(null,
            "Digite a matrícula para alteração.",
            "Alteração:Matrícula",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            matricula = Integer.parseInt(numero);
            if (matricula<0){
                JOptionPane.showMessageDialog(null, "matricula inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        Funcionario funcionario = controle.buscar(matricula);

        if (funcionario == null){
            JOptionPane.showMessageDialog(null, "Não há funcionário com essa matrícula");
            return ;
        }

        String nome = JOptionPane.showInputDialog(null,
            "Digite o nome do funcionário para alteração.",
            "Alteração: Nome",
            JOptionPane.QUESTION_MESSAGE
        );

        if(nome == null || nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
        }
        




        numero = JOptionPane.showInputDialog(null,
            "Digite a idade para alteração.",
            "Alteração:idade",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            idade = Integer.parseInt(numero);
            if (idade<0){
                JOptionPane.showMessageDialog(null, "idade inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        if (funcionario instanceof Operador){
                    
            String funcao = JOptionPane.showInputDialog(null,
            "Digite a função do funcionário para alteração.",
            "Alteração: função",
            JOptionPane.QUESTION_MESSAGE
            );

            if(funcao == null || funcao.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
            return ;
            }

            if(controle.alterarOperador(matricula, nome, idade, funcao)){
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível alterar");
            }
        }else if(funcionario instanceof Gerente){
            
            String departamento = JOptionPane.showInputDialog(null,
                "Digite o departamento do funcionário para alteração.",
                "Alteração: departamento",
                JOptionPane.QUESTION_MESSAGE
            );
            
            if(departamento == null || departamento.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                return ;
            }
            
            if(controle.alterarGerente(matricula, nome, idade, departamento)){
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível alterar");
            }
        }
    }

    private void buscar(){
        if(controle.listar().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
        }else{
            String numero = JOptionPane.showInputDialog(null,
            "Digite a matrícula para Busca.",
            "Busca:Matrícula",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            matricula = Integer.parseInt(numero);
            if (matricula<0){
                JOptionPane.showMessageDialog(null, "matricula inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        Funcionario funcionario = controle.buscar(matricula);

        if (funcionario == null){
            JOptionPane.showMessageDialog(null, "Não há funcionário com esta matrícula");
        }else{
            JOptionPane.showMessageDialog(null,"Funcionário:\n" +funcionario);
        }
        }
    }

    private void excluir(){
        if (controle.listar().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
        }else{
            String numero = JOptionPane.showInputDialog(null,
            "Digite a matrícula do funcionário que deseja excluir.",
            "Exclusão:Matrícula",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (numero == null || numero.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo vazio detectado, encerrando operação");
            return ;
        }

        try{
            matricula = Integer.parseInt(numero);
            if (matricula<0){
                JOptionPane.showMessageDialog(null, "matricula inválida");
                return ;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O valor digitado não é um número inteiro" );
            return ;
        }

        Funcionario funcionario = controle.buscar(matricula);

        if (funcionario == null){
            JOptionPane.showMessageDialog(null, "Não há funcionário cadastrado com essa matrícula.");
        }

        int resposta = JOptionPane.showConfirmDialog(null, "funcionário encontrado\n"+
            funcionario +"\nDeseja prosseguir com a exclusão?", "Confirmar exclusão.",JOptionPane.YES_NO_OPTION
        );

        if(resposta == JOptionPane.YES_OPTION){
            if(controle.remover(matricula)){
                JOptionPane.showMessageDialog(null, "funcionário removido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível remover o funcionário");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
        }
    }


    public void menu(){
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(null,
                "Escolha uma opção:\n"+
                "1-Cadastrar Operador\n"+
                "2-Cadastrar Gerente\n"+
                "3-Listar todos os funcionários\n"+
                "4-Buscar um funcionário\n"+
                "5-Alterar informações de um funcionário\n"+
                "6-Excluir um funcionário\n"+
                "0-Sair", "Menu Principal",JOptionPane.QUESTION_MESSAGE
            );

            if(opcao == null){
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                break;
            }

            switch (opcao) {
                case "1":
                    cadastrarOperador();
                    
                    break;
            
                case "2":
                    cadastrarGerente();
                    break;
            
                case "3":
                    listar();
                    break;
            
                case "4":
                    buscar();
                    break;
            
                case "5":
                    alterar();
                    break;
            
                case "6":
                    excluir();
                    break;
            
                case "0":
                    JOptionPane.showMessageDialog(null, "Encerrando");
                    executando = false;
                    break;
            
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }

        }
    }

   }






