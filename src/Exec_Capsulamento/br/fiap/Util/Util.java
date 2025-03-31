package Exec_Capsulamento.br.fiap.Util;
import Exec_Capsulamento.br.fiap.fornecedor.Fornecedor;
import Exec_Capsulamento.br.fiap.produto.Produto;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;

public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[3];
    private Produto [] produto = new Produto[2*fornecedor.length];
    private int indexProduto = 0, indexFornecedor = 0;

    public void menuCadastro () {
        int opcao = 0;
        String menu = "1. Cadastrar menu";
        menu += "\n2. Pesquisar produto";
        menu += "\n3. Pesquisar Fornecedor";
        menu += "\n4. Finalizar";

        while (true) {
            opcao = parseInt(showInputDialog(menu));
            if (opcao == 4) {
                return;
            }
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
                default:
                    showMessageDialog(null, "Opção Inválida");
            }

        }
    }

    private void cadastrarProduto () {
        String nome;
        int qtdEstoque;
        double valorUnitário;
        Fornecedor fornecedor = pesquisarFornecedor();
        if (fornecedor == null) {
            cadastrarFornecedor();
        }

    }

    private void pesquisarProduto () {
    }

    private Fornecedor pesquisarFornecedor() {
        long cnpj = parseLong(showInputDialog("CNPJ do Fornecedor"));
        for (int i = 0; i < indexFornecedor; i++) {
            if (fornecedor[i].getCnpj() == cnpj) {
                return fornecedor[i];
            }
        }
        showMessageDialog(null, cnpj + "não está cadastrado");
        return null;
    }

    private void cadastrarFornecedor () {
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor:"));
        String nome = showInputDialog("Fornecedor");
        fornecedor[indexFornecedor] = new Fornecedor(nome, cnpj);
        indexFornecedor++;
    }
}
