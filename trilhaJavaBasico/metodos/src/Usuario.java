public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();

        smartTV.alterarCanal(10);

        System.out.println("Novos status>>>");
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

    }       
}
