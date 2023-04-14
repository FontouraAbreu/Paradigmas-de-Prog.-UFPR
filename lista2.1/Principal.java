import java.util.Vector;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Vector<Estudante> estudantes = new Vector<Estudante>();

        String nome;
        int nota;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.print("Nome do estudante: ");
            nome = sc.next();
            System.out.print("Nota do estudante: ");
            nota = sc.nextInt();
            System.out.println("");

            Estudante e = new Estudante(nome, nota);
            estudantes.add(e);

        }
        sc.close();

        int media = 0;
        Vector<Estudante> aprovados = new Vector<Estudante>();
        Vector<Estudante> exame = new Vector<Estudante>();
        Vector<Estudante> reprovados = new Vector<Estudante>();
        for (Estudante e : estudantes) {
            media += e.getNota();
            if (e.getNota() >= 70)
                aprovados.add(e);
            else if (e.getNota() >= 40)
                exame.add(e);
            else
                reprovados.add(e);
        }
        media /= estudantes.size();

        System.out.println("Média: " + media);
        System.out.println("Exame: " + exame.size());
        System.out.println("Reprovados: " + reprovados.size());
        for (Estudante e : aprovados)
            System.out.println(e.getNome() + " -> " + e.getNota());

    }
}
