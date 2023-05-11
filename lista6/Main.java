public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("pelicano", 1095, "capela-velha", "araucaria", "parana");
        Endereco enderecoVelho = new Endereco("pelicano", 1096, "capela-velha", "araucaria", "parana");

        Imovel novo = new ImovelNovo(endereco, 10000);
        Imovel velho = new ImovelVelho(enderecoVelho, 10000);

        System.out.println(novo.toString());
        System.out.println(velho.toString());

    }
}