package Exec_Herança;

public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String toString () {
        return this.matricula + " -- " + this.nome;
    }

    public abstract double calcularSalario();

}
