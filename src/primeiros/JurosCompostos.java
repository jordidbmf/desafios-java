package primeiros;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        DecimalFormat formato = new DecimalFormat("0.00");

        double valorInicial = scanner.nextDouble();

        double taxaJuros = scanner.nextDouble();

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        //valorInicial = 5000
        //valorFinal = 5000 + (5000 * 0.08)
        //valorFinal = valorInicial * 1.08
        //valorFinal2 = valorFinal * 1.08
        //valorFinal2 = valorInicial * 1.08 * 1.08
        //valorFinal2 = valorInicial * 1.08 ^ 2 

        valorFinal = valorInicial * Math.pow((1 + taxaJuros), periodo);

        System.out.println("Valor final do investimento: R$ " + formato.format(valorFinal));
        
        scanner.close();
    }
}
