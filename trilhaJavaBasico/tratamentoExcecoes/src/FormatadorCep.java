public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2914686");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde as regras de negócio");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException{
        if(cep.length() !=8){
            throw new CepInvalidoException();
        }
        return "29.146-186";
    }
}
