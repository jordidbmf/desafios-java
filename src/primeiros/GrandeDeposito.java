package primeiros;

import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        scanner.close();

        if (valor > 0){
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", valor));
        } else if (valor < 0){
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            System.out.println("Encerrando o programa...");
        }
    }
}
