import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GerenciadorArquivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;
        Path diretorio = Paths.get("LABORATORIO");


        while (executando) {
            try{
                String opcao =JOptionPane.showInputDialog(null,
                    "Escolha uma opção:\n"+
                    "1-Criar Arquivo\n"+
                    "2-Escrever no arquivo\n"+
                    "3-Ler arquivo\n"+
                    "4-Renomear arquivo\n"+
                    "5-Excluir arquivo\n"+
                    "6-Mostrar informações do arquivo\n"+
                    "7-Sair","Menu Principal", JOptionPane.QUESTION_MESSAGE
                );

                if(opcao == null){
                    JOptionPane.showMessageDialog(null, "operação cancelada");
                    break;
                }

                switch (opcao) {
                    case "1":
                        String nomeArquivo = JOptionPane.showInputDialog(null,
                            "Digite o nome do arquivo com extensão.","Criar arquivo",JOptionPane.QUESTION_MESSAGE
                        );

                        if (nomeArquivo == null || nomeArquivo.trim().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Campo vazio, encerrando operação.");
                            break;
                        }

                        File arquivo = new File("LABORATORIO/"+nomeArquivo);
                        if(arquivo.createNewFile()){
                            JOptionPane.showMessageDialog(null, "arquivo "+nomeArquivo+" criado com sucesso");
                        }else{
                            JOptionPane.showMessageDialog(null, "Já existe um arquivo com o nome: "+nomeArquivo);

                        }
                        
                        break;
                
                    case "2":
                        

                        
                        break;
                
                    case "3":
                        
                        break;
                
                    case "4":
                        
                        break;
                
                    case "5":
                        
                        break;
                
                    case "6":
                        
                        break;
                
                    case "7":
                        executando = false;
                        break;
                
                    default:
                        break;
                }
            }catch(Exception e){

            }
        }
        
        
        
        
        
        sc.close();
        
    }
}
