public class orientação_ao_objeto_introdução {
// A classe é uma ideia, uma abstração. como o mundo das ideias de platão, onde a classe vai ser isso.
// O objeto vai ser uma criação derivada da classe, por isso mundo das ideias.

//Exeplo: livraria, sistema para administração de uma livraria!
    public static void main(String[] args)
    {   
        Autor autor1 = new Autor();
        autor1.nome = "robert Martin";
        autor1.email = "robertmartin@professor.cesupa.br";
        autor1.cpf = "123.456.789.10";
        livro livro = new livro();
        livro.nome = "Código limpo";
        livro.descrição = "como criar e organizar seu código";
        livro.valor = 70.00;
        livro.isbn = "857-108-267-5";
        livro.autor = autor1;
        livro.mostrar_detalhes();

        livro livro2 = new livro();
        livro2.nome = "revolução dos bichos";
        livro2.descrição = "critica ao socialismo";
        livro2.valor = 50.00;
        livro2.isbn = "123-456-789-9";
        livro2.mostrar_detalhes();
        
        
    }
}
