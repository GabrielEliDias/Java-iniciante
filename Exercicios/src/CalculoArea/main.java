package CalculoArea;

import java.awt.*;
import java.util.concurrent.TransferQueue;

public class main {
    public static void main(String[] args)
    {
        Triangulo t = new Triangulo(5,2);
        Retangulo r = new Retangulo(5,2);

        System.out.println(t.calcularArea());
        System.out.println(r.calcularArea());

    }
}
