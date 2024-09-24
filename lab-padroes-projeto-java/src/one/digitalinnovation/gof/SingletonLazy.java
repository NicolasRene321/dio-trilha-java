package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso"
 *
 * @author Nicolas
 * **/
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super(); // super() não é obrigatório - super() = chamada explícita
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
