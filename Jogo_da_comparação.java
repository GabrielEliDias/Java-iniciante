import java.util.Random;
import java.util.Scanner;

public class Jogo_da_comparação {

    public static  int Valor_aleatorio(int[] v1){
        Random aleatorio = new Random();
    
        for (int i = 0; i<5;i++)
        {
            v1[i] = aleatorio.nextInt(9) + 1;
        }

        return 0;
    }

    public static void cartas(int[] v1){
        System.out.print("Seus numeros são: ");
        for(int i = 0; i<5;i++)
        {
            System.out.printf("[%d]", v1[i]);
        }

    }

    public static void Vez_de_jogada(String j){
        System.out.println("Vez de "+j);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String jogador_1;
        String jogador_2;
        int[] cartas_jogador1 = new int[5];
        int[] cartas_jogador2 = new int[5];

        System.out.println("Bem-vindo ao jogo da comparação!");
        System.out.println("Nesse jogo o vencedor é o jogador que receber a maior combinação de numeros entre 1-9.");

        System.out.print("Diga seu nome jogador 1:");
        jogador_1 = input.nextLine();
        System.out.print("Diga seu nome jogador 2:");
        jogador_2 = input.nextLine();

        Valor_aleatorio(cartas_jogador1);
        Valor_aleatorio(cartas_jogador2);

        Vez_de_jogada(jogador_1);
        cartas(cartas_jogador1);
        System.out.println("\n");
        Vez_de_jogada(jogador_2);
        cartas(cartas_jogador2);

        System.out.println();

        int jogador1_maior1 = 0;
        int jogador1_maior2 = 0;
        int jogador2_maior1 = 0;
        int jogador2_maior2 = 0;

        for(int i=0;i<5;i++)
        {
            if (cartas_jogador1[i]> jogador1_maior1)
            {
                jogador1_maior1 = cartas_jogador1[i];
            }
            else if(cartas_jogador1[i]> jogador1_maior2 &&  jogador1_maior2 < jogador1_maior1)
            {
                jogador1_maior2 = cartas_jogador1[i];
            }
        }

        for(int i=0;i<5;i++)
        {
            if (cartas_jogador2[i]> jogador2_maior1)
            {
                jogador2_maior1 = cartas_jogador2[i];
            }
            else if(jogador2_maior1 >= cartas_jogador2[i] && cartas_jogador2[i] > jogador2_maior2 && jogador2_maior2 < jogador2_maior1)
            {
                jogador2_maior2 = cartas_jogador2[i];
            }
        }

        if (jogador1_maior1>jogador2_maior1)
        {
            System.out.println("vencedor é "+jogador_1);
        }
        else if (jogador2_maior1> jogador1_maior1)
        {
            System.out.println("vencedor é "+jogador_2);
        }

        else if (jogador1_maior1 == jogador2_maior1)
        {
            if(jogador1_maior2>jogador2_maior2)
            {
                System.out.println("vencedor é "+jogador_1);
            }

            else if (jogador2_maior2>jogador1_maior2)
            {
                System.out.println("vencedor é "+jogador_2);
            }

            else if (jogador1_maior2 == jogador2_maior2)
            {
                System.out.println("jogo terminou empate");
            }

        }

        input.close();
    }
}
     
