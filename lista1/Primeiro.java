
//scanner
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number = input.nextInt(); // nextint() lê um número inteiro, é um método da classe Scanner
        input.close();

        if (number >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}