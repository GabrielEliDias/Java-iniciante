import java.util.Random;

public class Jogo_da_comparação {
    public static int Valor_aleatorio(int[] v1){
        System.out.println();
        Random aleatorio = new Random();
        for (int i = 0; i<5;i++){
            v1[5] = Random.nextint();
        }
        return v1[5];
    }

    public static void main(String[] args){
        Random rand = new Random();
        
        int[] cartas_jogador1 = new int[5];
        int[] cartas_jogador2 = new int[5];

        
        Valor_aleatorio(cartas_jogador1);
        System.out.println(cartas_jogador1);

        Valor_aleatorio(cartas_jogador2);
        System.out.println(cartas_jogador2);
    }
}