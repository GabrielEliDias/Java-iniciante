package RIFD;

public class ManualShippingContainer extends ShippingContainer
{
    private String descricaoProduto;

    public void setManifesto(String descricao)
    {
        this.descricaoProduto = descricao;
    }

    @Override
    public String getManifest() {
        return descricaoProduto;
    }
}
