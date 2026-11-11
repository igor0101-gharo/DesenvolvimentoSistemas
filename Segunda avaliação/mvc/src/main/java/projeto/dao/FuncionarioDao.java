package projeto.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import projeto.conexao.Conexao;
import projeto.modelo.Funcionario;
import projeto.modelo.Gerente;
import projeto.modelo.Operador;

public class FuncionarioDao {
    public boolean cadastrar(Operador operador){
        String sql = "insert into funcionario(matricula, nome, idade) values(?, ?, ?);insert into operador(funcao,Funcionario_matricula)VALUES(?,?)";

        try(Connection conexao = Conexao.conectar();
    PreparedStatement comando = conexao.prepareStatement(sql)){
        comando.setInt(1, operador.getMatricula());
        comando.setString(2, operador.getNome());
        comando.setInt(3, operador.getIdade());
        comando.setString(4, operador.getFuncao());
        comando.setInt(5, operador.getMatricula());
        comando.executeUpdate();
        return true;
        }catch (SQLException e) {
            System.err.println("Erro ao cadastrar: "+e.getMessage());
            return false;
        }
    }


    public boolean cadastrar(Gerente gerente){
        String sql = "insert into funcionario(matricula, nome, idade) values(?, ?, ?);insert into gerente(departamento,Funcionario_matricula)VALUES(?,?)";

        try(Connection conexao = Conexao.conectar();
    PreparedStatement comando = conexao.prepareStatement(sql)){
        comando.setInt(1, gerente.getMatricula());
        comando.setString(2, gerente.getNome());
        comando.setInt(3, gerente.getIdade());
        comando.setString(4, gerente.getDepartamento());
        comando.setInt(5, gerente.getMatricula());
        comando.executeUpdate();
        return true;
        }catch (SQLException e) {
            System.err.println("Erro ao cadastrar: "+e.getMessage());
            return false;
        }
    }


    public ArrayList<Funcionario> listar(){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT distinct matricula,nome,idade,funcao,departamento from operador right JOIN funcionario on matricula = Funcionario_matricula Left join gerente as t3 on t3.Funcionario_matricula = matricula";

        try (Connection conexao = Conexao.conectar();PreparedStatement
        comando=conexao.prepareStatement(sql);
    ResultSet resultado=comando.executeQuery()){
        while (resultado.next()) {
            String funcao =resultado.getString("funcao");
            String departamento = resultado.getString("departamento");

            if (funcao != null){
                Operador operador = new Operador();
                operador.setMatricula(resultado.getInt("matricula"));
                operador.setNome(resultado.getString("nome"));
                operador.setIdade(resultado.getInt("idade"));
                operador.setFuncao(funcao);
                funcionarios.add(operador);
            }
            else if (departamento!=null){
                Gerente gerente = new Gerente();
                gerente.setMatricula(resultado.getInt("matricula"));
                gerente.setNome(resultado.getString("nome"));
                gerente.setIdade(resultado.getInt("idade"));
                gerente.setDepartamento(departamento);
                funcionarios.add(gerente);
            }
        }
        
        } catch (SQLException e) {
            System.out.println("Erro ao listar"+e.getMessage());
        }
        return funcionarios;
    }

    public Funcionario buscar(int matricula) {
        String sql = "SELECT distinct matricula,nome,idade,funcao,departamento from operador right JOIN funcionario on matricula = Funcionario_matricula Left join gerente as t3 on t3.Funcionario_matricula = matricula where matricula = ?";

        try (Connection conexao = Conexao.conectar();PreparedStatement
        comando=conexao.prepareStatement(sql)){
            comando.setInt(1, matricula);
            try(ResultSet resultado=comando.executeQuery()){
                if (resultado.next()) {
                    String funcao =resultado.getString("funcao");
                    String departamento = resultado.getString("departamento");

                    if (funcao != null){
                        Operador operador = new Operador();
                        operador.setMatricula(resultado.getInt("matricula"));
                        operador.setNome(resultado.getString("nome"));
                        operador.setIdade(resultado.getInt("idade"));
                        operador.setFuncao(funcao);
                        return operador;
                    }
                    else if (departamento!=null){
                        Gerente gerente = new Gerente();
                        gerente.setMatricula(resultado.getInt("matricula"));
                        gerente.setNome(resultado.getString("nome"));
                        gerente.setIdade(resultado.getInt("idade"));
                        gerente.setDepartamento(departamento);
                        return gerente;
                    }
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar"+e.getMessage());
        }
        return null;
    }

    public boolean alterarOperador(int matricula, String nome, int idade, String funcao) {
        String sql = "UPDATE funcionario SET nome = ?, idade = ? WHERE matricula= ? ; UPDATE operador SET funcao = ? WHERE Funcionario_matricula = ?";

        try (Connection conexao = Conexao.conectar();PreparedStatement
        comando=conexao.prepareStatement(sql)){
            comando.setString(1, nome);
            comando.setInt(2, idade);
            comando.setInt(3, matricula);
            comando.setString(4, funcao);
            comando.setInt(5, matricula);
            return comando.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar"+e.getMessage());
            return false;
        }
    }
    public boolean alterarGerente(int matricula, String nome, int idade, String departamento) {
        String sql = "UPDATE funcionario SET nome = ?, idade = ? WHERE matricula= ? ; UPDATE gerente SET departamento = ? WHERE Funcionario_matricula = ?";

        try (Connection conexao = Conexao.conectar();PreparedStatement
        comando=conexao.prepareStatement(sql)){
            comando.setString(1, nome);
            comando.setInt(2, idade);
            comando.setInt(3, matricula);
            comando.setString(4, departamento);
            comando.setInt(5, matricula);
            return comando.executeUpdate()>0;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar"+e.getMessage());
            return false;
        }
    }

    public boolean remover(int matricula) {
        String sql = "DELETE from funcionario where matricula = ?";

        try (Connection conexao = Conexao.conectar();PreparedStatement
        comando=conexao.prepareStatement(sql)){
            comando.setInt(1, matricula);
            return comando.executeUpdate()>0;
            
        } catch (SQLException e) {
            System.out.println("Erro ao excluir"+e.getMessage());
            return false;
        }
    }
}
