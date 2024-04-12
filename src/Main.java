public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Punto");
        meuCarro.setCor("Azul");
        meuCarro.setAnoFabricado(2008);

        meuCarro.exibeDados();
    }
}