package main.java.singleton;

public class Singleton3 {
    /*
        Lazy Initialize: No;
        Thread Safe: Yes;
        Difficult: No;
     */

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
        System.out.println("Method: Singleton3()");
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
