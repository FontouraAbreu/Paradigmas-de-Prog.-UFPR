import java.util.Vector;

public class Principal {
    public static void main(String[] args) {
        // Declaração de um vetor de objetos
        Vector<Pessoa> pessoas = new Vector<Pessoa>();

        Pessoa grace = new Pessoa();
        grace.nascer("Grace Hopper", 9, 12, 1906);
        Pessoa ada = new Pessoa();
        ada.nascer("Ada Lovelace", 10, 12, 1815);
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