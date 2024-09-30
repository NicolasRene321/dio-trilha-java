package subsistema2;

public class ApiCep {
    public static ApiCep instancia = new ApiCep();

    private ApiCep() {
        super();
    }

    public static ApiCep getApiCep(){
        return instancia;
    }

    public String getEstado(String cep){
        return "SC";
    }

    public String getCidade(String cep){
        return  "Itajaí";
    }
}
