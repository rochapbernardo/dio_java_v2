import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Informe a agência: ");
        String agencia = scan.next();

        System.out.println("Informe seu nome completo: ");
        String nomeCliente = scan.next();

        System.out.println("Informe o saldo inicial: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Abaixo seguem os dados: ");
        System.out.println("Agência: " + agencia);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
        
        scan.close();
    }
}
