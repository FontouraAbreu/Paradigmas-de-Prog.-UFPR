public class CartaoAniversario extends CartaoWeb {
    // constructor
    public CartaoAniversario(String destinatario) {
        setDestinatario(destinatario);
    }

    public void mensagem(String remetente) {
        System.out.printf("\nFeliz aniversário %s!!\nDe: %s\n", getDestinatario(), remetente);
    }
}
