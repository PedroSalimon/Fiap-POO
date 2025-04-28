package Exec_ArrayList;

public class SistemaLogistica {

    public String processarEntrega (Entrega entrega) {

        return "Destino: " + entrega.getDestino() + " - Distancia: " + entrega.getDistancia()
                + " km - Tempo de entrega: " + entrega.CalcularTempoEntrega();

    }

}
