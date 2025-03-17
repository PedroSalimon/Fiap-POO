package Exec_05;

public class Teste3 {
    public static void main(String[] args) {
        Bilhete [] x = new Bilhete[3];
        //primeiro bilhete
        Usuario u1 = new Usuario("Pedro", 1234, "Estudante");
        x[0] = new Bilhete(u1);
        //segundo bilhete
        x[1] = new Bilhete(new Usuario("Lucas", 1243, "Estudante"));
        //terceiro bilhete
        x[2] = new Bilhete(new Usuario("Caio", 1342, "Estudante"));
        for (Bilhete i : x) {
            System.out.println(i.usuario.nome);
        }
    }
}
