public class ImovelMultiplicador extends Imovel {
    protected double multiplicador;

    // constructor
    public ImovelMultiplicador(Endereco endereco, double preco, double multiplicador) {
        super(endereco, preco);
        setMultiplicador(multiplicador);
    }

    // get
    public double getMultiplicador() {
        return this.multiplicador;
    }

    // set
    public void setMultiplicador(double multiplicador) {
        if (multiplicador > 0.0)
            this.multiplicador = multiplicador;
        else
            this.multiplicador = 1.0;

        return;
    }

    // methods
    public double calculaValor() {
        return getMultiplicador() * getPreco();
    }

    @Override
    public String toString() {
        return "O Imovel no endereço:\n Rua: " + getEndereco().getRua() + " \n Numero: " + getEndereco().getNumero()
                + "\n Bairro: " + getEndereco().getBairro() + "\n Cidade: " + getEndereco().getCidade() + "\n Estado: "
                + getEndereco().getEstado() + "\nCusta: R$" + calculaValor() + "\n";
    }

}
