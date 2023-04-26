public class Contador {
    private int valorInicial;
    private int valorFinal;

    // CONSTRUCTORS
    public Contador() {
        setValorInicial(0);
    }

    public Contador(int valorFinal) {
        setValorFinal(valorFinal);
    }

    // SETTERS
    public void setValorInicial(int valorInicial) {
        if (valorInicial < 0)
            this.valorInicial = 0;
        this.valorInicial = valorInicial;
    }

    public void setValorFinal(int valorFinal) {
        if (valorFinal == getValorInicial())
            return;
        this.valorFinal = valorFinal;
    }

    // GETTERS
    public int getValorInicial() {
        return this.valorInicial;
    }

    public int getValorFinal() {
        return this.valorFinal;
    }

    // METHODS
    public void zerar() {
        setValorInicial(0);
    }

    public void incrementar() {
        setValorInicial(getValorInicial() + 1);
    }

    public void decrementar() {
        setValorInicial(getValorInicial() - 1);
    }

}
