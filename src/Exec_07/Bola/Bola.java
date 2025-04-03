package Exec_07.Bola;

public class Bola {
    String cor;
    double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola (Bola bola1, Bola bola2) {
        Bola aux = this;
        if (bola1.raio > this.raio && bola1.raio > bola2.raio) {
                return bola1;
        } else if (bola2.raio > aux.raio && bola2.raio > bola1.raio) {
            return bola2;
        }
        return aux;
    }

    public String retornaDados () {
        return cor + " " + raio;
    }
}
