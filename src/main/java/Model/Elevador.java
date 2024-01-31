package Model;

public class Elevador {
    // Atributo
    private int andarAtual;

    // Construtor
    public Elevador() {
        this.andarAtual = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void irParaAndar(int destino) {
        andarAtual = destino;
    }

}
