public class livro {
    public String nome;
    public String descrição;
    public double valor;
    public String isbn;
    Autor autor;

    public void mostrar_detalhes(){
        System.out.println("#########################");
        System.out.println("nome: " + this.nome);
        System.out.println("descrição: " + this.descrição);
        System.out.println("valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("#########################");

    }
}

