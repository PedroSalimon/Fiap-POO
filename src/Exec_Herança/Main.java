package Exec_Herança;

public class Main {

    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(123,"Pedro", 30, 36000);
        empregado[1] = new EmpregadoHorista(124, "Lucas", 30, 44);
        empregado[2] = new EmpregadoHorista(125, "Caio", 30,44);

        for (Empregado x : empregado) {
            System.out.println(x);
            System.out.println("Salario: " + x.calcularSalario());
            System.out.println("---------------------");
        }

    }

}
