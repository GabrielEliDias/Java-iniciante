
public class Autor {
    public String nome;
    public String email;
    public String cpf;

    public Autor(String nome, String email, String cpf){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }


    public void mostrar_info_autor()
    {
        System.out.println("--------------------");
        System.out.println("nome: " + this.nome);
        System.out.println("email: " + this.email);
        System.out.println("cpf: " + this.cpf);
        System.out.println("--------------------");

    }
}
