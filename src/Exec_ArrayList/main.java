package Exec_ArrayList;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Entrega> lista = new ArrayList<>();

        lista.add(new EntregaExpresso("RJ", 300));
        lista.add(new EntregaInternacional("NYC", 8000));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getDestino());
        }

        for (Entrega e : lista) {
            System.out.println(e.getDestino());
        }

        System.out.println(lista);

    }

}
