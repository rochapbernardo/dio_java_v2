package dio.gof.singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    public SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
