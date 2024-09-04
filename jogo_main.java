public class App {
    public static void main(String[] args) throws Exception {
        jogo celeste = new jogo("celeste","plataforma");
        // celeste.nome = "celeste";
        // celeste.genero = "plataforma";
        celeste.mostrar_info();
        //parametrado:
        jogo destiny = new jogo("destiny", "FPS");
        destiny.mostrar_info();
        // destiny.nome = "destiny";
        // destiny.genero = "FPS";

    }
}
