package Exec_Círculo;

public class Círculo extends Forma {

    public Círculo(int coordenadaX, int coordenadaY, double raio) {
        super(coordenadaX, coordenadaY, raio);
    }

    public double calcularArea () {
        return Math.PI*Math.pow(getRaio(),2);
    }

}
