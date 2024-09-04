public class livro {
    public String nome;
    public String descrição;
    public double valor;
    public String isbn;
    Autor autor;

    public livro(String nome, String descrição, double valor, String isbn){
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
        this.isbn = isbn;
        this.autor = new Autor("robert martin","robertmartin@professor.cesupa.br", "123.456.789.10" );

    }

    public void mostrar_detalhes(){
        System.out.println("#########################");
        System.out.println("nome: " + this.nome);
        System.out.println("descrição: " + this.descrição);
        System.out.println("valor: " + this.valor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("#########################");

    }
}

