public class IngressoVip extends Ingresso {
    protected double valorAdicional;

    // constructors
    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        setAdicional(valorAdicional);
    }

    // get
    public double getAdicional() {
        return this.valorAdicional;
    }

    // set
    public void setAdicional(double valorAdicional) {
        if (valorAdicional >= 0.0)
            this.valorAdicional = valorAdicional;
        else
            this.valorAdicional = 0.0;
        return;
    }

    // methods
    public void imprime() {
        super.imprime();
        System.out.printf("O valor adicional é de R$%.2f \n totalizando: R$%.2f\n", getAdicional(),
                getAdicional() + getValorIngresso());
        return;
    }
}