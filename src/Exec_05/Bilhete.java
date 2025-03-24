package Exec_05;

import java.util.Random;

public class Bilhete {
    static final double TARIFABASE = 5.20;
    int Id;
    double saldo;
    Usuario usuario;

    public Bilhete(Usuario usuario){

        Id = gerarNumero();
        this.usuario = usuario;

    }

    private int gerarNumero() {
        Random random = new Random();
        return random.nextInt(1000,10000);
    }

    // metodo para carregar o blihete
    public void carregarBilhete (double recarga) {
        this.saldo += recarga;
    }

    // metodo para consultar o saldo
    public double consultarSaldo () {
        return this.saldo;
    }

    // metodo para passar na catraca
    public void passarCatraca() {
        double debito;
        if (usuario.tipoTarifa.equalsIgnoreCase("comum")){
            debito = TARIFABASE;
        }
        else {
            debito = TARIFABASE/2;
        }

        if (saldo >= debito) {
            saldo-=debito;
        }
    }

}
