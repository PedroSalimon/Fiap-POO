package Exec_ArrayList;

public class EntregaInternacional extends Entrega{

    public EntregaInternacional(String destino, double distancia) {
        super(destino, distancia);
    }

    public double CalculaTempoEntrega (){
        return super.CalcularTempoEntrega() + 5;
    }

}
