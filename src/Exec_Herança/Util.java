package Exec_Herança;

public class Util {
    private Empregado[] empregado = new Empregado[3];
    private int idx;

    public void inserir (Empregado empregado) {
        this.empregado[idx++] = empregado;
    }

    public Empregado pesquisar (long matricula) {
        for (int i = 0; i < idx; i++) {
            if (matricula == this.empregado[i].matricula) {
                return empregado[i];
            }
        }
        return null;
    }

    public String listar () {
        String aux = "";
        for (int i = 0; i < idx; i++) {
            aux += empregado[i];
            aux += "\n salario: R$ " + empregado[i].calcularSalario() + "\n";
        }
        return aux;
    }

}
