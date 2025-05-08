package Exec_Produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> lista = new LinkedList<>();

        lista.add(new Produto(1,50, "arroz"));
        lista.add(new Produto(1,50, "arroz"));
        lista.add(new Produto(1,50, "arroz"));
        lista.add(new Produto(3,50, "batata"));

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getNome().equalsIgnoreCase("arroz")) {
                lista.remove(i);
            }

        }

        lista.remove(new Produto (1, 50, "arroz"));

        for (Produto p : lista) {

            System.out.println(p.getNome());

        }

    }

}
