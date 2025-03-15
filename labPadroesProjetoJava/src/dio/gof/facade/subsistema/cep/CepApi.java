package dio.gof.facade.subsistema.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Cariacica";
    }

    public String recuperarEstado(String cep){
        return "ES";
    }
}
