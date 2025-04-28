package Exec_ArrayList;

public class EntregaExpresso extends Entrega{

    public EntregaExpresso(String destino, double distancia) {
        super(destino, distancia);
    }

    public double CalcularTempoEntrega () {
        return super.CalcularTempoEntrega()/2;
    }

}
