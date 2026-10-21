package view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


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

        criarinterface();
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

        //btnCadastrar.addActionListener();
        //btnBuscar.addActionListener();
       // btnAlterar.addActionListener();
       // btnExcluir.addActionListener();
       // btnListar.addActionListener();
       // btnLimpar.addActionListener();

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
            
            if (Double.isFinite(preco) || preco < 0) {
                throw new NumberFormatException();
            }

            return preco;
        }catch (NumberFormatException ex){
            throw new IllegalArgumentException("Informe um valor válido");
        }
    }



    
}
