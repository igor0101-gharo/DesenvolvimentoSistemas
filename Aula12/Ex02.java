public class Ex02 {
    public static void main(String[] args) {
        int [] numero = {10,20,30};

        try{
            System.out.println(numero[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: índice fora do limite.");
        }finally{
            System.out.println("Fim do programa");
        }
    }
}
