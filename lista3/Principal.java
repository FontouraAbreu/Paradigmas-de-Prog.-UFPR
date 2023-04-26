import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a hora e os minutos do primeiro horário: ");
        t1.setHour(input.nextInt());
        t1.setMinute(input.nextInt());

        System.out.println("Digite a hora e os minutos do segundo horário: ");
        t2.setHour(input.nextInt());
        t2.setMinute(input.nextInt());

        input.close();

        System.out.printf("Horário 1= %s\n", t1.toString());
        System.out.printf("Horário 2= %s\n", t2.toString());

        if (t1.anterior(t2.getHour(), t2.getMinute())) {
            System.out.println("O primeiro horário é anterior ao segundo.");
        } else if (t1.posterior(t2.getHour(), t2.getMinute())) {
            System.out.println("O primeiro horário não é anterior ao segundo.");
        } else if (t1.equals(t2.getHour(), t2.getMinute())) {
            System.out.println("Os horários são iguais.");
        }

        return;
    }
}