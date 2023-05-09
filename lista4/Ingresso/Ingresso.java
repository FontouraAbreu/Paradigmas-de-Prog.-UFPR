
public class Ingresso {
    protected double valorIngresso;

    // constuctors
    public Ingresso(double valor) {
        setValorIngresso(valor);
    }

    // get
    public double getValorIngresso() {
        return this.valorIngresso;
    }

    // set
    public void setValorIngresso(double valor) {
        if (valor >= 0.0)
            this.valorIngresso = valor;
        else
            this.valorIngresso = 0.0;
        return;
    }

    // methods
    public void imprime() {
        System.out.printf("O ingresso custa: %.2f\n", getValorIngresso());
        return;
    }
}