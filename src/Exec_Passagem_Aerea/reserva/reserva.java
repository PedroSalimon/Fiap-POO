package Exec_Passagem_Aerea.reserva;

import Exec_Passagem_Aerea.assento.Assento;
import Exec_Passagem_Aerea.desconto.Desconto;
import Exec_Passagem_Aerea.cliente.Cliente;

import java.util.Date;
import java.util.Random;

public class reserva {

    private Cliente cliente;
    private double valorFinal, valorOriginal;
    private Assento assento;

    public reserva(Cliente cliente, Assento assento, double valorOriginal) {
        this.cliente = cliente;
        this.assento = assento;
        this.valorOriginal = valorOriginal;
        calcularValorFinal();
    }
     public void calcularValorFinal () {
         Random random = new Random();
         double desconto;
         if (cliente instanceof Desconto) {
             desconto = ((Desconto) cliente).aplicarDesconto(valorOriginal);
         } else {
             valorFinal = valorOriginal;
         }
     }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
