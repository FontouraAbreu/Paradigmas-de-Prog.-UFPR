import java.util.Scanner;

public class Terceiro {
    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();

        System.out.println("Digite seu bairro: ");
        String neighbourhood = input.nextLine();

        System.out.println("Digite seu time: ");
        String team = input.nextLine();

        input.close();

        System.out.println("\n");

        System.out.printf("nome:\t%s\n", name);
        System.out.printf("bairro:\t%s\n", neighbourhood);
        System.out.printf("time:\t%s\n", team);

    }
}