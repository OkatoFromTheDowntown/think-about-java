package main.java.singleton;

public class Singleton5 extends Singleton {
    /*
        Lazy Initialize: Yes;
        Thread Safe: Yes;
        Difficult: No;
     */

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
        System.out.println("Constructor Method: Singleton5()");
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
