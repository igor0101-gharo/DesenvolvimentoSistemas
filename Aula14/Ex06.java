import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex06 {
    public static void main(String[] args) {
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("dado.txt",true));
            bw.write("Terceira linha");
            bw.newLine();
            bw.write("Quarta Linha");

            bw.close();
            System.out.println("Escrita concluida");

            
    }catch (Exception e){
        e.printStackTrace();
    }
}
}
