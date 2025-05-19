package Exec_Passagem_Aerea.controle;

import Exec_Passagem_Aerea.assento.Assento;
import Exec_Passagem_Aerea.cliente.PessoaFisica;
import Exec_Passagem_Aerea.cliente.PessoaJuridica;
import Exec_Passagem_Aerea.reserva.reserva;
import Exec_Passagem_Aerea.cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Controle {

    private static List <Cliente> listaCliente = new ArrayList<>();
    private static List <Assento> listaAssento = new ArrayList<>();
    private static List <reserva> listaReserva = new ArrayList<>();

    static {
        // lista de clientes
        listaCliente.add(new PessoaFisica("A", "CA", "123"));
        listaCliente.add(new PessoaJuridica("B", "CB", "123"));
        listaCliente.add(new PessoaFisica("C", "CA", "456"));
        listaCliente.add(new PessoaJuridica("D", "CD", "456"));

        // lista de assentos
        for (int i = 1; i <= 10; i++) {
            listaAssento.add(new Assento(i));
        }
    }

    public void menu() {
        int opcao;

        while(true) {
            try {
                opcao = parseInt(showInputDialog(gerarMenu()));
                switch(opcao) {
                    case 1:
                        reservar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        cancelar();
                        break;
                    case 4:
                        return;
                    default:
                        showMessageDialog(null, "Opção inválida");
                }
            }
            catch(NumberFormatException e) {
                showMessageDialog(null, "você deve digitar um número");
            }
        }
    }

    private void cancelar() { }

    private void pesquisar() {

        String identificador = showInputDialog("CPF/CNPJ para pesquisa: ");
        for (reserva reserva: listaReserva) {
            if (reserva.getCliente().getIdentificador().equals(identificador)) {
                showInputDialog(null, reserva);
            }
        }

    }

    private void reservar() { }

    private String gerarMenu() {
        String aux = "SISTEMA DE RESERVA DE PASSAGEM AÉREA\n";
        aux += "1. Reservar\n";
        aux += "2. Pesquisar reserva\n";
        aux += "3. Cancelar reserva\n";
        aux += "4. Finalizar";
        return aux;
    }
}
