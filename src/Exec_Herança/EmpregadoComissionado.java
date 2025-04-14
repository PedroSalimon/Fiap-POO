package Exec_Herança;

public class EmpregadoComissionado extends Empregado{

    double comissao, totalDeVendas;

    public EmpregadoComissionado(long matricula, String nome, double comissao, double totalDeVendas) {
        super(matricula, nome);
        this.comissao = comissao;
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + " -- " + this.comissao + " -- " + this.totalDeVendas;
    }

    public double calcularSalario() {
        return (totalDeVendas*comissao)/100;
    }

}
