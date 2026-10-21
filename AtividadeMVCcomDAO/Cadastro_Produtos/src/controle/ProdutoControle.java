package controle;

import java.util.ArrayList;

import dao.ProdutoDao;
import modelo.Produto;

public class ProdutoControle {
    private ProdutoDao dao;

    public ProdutoControle(){
        dao = new ProdutoDao();
    }

    public void cadastrarProduto(int id, String nome, String categoria, double preco, int quantidade ){
        Produto produto = new Produto(id, nome, categoria, preco, quantidade);
        dao.cadastrarProduto(produto);
    }

    public ArrayList<Produto> listaProdutos(){
        return  dao.listar();
    }

    public Produto buscar(int id){
        return  dao.buscar(id);
    }

    public  boolean alterar(int id,String nome,String categoria, double preco, int quantidade){
        return dao.alterar(id, nome, categoria, preco, quantidade);
    }

    public boolean remover(int id){
        return  dao.remover(id);
    }

}
