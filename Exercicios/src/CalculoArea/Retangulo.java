package CalculoArea;

public class Retangulo extends CalcularArea
{
    private double base;
    private double largura;
    @Override
    public double calcularArea() {
        double area = this.base*this.largura;
        return area;
    }

    public Retangulo(double base, double largura) {
        this.base = base;
        this.largura = largura;
    }
}
