public class CartaoNamorados extends CartaoWeb {
    // constructor
    CartaoNamorados(String destinatario) {
        setDestinatario(destinatario);
    }

    public void mensagem(String remetente) {
        System.out.printf("\nFeliz dia dos namorados, %s!!\nDe %s\n", getDestinatario(), remetente);
    }
}
