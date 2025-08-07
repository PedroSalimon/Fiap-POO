package Exec_Execeção;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoramento {
    private List <Sensor> sensoresValidos;
    private List <ErroSensor> sensoresComErro;

    public SistemaMonitoramento () {
        this.sensoresComErro = new ArrayList<>();
        this.sensoresValidos = new ArrayList<>();
    }

    public void processarSensores (List <Sensor> listaSensor, List<List<Double>> listaLeitura) {
        for (int i = 0; i < listaSensor.size(); i++) {
            Sensor sensor = listaSensor.get(i);
            List<Double> leitura = listaLeitura.get(i);
            try {
                sensor.registrarLeituras(leitura);
                sensoresValidos.add(sensor);
            } catch (LeituraInvalidaException | IllegalArgumentException e) {
                sensoresComErro.add(new ErroSensor(sensor.getId(),e.getMessage()));
            }
        }
    }

    public void exibirRelatorio () {
        System.out.println("===== Sensores Validos =====");
        for (Sensor sensor : sensoresValidos) {
            System.out.println("Sensor: " + sensor.getId());
        }

        System.out.println("\n===== Sensores com Erro =====");
        for (ErroSensor sensor: sensoresComErro) {
            System.out.println("Sensor: " + sensor.getIdSensor() + " --> " + sensor.getMensagemErro());
        }
    }

}
