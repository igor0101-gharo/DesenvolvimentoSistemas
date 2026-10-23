package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Locale;


import controle.ProdutoControle;
import controle.UsuarioControle;
import modelo.Produto;

public class ProdutoView extends JFrame {

    //OBJETOS PARA SE COMUNICAR COM O CONTROLE
    private final ProdutoControle controleP = new ProdutoControle();
    private final UsuarioControle controleU = new UsuarioControle();

    // COMPONETES DA INTEFACE
    // EsPAÇOS DE TEXTO
    private JTextField txtId;
    private JTextField txtNome;
    private JTextField txtCategoria;
    private JTextField txtPreco;
    private JTextField txtQuantidade;
    
    private JTextField txtLogin;
    private JTextField txtSenha;

    // BOTÕES
    private JButton btnCadastrar;
    private JButton btnAlterar;
    private JButton btnBuscar;
    private JButton btnExcluir;
    private JButton btnListar;
    private JButton btnLimpar;
    private JButton btnLogin;
    private JButton btnUsuario;

    //TABELAS
    private JTable tabela;
    private DefaultTableModel modeloTabela;

    //CONSTRUTOR DA INTERFACE

    public ProdutoView(){
        setTitle("Gereciamento de Produtos");
        setSize(800,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));

        interfaceLogin();
        ConfigurarUsuario();
        
    }


    private void interfaceLogin(){
        //TITULO
        JLabel titulo = new JLabel(
            "GERENCIAMENTO DE PRODUTOS:LOGIN",
            SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(30, 60 , 100));
        titulo.setBorder(
            BorderFactory.createEmptyBorder(15,10,15,10)
        );

        add(titulo,BorderLayout.NORTH);

        //PAINEL PRINCIPAL
            JPanel painelPrincipal = new JPanel(new BorderLayout(10,10));

            painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,15,15,15));


        add(painelPrincipal,BorderLayout.CENTER);

         //Painel de cadastro
        JPanel painelCadastro = new JPanel(new GridBagLayout());

        painelCadastro.setBorder(BorderFactory.createTitledBorder("Dados do produto"));

        GridBagConstraints gbc  = new GridBagConstraints();

        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;


        //Login
        gbc.gridx = 0;
        gbc.gridy = 0;

        painelCadastro.add(new JLabel("Login"),gbc);

        txtLogin = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtLogin,gbc);
        //Senha
        gbc.gridx = 0;
        gbc.gridy = 1;

        painelCadastro.add(new JLabel("Senha"),gbc);

        txtSenha = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtSenha,gbc);

        painelPrincipal.add(painelCadastro,BorderLayout.CENTER);
        //Botões
        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnLogin = new JButton("Entrar");
        btnUsuario = new JButton("Cadastrar");

        painelBotoes.add(btnLogin);
        painelBotoes.add(btnUsuario);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);


        


    }
    //cria os componentes da interface
    private void criarinterface(){
        //TITULO
        JLabel titulo = new JLabel(
            "GERENCIAMENTO DE PRODUTOS",
            SwingConstants.CENTER
        );

        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setForeground(Color.WHITE);
        titulo.setOpaque(true);
        titulo.setBackground(new Color(30, 60 , 100));
        titulo.setBorder(
            BorderFactory.createEmptyBorder(15,10,15,10)
        );

        add(titulo,BorderLayout.NORTH);



        //PAINEL PRINCIPAL
            JPanel painelPrincipal = new JPanel(new BorderLayout(10,10));

            painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,15,15,15));


        add(painelPrincipal,BorderLayout.CENTER);


        //Painel de cadastro
        JPanel painelCadastro = new JPanel(new GridBagLayout());

        painelCadastro.setBorder(BorderFactory.createTitledBorder("Dados do produto"));

        GridBagConstraints gbc  = new GridBagConstraints();

        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;


        //ID
        gbc.gridx = 0;
        gbc.gridy = 0;

        painelCadastro.add(new JLabel("ID"),gbc);

        txtId = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtId,gbc);
        //Nome
        gbc.gridx = 0;
        gbc.gridy = 1;

        painelCadastro.add(new JLabel("Nome"),gbc);

        txtNome = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtNome,gbc);
        
        //Categoria
        gbc.gridx = 0;
        gbc.gridy = 2;

        painelCadastro.add(new JLabel("Categoria"),gbc);

        txtCategoria = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtCategoria,gbc);
        
        //Preço
        gbc.gridx = 0;
        gbc.gridy = 3;

        painelCadastro.add(new JLabel("Preço"),gbc);

        txtPreco = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtPreco,gbc);
        
        //Quantidade
        gbc.gridx = 0;
        gbc.gridy = 4;

        painelCadastro.add(new JLabel("Quantidade"),gbc);

        txtQuantidade = new JTextField(15);

        gbc.gridx = 1;
        painelCadastro.add(txtQuantidade,gbc);

        painelPrincipal.add(painelCadastro,BorderLayout.NORTH);


        //Tabela
        modeloTabela = new DefaultTableModel(new Object[]{"ID","Nome","Categoria","Preço","Quantidade"},0){
            @Override 
            public boolean isCellEditable(int linha, int coluna){
                return false;
            }
        };

        tabela = new JTable(modeloTabela);
        tabela.setRowHeight(25);

        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        tabela.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(tabela);

        scroll.setBorder(BorderFactory.createTitledBorder("Produtos Cadastrados"));


        painelPrincipal.add(scroll,BorderLayout.CENTER);


        //Botões
        JPanel painelBotoes = new JPanel(new FlowLayout());

        btnCadastrar = new JButton("Cadastrar");
        btnBuscar = new JButton("Buscar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnListar = new JButton("Listar");
        btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnBuscar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnListar);
        painelBotoes.add(btnLimpar);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

    }

    //Configurar eventos

    private void ConfigurarEventos(){

        btnCadastrar.addActionListener(e -> cadastrar());
        btnBuscar.addActionListener(e -> buscar());
        btnAlterar.addActionListener(e-> alterar());
        btnExcluir.addActionListener(e -> excluir());
        btnListar.addActionListener(e -> atualizarTabela());
        btnLimpar.addActionListener(e -> limparCampos());

        tabela.getSelectionModel().addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting() && tabela.getSelectedRow() != -1){
                int linha = tabela.convertRowIndexToModel(tabela.getSelectedRow());

                txtId.setText(modeloTabela.getValueAt(linha, 0).toString());
                txtNome.setText(modeloTabela.getValueAt(linha, 1).toString());
                txtCategoria.setText(modeloTabela.getValueAt(linha, 2).toString());
                txtPreco.setText(modeloTabela.getValueAt(linha, 3).toString().replace(",", "."));
                txtQuantidade.setText(modeloTabela.getValueAt(linha, 4).toString());

            }
        });

        
    }

    private void ConfigurarUsuario(){
        btnLogin.addActionListener(e -> fazerLogin());
        btnUsuario.addActionListener(e -> criarUsusario());

    }


    //Validações
    private String lerNome() {

        String nome = txtNome.getText().trim();

        if (nome.isEmpty()){
            throw new IllegalArgumentException("Informe o nome do produto");
        }
        return nome;
    }
    
    private String lerCategoria() {

        String categoria = txtCategoria.getText().trim();

        if (categoria.isEmpty()){
            throw new IllegalArgumentException("Informe a categoria do produto");
        }
        return categoria;
    }
    private String lerLogin() {

        String login = txtLogin.getText().trim();

        if (login.isEmpty()){
            throw new IllegalArgumentException("Informe a login do produto");
        }
        return login;
    }
    private String lerSenha() {

        String senha = txtSenha.getText().trim();

        if (senha.isEmpty()){
            throw new IllegalArgumentException("Informe a senha do produto");
        }
        return senha;
    }
    
    private int lerId() {

            int id = Integer.parseInt(txtId.getText().trim());
    
            return id;

    
    }
    
    private int lerQuantidade() {

            try{

                int quantidade = Integer.parseInt(txtQuantidade.getText().trim());
                
                if(quantidade < 0){
                    throw new NumberFormatException();
                }
                return quantidade;

            }catch(NumberFormatException ex){
                throw new IllegalArgumentException("Informe uma quantidade válida");
            }

    
    }
    

    private double lerPreco() {

        try{
            double preco = Double.parseDouble(txtPreco.getText().trim().replace(",", "."));
            
            if (!Double.isFinite(preco) || preco < 0) {
                throw new NumberFormatException();
            }

            return preco;
        }catch (NumberFormatException ex){
            throw new IllegalArgumentException("Informe um valor válido");
        }
    }





    private void mostrarMensagem(String mensagem) {

        JOptionPane.showMessageDialog(
                this,
                mensagem,
                "Informação",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

        // MENSAGEM DE ERRO
    private void mostrarErro(String mensagem) {

        JOptionPane.showMessageDialog(
                this,
                mensagem,
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }

    private  void atualizarTabela(){
        modeloTabela.setRowCount(0);

        for(Produto produto : controleP.listaProdutos()){
            modeloTabela.addRow(new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getCategoria(),
                String.format(Locale.forLanguageTag("pt-BR"), "%.2f",produto.getPreco()),
                String.format(Locale.forLanguageTag("pt-BR"),  "%d",produto.getQuantidade()
            )
            });
        }
    }

    private void limparCampos(){
        tabela.clearSelection();

        txtId.setText("");
        txtNome.setText("");
        txtCategoria.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
        txtLogin.setText("");
        txtSenha.setText("");

        txtId.requestFocusInWindow();
    }
    private void limparCamposUsuario(){

        
        txtLogin.setText("");
        txtSenha.setText("");

        txtLogin.requestFocusInWindow();
    }




    private void cadastrar(){

        try{
            int id = lerId();
            String nome = lerNome();
            String categoria = lerCategoria();
            double preco = lerPreco();
            int quantidade = lerQuantidade();


            if(controleP.buscar(id) != null) {
                mostrarMensagem("Id já cadastrado");
                return;
            }

            controleP.cadastrarProduto(id, nome, categoria, preco, quantidade);
            mostrarMensagem("Produto cadastrado com sucesso!");

            atualizarTabela();
            limparCampos();
        }catch(IllegalArgumentException ex){
            mostrarErro(ex.getMessage());
        }


    }

    private void buscar(){
        try{
            int id = lerId();

            Produto produto = controleP.buscar(id);

            if (produto != null) {
                txtNome.setText(produto.getNome());
                txtCategoria.setText(produto.getCategoria());
                txtPreco.setText(String.valueOf(produto.getPreco()));
                txtQuantidade.setText(String.valueOf(produto.getQuantidade()));

                mostrarMensagem("Produto encontrado!");
            }else{
                mostrarMensagem("Produto não encontrado");
            }
        }catch(IllegalArgumentException ex){
            mostrarErro(ex.getMessage());
        }
    }


    private void alterar(){
        try{

            int id = lerId();
            String nome = lerNome();
            String categoria = lerCategoria();
            double preco = lerPreco();
            int quantidade = lerQuantidade();

            boolean alterado = controleP.alterar(id, nome, categoria, preco, quantidade);

            if(alterado){

                mostrarMensagem("Produto alterado com sucesso!");
                atualizarTabela();
                limparCampos();
            }else{
                mostrarErro("Produto não encontrado");
            }
        }catch(IllegalArgumentException ex){
            mostrarErro(ex.getMessage());
        }
    }

    private void excluir(){
        try{
            int id = lerId();

            Produto produto = controleP.buscar(id);

            if (produto == null){
                mostrarMensagem("Produto não encontrado");
                return ;

            }

            int opcao = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir o produto?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION
            );

            if (opcao == JOptionPane.YES_OPTION) {
                boolean removido = controleP.remover(id);

                if(removido){
                    mostrarMensagem("produto excluído com sucesso");

                    atualizarTabela();
                    limparCampos();

                }
            }

        }catch(IllegalArgumentException ex){
            mostrarErro(ex. getMessage());
        }
    }


    private void criarUsusario(){
        try{
            String login = lerLogin();
            String senha = lerSenha();

            if(controleU.buscar(login) != null){
                mostrarMensagem("Usuario já existe");
                return;
            }

            controleU.cadastrarUsuario(login, senha);
            mostrarMensagem("Usuário cadastrado com sucesso");
        }catch(IllegalArgumentException ex){
            mostrarErro(ex.getMessage());
        }

        limparCamposUsuario();
    }

    private boolean  fazerLogin(){
        try{
            String login = lerLogin();
            String senha = lerSenha();

            if(controleU.buscar(login) != null){
                boolean acesso = controleU.fazerLogin(login, senha);
                
                if (acesso){
                    getContentPane().removeAll();
                    criarinterface();
                    ConfigurarEventos();
                    revalidate();
                    repaint();

                    return true;
                }else{
                    mostrarErro("Senha incorreta");
                    return false;
                }
            }else{
                mostrarErro("Usuário não encontrado");
                return false;
            }
        }catch(IllegalArgumentException ex){
            mostrarErro(ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            ProdutoView tela = new ProdutoView();

            tela.setVisible(true);
        });
    }
    
}
