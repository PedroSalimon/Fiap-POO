package Exec_Execeção;

public class LeituraInvalidaException extends Exception {
    public LeituraInvalidaException (int index, double temperatura) {
        super("Leitura inválida na posicao: " + index + ": " + temperatura);
    }
}
