package Exec_05;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Util {

    private Bilhete [] bilhete = new Bilhete[5];
    private int index = 0;

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
}
