package CalculoArea;

public class Triangulo extends CalcularArea
{
    private double base;
    private double altura;

    @Override
    public double calcularArea() {
        double area = this.base*this.altura/2;
        return area;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
}
