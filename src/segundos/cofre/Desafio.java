package segundos.cofre;

import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      int validarSenha = scanner.nextInt();
      CofreDigital cofreDigital = new CofreDigital(senha);
      boolean validacao = cofreDigital.validarSenha(validarSenha);
      cofreDigital.imprimirInformacoes();
      if(validacao == true){
        System.out.println("Cofre aberto!");
      } else {
        System.out.println("Senha incorreta!");
      }
    }
    else if (tipoCofre.equalsIgnoreCase("fisico")) {
      CofreFisico cofreFisico = new CofreFisico();
      cofreFisico.imprimirInformacoes();
    }
    scanner.close();
  }
}
