package dio.gof.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
