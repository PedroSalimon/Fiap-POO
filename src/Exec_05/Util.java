package Exec_05;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Double.*;

public class Util {

    private Bilhete [] bilhete = new Bilhete[5];
    private int index = 0;
    DecimalFormat df = new DecimalFormat("0.00");

    public void menuPrincipal () {
        int opcao = 0;
        String menu = "1. Administrador \n2. Usuário \n3. Finalizar";

        do {
            opcao = parseInt(showInputDialog(menu));
            if (opcao < 1 || opcao > 3){
                showMessageDialog(null, "Opção Inválida");
            } else {
                switch (opcao) {
                    case 1:
                        menuAdm();
                        break;
                    case 2:
                        menuUsuario();
                        break;
                }
            }
        } while (opcao != 3);
    }

    private void menuAdm () {
        int opcao = 0;
        String menuAdm = "1. Emitir bilhete \n2. Listar os bilhetes \n3. Remover bilhete \n4. Voltar";
        do {
            opcao = parseInt(showInputDialog(menuAdm));
            if (opcao < 1 || opcao > 4) {
                showMessageDialog(null, "Opção Inválida");
            } else {
                switch (opcao) {
                    case 1:
                        emitirBilhete();
                        break;
                    case 2:
                        listarBilhete();
                        break;
                    case 3:
                        removerBilhete();
                        break;
                }
            }
        } while (opcao != 4);
    }
    private void emitirBilhete() {
        if (index < bilhete.length) {
            String nome = showInputDialog("Nome: ");
            long cpf = parseLong(showInputDialog("CPF: "));
            String tarifa = showInputDialog("Estudante, Professor ou Comum: ");
            bilhete[index] = new Bilhete(new Usuario(nome, cpf, tarifa));
            index++;
        }
    }

    private void listarBilhete() {
        String aux = "";
        for (int i = 0; i < index; i ++) {
            aux += "N°: " + bilhete[i].Id + "\n";
            aux += "Saldo: " + df.format(bilhete[i].consultarSaldo()) + "\n";
            aux += "Nome do usuário: " + bilhete[i].usuario.nome + "\n";
            aux += "Perfil: " + bilhete[i].usuario.tipoTarifa + "\n";
            aux += "--------------------------------\n";
        }
        showMessageDialog(null, aux);
    }

    private void removerBilhete () {
        int i = pesquisarCpf(), resposta;
        if (i != -1) {
            resposta = showConfirmDialog(null, "Tem certeza que deseja remover");
            if (resposta == YES_OPTION) {

            }
            bilhete[i] = bilhete[index-1];
            index--;
        }
    }

    private void menuUsuario () {
        int opcao = 0;
        String menuUsuario = "1. Consultar Saldo \n";
        menuUsuario += "2. Carregar bilhete \n";
        menuUsuario += "3. Passar na catraca \n";
        menuUsuario += "4. Voltar";
        int i = pesquisarCpf();
        if (i != -1){
            do {
                opcao = parseInt(showInputDialog(menuUsuario));
                if (opcao < 1 || opcao > 4) {
                    showMessageDialog(null, "Opção Inválida");
                } else {
                    switch (opcao) {
                        case 1:
                            consultarSaldo(i);
                            break;
                        case 2:
                            carregarBilhete(i);
                            break;
                        case 3:
                            passarCatraca(i);
                            break;
                    }
                }
            } while (opcao != 4);
        }
    }

    private int pesquisarCpf () {
        long cpf =  parseLong(showInputDialog("Informe o CPF do usuário : "));
        for (int i = 0; i < index; i ++) {
            if (bilhete[i].usuario.cpf == cpf) {
                return i;
            }
        }
        showMessageDialog(null, cpf + " não encontrado");
        return -1;
    }

    private void consultarSaldo(int i) {
        showMessageDialog(null, "Saldo: " + df.format(bilhete[i].consultarSaldo()));
    }

    private void carregarBilhete(int i) {
        double carga = parseDouble(showInputDialog("Carga: "));
        bilhete[i].carregarBilhete(carga);
    }

    private void passarCatraca(int i) {
        bilhete[i].passarCatraca();
    }
}
