public class IngressoCamarote extends IngressoVip {
    private double valorCamarote;

    // constructor
    IngressoCamarote(double valor, double valorAdicional, double valorCamarote) {
        super(valor, valorAdicional);
        setValorCamarote(valorCamarote);
    }

    // get
    public double getValorCamarote() {
        return this.valorCamarote;
    }

    // set
    public void setValorCamarote(double valorCamarote) {
        if (valorCamarote >= 0.0)
            this.valorCamarote = valorCamarote;
        else
            this.valorCamarote = 0.0;
        return;
    }

    // methods
    public void imprime() {
        System.out.printf(
                "O ingresso do camarote custa:\n Ingresso: R$%.2f\n VIP: R$%.2f\n Camarote: R$%.2f\n Totalizando: %.2f\n",
                getValorIngresso(), getAdicional(), getValorCamarote(),
                getAdicional() + getValorCamarote() + getValorIngresso());
    }

}
