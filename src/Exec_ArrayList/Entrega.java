package Exec_ArrayList;

public class Entrega {

    private String destino;
    private double distancia;

    public Entrega(String destino, double distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return destino + " " + distancia;
    }

    public double CalcularTempoEntrega () {
        return distancia/100;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
