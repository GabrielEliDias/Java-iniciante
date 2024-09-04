public class orientação_ao_objeto_introdução {
// A classe é uma ideia, uma abstração. como o mundo das ideias de platão, onde a classe vai ser isso.
// O objeto vai ser uma criação derivada da classe, por isso mundo das ideias.

//Exeplo: livraria, sistema para administração de uma livraria!
    public static void main(String[] args)
    {   
        //contrutor paremtrizado: 
        Autor autor1 = new Autor("robert martin","robertmartin@professor.cesupa.br", "123.456.789.10" );
        autor1.mostrar_info_autor();
        livro livro = new livro("Código limpo","como criar e organizar seu código", 70.00, "857-108-267-5");
        livro.autor = autor1;
        livro.mostrar_detalhes();
        livro livro2 = new livro("revolução dos bichos","critica ao socialismo",50.00,"123-456-789-9");
        livro2.mostrar_detalhes();

        
        
        
    }
}
