package Veiculos;

public class main {
    public static void main(String[] args) {
        Veiculo bike = new Bicicleta();
        Veiculo carro = new Carro();

        bike.Mover();
        carro.Mover();
    }
}
