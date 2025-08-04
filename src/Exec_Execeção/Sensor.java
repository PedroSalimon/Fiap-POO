package Exec_Execeção;

import java.util.List;

public class Sensor {
    private String id;
    private List<Double> leituras;

    public Sensor(String id, List<Double> leituras) {
        this.id = id;
        this.leituras = leituras;
    }

    public void registrarLeituras(List<Double> leituras) throws LeituraInvalidaException {
        if (leituras.size() != 100) {
            throw new IllegalArgumentException("O total de leitura deve ser 100");
        }
        for (int i = 0; i < leituras.size(); i++) {
            double temp = leituras.get(i);
            if (temp < -60 || temp > 60) {
                throw new LeituraInvalidaException(i, temp);
            }
        }
    }
}
