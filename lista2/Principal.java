import java.util.Vector;

public class Principal {
    public static void main(String[] args) {
        // Declaração de um vetor de objetos
        Vector<Pessoa> pessoas = new Vector<Pessoa>();

        Pessoa grace = new Pessoa();
        Data data1 = new Data();
        data1.ajustarData(9, 11, 1906);
        grace.nascer("Grace Hopper", data1);

        Pessoa ada = new Pessoa();
        Data data2 = new Data();
        data2.ajustarData(10, 11, 1815);
        ada.nascer("Ada Lovelace", data2);

        // append the object to the vector
        pessoas.add(grace);
        pessoas.add(ada);

        // Iteração sobre o vetor
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println(pessoa.retornarNome() + " tem " + pessoa.retornarIdade() + " anos.");
        }
    }
}