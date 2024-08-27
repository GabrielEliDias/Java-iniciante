import java.util.Scanner;


// Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das
// componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
// 10 elementos cada. Imprimir todos os conjuntos.

public class Vetores_Quadrados_soma {
    public static void Vetor_print(int k, Double[] v1){
        for(int i = 0; i<k; i++)
        {   System.out.printf("V[%d]: ", i+1);
            System.out.println(v1[i]);
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Diga o tamanho do vetor desejado:");
        n = input.nextInt();

        Double[] vetor_inicial = new Double[n];
        Double[] vetor_quadrado = new Double[n];

      

        for(int i = 0; i<n;i++)
        {
            System.out.printf("Diga o valor do quadrado na posição %d desejado:", i+1);
            vetor_inicial[i] = input.nextDouble();
        }

        Vetor_print(n, vetor_inicial);

        for(int i = 0;i<n;i++)
        {
            vetor_quadrado[i] = Math.pow(vetor_inicial[i], 2);
        }

        System.out.println();
        System.out.println("Quadrados:");

        Vetor_print(n, vetor_quadrado);

     input.close();
     input.close();   

    }
}
