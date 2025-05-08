package Exec_Produto;

public class Produto {

    private int id;
    private double valor;
    private String nome;

    public Produto(int id, double valor, String nome) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
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
}
