package dio.gof.facade;

import dio.gof.facade.subsistema.cep.CepApi;
import dio.gof.facade.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
