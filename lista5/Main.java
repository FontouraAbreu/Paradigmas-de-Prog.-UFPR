public class Main {
    public static void main(String[] args) {
        CartaoWeb cartoes[] = new CartaoWeb[3];
        cartoes[0] = new CartaoAniversario("pedro");
        cartoes[1] = new CartaoNatal("lucas");
        cartoes[2] = new CartaoNamorados("joao");

        for (int i = 0; i < 3; i++) {
            cartoes[i].mensagem("eu mesmo!");
        }
        return;
    }
}
