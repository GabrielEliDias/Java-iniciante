import java.util.Scanner;
public class Nota_parametros_medias {
        public static float media_arimetica(float a, float b, float c){
            float media_a= (a+b+c)/3;
            System.out.println("Sua média aritmetica é "+media_a);
            return media_a;
        }

        public static float media_ponderada(float a, float b, float c){
            float media_b= (5*a+3*b+2*c)/10;
            System.out.println("Sua média ponderada de pesos 5, 3, 2 é "+media_b);
            return media_b;
        }

        public static float media_Harmonica(float a, float b, float c){
            float media_c= 3/((1/a)+(1/b)+(1/c));
            System.out.println("Sua média harmonica é "+media_c);
            return media_c;
        }
        
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        String Escolha;
        System.out.println("Digite o metodo de calculo:");
        System.out.println("A-média aritmetica");
        System.out.println("B-Média ponderada");
        System.out.println("C-Média Harmonica");
        Escolha = input.nextLine();
        char letra = Escolha.charAt(0);
        if (letra == 'A'){
            System.out.println("1° nota:");
            float a1 = 0;
            a1 = input.nextFloat();

            System.out.println("2° nota:");
            float b1 = 0;
            b1 = input.nextFloat();

            System.out.println("3° nota:");
            float c1 = 0;
            c1 = input.nextFloat();

            media_arimetica(a1, b1, c1);

        } 
        
        else if ( letra == 'B'){
            System.out.println("1° nota:");
            float a1 = 0;
            a1 = input.nextFloat();

            System.out.println("2° nota:");
            float b1 = 0;
            b1 = input.nextFloat();

            System.out.println("3° nota:");
            float c1 = 0;
            c1 = input.nextFloat();

            media_ponderada(a1, b1, c1);
        }

        else if(letra =='C'){
            System.out.println("1° nota:");
            float a1 = 0;
            a1 = input.nextFloat();

            System.out.println("2° nota:");
            float b1 = 0;
            b1 = input.nextFloat();

            System.out.println("3° nota:");
            float c1 = 0;
            c1 = input.nextFloat();
            
            media_Harmonica(a1, b1, c1);
        }
    input.close();
    }
    
}
