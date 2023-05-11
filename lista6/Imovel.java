public abstract class Imovel {
    protected Endereco end;
    protected double preco;

    public Imovel(Endereco endereco, double preco) {
        setEndereco(endereco);
        setPreco(preco);
    }

    // get
    public Endereco getEndereco() {
        return this.end;
    }

    public double getPreco() {
        return this.preco;
    }

    // set
    public void setEndereco(Endereco endereco) {
        this.end = endereco;
        return;
    }

    public void setPreco(double preco) {
        if (preco >= 0.0)
            this.preco = preco;
        else
            this.preco = 0.0;

        return;
    }

    // methods
    public abstract double calculaValor();
}
