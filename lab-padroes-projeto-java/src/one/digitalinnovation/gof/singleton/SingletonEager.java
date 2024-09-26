package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author Nicolas
 * **/
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super(); // super() não é obrigatório - super() = chamada explícita
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
