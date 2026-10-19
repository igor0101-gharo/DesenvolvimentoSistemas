package dao;

import java.util.ArrayList;

import modelo.Usuario;

public class UsuarioDao {
    private ArrayList<Usuario>usuarios = new ArrayList<>();

    public boolean cadastrarUsuario(Usuario usuarioadd){
        boolean interromper = false;
        for(Usuario usuario : usuarios){
            if(usuario.getLogin().equals(usuarioadd.getLogin())){
                interromper = true;
            }
        }

        if(interromper){
            return false;
        }else{
            usuarios.add(usuarioadd);
            return true;
        }
    }

    public ArrayList<Usuario> listarUsuarios(){
        return usuarios;
    }


    public Usuario buscarUsuario(String login){
        for(Usuario usuario : usuarios){
            if(usuario.getLogin().equals(login)){
                return usuario;

            }
        }
        return null;
    }

    public boolean alterarSenha(String login, String senha){
        Usuario usuario = buscarUsuario(login);

        if (usuario != null){
            usuario.setSenha(senha);
            return true;
        }
        return false;
    }


    public boolean removerUsuario(String login){
        Usuario usuario = buscarUsuario(login);

        if(usuario !=null){
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }

    public boolean fazerLogin(String login , String Senha){
        for(Usuario usuario : usuarios){
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(Senha)){
                return true;
            }
        }
        return false;
    }

}
