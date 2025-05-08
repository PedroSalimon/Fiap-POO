package Exec_Produto;

public class ItemProduto {

    private int qtd;
    private Produto produto;

    public ItemProduto(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
