package Exec_Produto;

import java.util.ArrayList;
import java.util.List;

public class  NotaFiscal {
    private List<ItemProduto> listaProduto;
    private Cliente cliente;
    private boolean status;

    public NotaFiscal(Cliente cliente) {
        this.cliente = cliente;
        this.listaProduto = new ArrayList<ItemProduto>();
        this.status = true;
    }

    public void adicionarItemProduto(ItemProduto itemProduto) {
        this.listaProduto.add(itemProduto);
    }

    public void removerItemProduto(Produto produto) {
        for (ItemProduto p : listaProduto) {
            if (p.getProduto().equals(produto)) {
                listaProduto.remove(p);
            }
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemProduto itemProduto : this.listaProduto) {
            total += itemProduto.calcularTotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemProduto> getListaProduto() {
        return listaProduto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
