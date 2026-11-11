package projeto.controle;


import java.util.ArrayList;

import projeto.dao.FuncionarioDao;
import projeto.modelo.Funcionario;
import projeto.modelo.Gerente;
import projeto.modelo.Operador;

public class FuncionarioControle {
    private FuncionarioDao dao;

    public FuncionarioControle(){
        dao = new FuncionarioDao();
    }

    public boolean cadastrarOperador(int matricula, String nome, int idade, String funcao) {
        Operador operador = new Operador(matricula, nome, idade, funcao);
        return dao.cadastrar(operador);
    }
    public boolean cadastrarGerente(int matricula, String nome, int idade, String departamento) {
        Gerente gerente = new Gerente(matricula, nome, idade, departamento);
        return dao.cadastrar(gerente);
    }

    public ArrayList<Funcionario> listar(){
        return dao.listar();
    }

    public Funcionario buscar(int matricula) {
        return dao.buscar(matricula);
    }

    public boolean alterarOperador(int matricula, String nome, int idade, String funcao) {
        return dao.alterarOperador(matricula, nome, idade, funcao);
    }

    public boolean alterarGerente(int matricula, String nome, int idade, String departamento) {
        return dao.alterarGerente(matricula, nome, idade, departamento);
    }

    public boolean remover(int matricula) {
        return dao.remover(matricula);
    }
}
