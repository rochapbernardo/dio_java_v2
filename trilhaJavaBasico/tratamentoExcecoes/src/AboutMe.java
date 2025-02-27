import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Informe seu nome: ");
            String nome = scan.next();

            System.out.println("Informe seu sobrenome: ");
            String sobreNome = scan.next();

            System.out.println("Informe sua idade: ");
            int idade = scan.nextInt();

            System.out.println("Informe sua altura: ");
            double altura = scan.nextDouble();

            System.out.println("DADOS >>>");
            System.out.println("Nome completo: " + nome + " " + sobreNome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        }catch(InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numéricos.");
        }

        scan.close();
    }
}
