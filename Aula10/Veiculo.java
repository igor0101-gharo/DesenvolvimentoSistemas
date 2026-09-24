public class Veiculo implements Aluguel {
    private String placa;
    private String modelo;
    private String ano;
    private double valorDiaria;
    
    
    
    public Veiculo(String placa, String modelo, String ano, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }



    public String getPlaca() {
        return placa;
    }



    public void setPlaca(String placa) {
        this.placa = placa;
    }



    public String getModelo() {
        return modelo;
    }



    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public String getAno() {
        return ano;
    }



    public void setAno(String ano) {
        this.ano = ano;
    }



    public double getValorDiaria() {
        return valorDiaria;
    }



    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void exibirInfo(){
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Valor da diária:R$ "+valorDiaria);
    }

        @Override 
    public void calcularAluguel(double valor, int dias){
        System.out.println("=====VALOR DO ALUGUEL====");
        System.out.printf("Valor da diária: R$%.2f\nQuantidade de dias: %d\nTotal: R$%.2f",valor,dias,(valor*dias));
    }
    
    public void calcularAluguel(double valor,int dias, double desconto){
        System.out.println("=====VALOR DO ALUGUEL====");
        System.out.printf("Valor da diária: R$%.2f\nQuantidade de dias: %d\nDesconto: R$%.2f\nTotal: R$%.2f",valor,dias,desconto,(valor*dias-desconto));
        
    }
}
