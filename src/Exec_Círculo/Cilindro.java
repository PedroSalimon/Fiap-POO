package Exec_Círculo;

public class Cilindro extends Forma implements Volume{

    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return 2*(Math.PI*Math.pow(getRaio(),2))+(2*Math.PI*getRaio()*altura);
    }

    public double calcularVolume () {
        return Math.PI*Math.pow(getRaio(),2)*altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}
