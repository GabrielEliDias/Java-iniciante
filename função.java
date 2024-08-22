import java.util.Scanner;
import java.lang.Math;

public class função {
    public static double Circuferencia(double raio){
        double area = Math.pow(raio, 2)*3.14;
        System.out.println(area);
        return area;
    }
    public static void main(String[] args)  {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Diga o raio:");
        double raios = 0;
        raios = input.nextDouble();
        Circuferencia(raios);
        

        input.close();
    }
}
