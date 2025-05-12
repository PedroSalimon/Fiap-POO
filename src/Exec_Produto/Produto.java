package Exec_Produto;

import java.text.DecimalFormat;

public class Produto {

    private int id, qtdEstoque;
    private double valor;
    private String nome;

    public Produto(int id, String nome, double valor, int qtdEstoque) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void addEstoque (int qtd) {
        this.qtdEstoque += qtd;
    }

    public void debitarEstoque (int qtd) {
        this.qtdEstoque -= qtd;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "Nome: " + nome + "\n";
        aux += "Valor: R$ " + df.format(valor) + "\n";
        aux += "Quantidade: " + qtdEstoque + "\n";
        return aux;
    }
}
