package RIFD;
import java.sql.SQLOutput;
import java.util.*;

public class RFIDShippingContainer extends ManualShippingContainer
{
    private ArrayList <Produto> produtos = new ArrayList<>();

    public void AdicionarContainer(Produto produto)
    {
        produtos.add(produto);
    }

    public void RemoverContainer(Produto produto)
    {
        produtos.remove(produto);
    }

    @Override
    public String getManifest()
    {
        int contador = 0;
        for(Produto produto : produtos)
        {
            System.out.println("------------------------------");
            contador++;
            System.out.println(contador + "° produto:");
            System.out.println("Item: " + produto.getNome());
            System.out.println("Quantidade: " +produto.getQuantidade());
            System.out.println("------------------------------");
        }
        return "";
    }


}
