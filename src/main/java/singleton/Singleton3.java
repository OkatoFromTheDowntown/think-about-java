package main.java.singleton;

public class Singleton3 extends Singleton {
    /*
        Lazy Initialize: No;
        Thread Safe: Yes;
        Difficult: No;
     */

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
        System.out.println("Constructor Method: Singleton3()");
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
