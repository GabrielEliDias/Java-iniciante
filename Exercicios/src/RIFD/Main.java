package RIFD;

public class Main {
    public static void main(String[] args) {
        RFIDShippingContainer shippingContainer = new RFIDShippingContainer();
        Produto maça = new Produto("maça", 1);
        Produto pera = new Produto("pera", 2);

        shippingContainer.AdicionarContainer(maça);
        shippingContainer.AdicionarContainer(pera);

        shippingContainer.getManifest();

    }
}
