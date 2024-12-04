package Animais;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Animal vaca =  new Vaca();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        ArrayList <Animal> animais = new ArrayList<>();

        animais.add(vaca);
        animais.add(gato);
        animais.add(cachorro);

        for (Animal animal : animais)
        {
            animal.FazerSom();
        }
    }
}

