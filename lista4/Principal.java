import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Lampada de Led");
        System.out.println("2 - Lampada Fluorescente");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Você escolheu a lampada de Led");
            LampadaLed lampadaL = new LampadaLed();
            int decisao = 0;
            while (decisao != 4) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Ligar");
                System.out.println("2 - Desligar");
                System.out.println("3 - Verificar status");
                System.out.println("4 - Sair");
                decisao = scanner.nextInt();

                if (decisao == 1)
                    lampadaL.setOnOff(true);
                else if (decisao == 2)
                    lampadaL.setOnOff(false);
                else if (decisao == 3)
                    System.out.println(lampadaL.toString());
                else if (decisao == 4)
                    System.out.println("Saindo...");
                else
                    System.out.println("Opção inválida");
            }
        } else if (opcao == 2) {
            System.out.println("Você escolheu a lampada Fluorescente");
            System.out.println("Escolha o tamanho da lampada em cm: ");

            int tamanho = scanner.nextInt();

            LampadaFluorescente lampadaF = new LampadaFluorescente(false, tamanho);
            int decisao = 0;
            while (decisao != 4) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Ligar");
                System.out.println("2 - Desligar");
                System.out.println("3 - Verificar status");
                System.out.println("4 - Sair");
                decisao = scanner.nextInt();

                if (decisao == 1)
                    lampadaF.setOnOff(true);
                else if (decisao == 2)
                    lampadaF.setOnOff(false);
                else if (decisao == 3)
                    System.out.println(lampadaF.toString());
                else if (decisao == 4)
                    System.out.println("Saindo...");
                else
                    System.out.println("Opção inválida");
            }
        } else
            System.out.println("Opção inválida");

        scanner.close();
    }
}