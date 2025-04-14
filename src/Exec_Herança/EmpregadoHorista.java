package Exec_Herança;

public class EmpregadoHorista extends Empregado{
    int totalHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, int totalHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    @Override
    public String toString() {
        return super.toString() + " -- " + this.totalHorasTrabalhadas + " -- " + this.valorDaHoraTrabalhada;
    }

    public double calcularSalario() {
        return totalHorasTrabalhadas*valorDaHoraTrabalhada;
    }
}
