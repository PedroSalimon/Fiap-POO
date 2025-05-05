package Exec_Círculo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Forma> lista  = new ArrayList<>();

        lista.add(new Círculo(2, 2 , 5));
        lista.add(new Cilindro(1,1,2,2));
        lista.add(new Círculo(2, 2 , 5));
        lista.add(new Cilindro(1,1,2,2));

        for (Forma f: lista) {
            if (f instanceof Círculo) {
                System.out.println("Circulo");
            } else {
                System.out.println("Cilindro");
            }
            System.out.println(f.getClass());
            System.out.println(f);
            System.out.println("Area = " +f.calcularArea());
            if (f instanceof Volume) {
                System.out.println("Volume = " + ((Volume) f).calcularVolume());
            }
            System.out.println("-------------------");
        }

    }

}
