import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulacao {
    public static void main(String[] args) {
        
        // CRIAR ARQUIVO
        try{

            File arquivo = new File("Arquivo.txt");
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado "+arquivo.getName());
            }else{
                System.out.println("Arquivo já existe");
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        //ESCREVER

        try{
            FileWriter writer = new FileWriter("Arquivo.txt",true);
            writer.write("Olá, este é o conteúdo inicial\n");
            writer.write("Linha 2 do arquivo");
            writer.close();
            System.out.println("Conteúdo escrito com sucesso.");
        }catch(IOException e){
            System.out.println("Erro ao escrever: "+e.getMessage());
        }

        //LER ARQUIVO

        try{
            BufferedReader reader = new BufferedReader(new FileReader("Arquivo.txt"));
            String linha;

            System.out.println("Conteúdo do arquivo:");
            while ((linha = reader.readLine())!=null) {
                System.out.println(linha);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Erro ao ler: "+e.getMessage());
        }

        //ALTERAR

        try{
            FileWriter fw = new FileWriter("Arquivo.txt");
            fw.write("Conteúdo alterado\n");
            fw.write("Nova informação no arquivo");
            fw.close();

            System.out.println("arquivo alterado com sucesso!");
        }catch(IOException e){
            System.out.println("Erro ao alterar: "+e.getMessage());
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("Arquivo.txt"));
            String linha;

            System.out.println("Conteúdo após alteração");
            while ((linha =br.readLine())!= null ) {
                System.out.println(linha);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Erro ao ler: "+e.getMessage());
        }
        //REMOVER ARQUIVO
        File arquivo = new File("Arquivo.txt");
        if(arquivo.delete()) {
            System.out.println("Arquivo removido.");
        }else{
            System.out.println("Erro ao remover arquivo.");
        }




    }
}
