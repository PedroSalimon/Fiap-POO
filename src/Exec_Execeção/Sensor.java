package Exec_Execeção;

import java.util.List;

public class Sensor {
    private String id;
    private List<Double> leituras;

    public Sensor(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Double> getLeituras() {
        return leituras;
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
