public class Carro{

    private String modelo;
    private String cor;
    private int anoFabricado;

    //Método para retornar o modelo
    public String getModelo() {
        return modelo;
    }

    //método que define qual o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // método que retorna a cor
    public String getCor() {
        return cor;
    }

   //método que define qual a cor
    public void setCor(String cor) {
        this.cor = cor;
    }

   //método que retorna o ano fabricado
    public int getAnoFabricado() {
        return anoFabricado;
    }

    //método que define o ano fabricado
    public void setAnoFabricado(int anoFabricado) {
        this.anoFabricado = anoFabricado;
    }
    public void exibeDados () {
        System.out.println("Modelo: "+ getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAnoFabricado());
    }

}

