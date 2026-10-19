package controle;

import java.util.ArrayList;

import dao.UsuarioDao;
import modelo.Usuario;

public class UsuarioControle {
    private UsuarioDao dao;

    public UsuarioControle(){
        dao = new UsuarioDao();
    }


    public void cadastrarUsuario(String nome, String senha){
        Usuario usuario = new Usuario(nome, senha);
        dao.cadastrarUsuario(usuario);
    }

    public ArrayList<Usuario> listarUsuarios(){
        return dao.listarUsuarios();
    }

    public Usuario buscar(String nome){
        return  dao.buscarUsuario(nome);
    }
    

    public boolean alterar(String login, String senha){
        return dao.alterarSenha(login, senha);
    }

    public boolean remover(String nome){
        return dao.removerUsuario(nome);
    }

    public boolean fazerLogin(String login, String senha){
        return dao.fazerLogin(login, senha);
    }
}
