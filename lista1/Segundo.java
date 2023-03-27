import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        int number = 0, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        number = input.nextInt();

        while (number != -1) {
            sum += number;
            System.out.println("Digite um número: ");
            number = input.nextInt();
        }
        input.close();
        System.out.printf("sum = %d\n", sum);
    }
}
