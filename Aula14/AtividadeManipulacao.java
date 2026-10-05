import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AtividadeManipulacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op = -1;

        while (op!=0) {
            try{
                System.out.println("\n\n=====MENU DE ARQUIVO=====");
                System.out.println("1-Criar Arquivo");
                System.out.println("2-Escrever no arquivo");
                System.out.println("3-Ler arquivo");
                System.out.println("4-Alterar arquivo");
                System.out.println("5-Remover arquivo");
                System.out.println("0-Sair");


                op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1:
                        File arquivo = new File("Arquivo.txt");
                        if(arquivo.createNewFile()){
                            System.out.println("Arquivo criado com sucesso.");
                        }else{
                            System.out.println("Arquivo já existe.");
                        }
                        
                        break;
                
                    case 2:
                        FileWriter writer = new FileWriter("Arquivo.txt",true);
                        System.out.println("Digite o que deseja escrever no arquivo.");
                        String escrita = sc.nextLine();
                        writer.write(escrita+"\n");
                        writer.close();
                        System.out.println("Conteúdo escrito com sucesso.");
                        
                        break;
                
                    case 3:
                        BufferedReader br = new BufferedReader(new FileReader("Arquivo.txt"));
                        String linha;

                        System.out.println("Conteúdo do arquivo: ");
                        while ((linha=br.readLine())!=null) {
                            System.out.println(linha);
                        }
                        br.close();

                        
                        break;
                
                    case 4:
                        FileWriter reescrever =  new FileWriter("Arquivo.txt");
                        System.out.println("Digite o novo texto:");
                        String rescrita = sc.nextLine();
                        reescrever.write(rescrita+"\n");
                        reescrever.close();
                        System.out.println("Conteúdo escrito com sucesso.");

                        
                        break;
                
                    case 5:
                        File arquivodel = new File("Arquivo.txt");
                        if(arquivodel.delete()){
                            System.out.println("Arquivo removido.");
                        }else{
                            System.out.println("Erro ao remover o arquivo.");
                        }

                        
                        break;
                
                    case 0:
                        System.out.println("Encerrando....");
                        break;
                
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }catch(IOException e){
                System.out.println("Erro: "+e.getMessage());
            }catch(Exception e){
                System.out.println("Erro "+e.getMessage());
            }
        }
        
        
        
        
        
        
        sc.close();
    }
}
