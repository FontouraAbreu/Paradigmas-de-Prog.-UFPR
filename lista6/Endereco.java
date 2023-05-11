public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    // constructor
    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        setRua(rua);
        setNumero(numero);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
    }

    // get
    public String getRua() {
        return this.rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public int getNumero() {
        return this.numero;
    }

    // set
    public void setRua(String rua) {
        if (!rua.isEmpty())
            this.rua = rua;
        else
            this.rua = "vazio";

        return;
    }

    public void setCidade(String cidade) {
        if (!cidade.isEmpty())
            this.cidade = cidade;
        else
            this.cidade = "vazio";

        return;
    }

    public void setBairro(String bairro) {
        if (!bairro.isEmpty())
            this.bairro = bairro;
        else
            this.bairro = "vazio";

        return;
    }

    public void setEstado(String estado) {
        if (!estado.isEmpty())
            this.estado = estado;
        else
            this.estado = "vazio";

        return;
    }

    public void setNumero(int numero) {
        if (numero >= 0)
            this.numero = numero;
        else
            this.numero = 1;

        return;
    }

    // methods

}
