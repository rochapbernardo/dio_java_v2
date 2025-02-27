import java.util.Scanner;

public class VerificandoServicoContratado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o serviço a ser verificado: ");
        String servico = scanner.nextLine().trim();
        
        System.out.println("Informe seu nome e os serviços contratados: ");
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        for(int i=1; i< partes.length; i++){
            if(servico.equalsIgnoreCase(partes[i])){
                contratado=true;
                System.out.println("Sim");
                i=partes.length;
            }
        }

        if(!contratado){
            System.out.println("Não");
        }
        
        scanner.close();
    }
}
