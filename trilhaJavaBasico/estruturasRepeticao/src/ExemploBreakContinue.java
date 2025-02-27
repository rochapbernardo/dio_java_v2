public class ExemploBreakContinue {
    public static void main(String[] args) {
        //break interrompe o laço de repetição
        for(int i=0; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }

        //continue pula quando a condição for true e volta a executar
        for(int i=0; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}
