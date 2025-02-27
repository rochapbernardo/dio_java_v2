import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        try{
            System.out.println("Informe o primeiro número: ");
            int numero1 = scan.nextInt();
            System.out.println("Informe o segundo número: ");
            int numero2 = scan.nextInt();

            contar(numero1, numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo número não pode ser menor ou igual ao primeiro.");
        }catch(InputMismatchException e){
            System.out.println("O campo número só aceita valores numéricos inteiros.");
        }

        scan.close();
        
    }

    public static void contar(int a, int b) throws ParametrosInvalidosException{
        int validacao = b-a;

        if(validacao<=0){
            throw new ParametrosInvalidosException();
        }else{
            for(int i=1; i <= validacao; i++){
                System.out.println("Imprimindo número: " + i);
            }
        }
    }
}
