package Exec_Capsulamento;

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("AA", 123);
        System.out.println(fornecedor.getNome());
        fornecedor.setNome("BB");
        System.out.println(fornecedor.getNome());
    }
}
