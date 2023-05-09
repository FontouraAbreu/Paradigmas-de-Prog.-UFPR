public class Main {
    public static void main(String args[]) {
        IngressoVip ingresso = new IngressoVip(10, 5.50);

        ingresso.imprime();

        IngressoCamarote iCamarote = new IngressoCamarote(10, 4, 8.32);

        iCamarote.imprime();

    }
}
