public abstract class CartaoWeb {
    protected String destinatario;

    // get
    public String getDestinatario() {
        return this.destinatario;
    }

    // set
    public void setDestinatario(String destinatario) {
        if (destinatario.length() > 0)
            this.destinatario = destinatario;
        else
            this.destinatario = "anonimo";
    }

    public abstract void mensagem(String remetente);
}