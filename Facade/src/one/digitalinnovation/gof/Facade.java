package one.digitalinnovation.gof;

import subsistema1.CrmService;
import subsistema2.ApiCep;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String estado = ApiCep.getApiCep().getEstado(cep);
        String cidade = ApiCep.getApiCep().getCidade(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
