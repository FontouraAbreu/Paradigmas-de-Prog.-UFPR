public class CartaoNatal extends CartaoWeb {
    // constructor
    public CartaoNatal(String destinatario) {
        setDestinatario(destinatario);
    }

    // methods
    public void mensagem(String remetente) {
        System.out.printf("\nfeliz natal meu querido(a): %s\nDe: %s\n", getDestinatario(), remetente);
    }
}
