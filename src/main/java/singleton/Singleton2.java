package main.java.singleton;

public class Singleton2 {
    /*
        Lazy Initialize: Yes;
        Thread Safe: Yes;
        Difficult: No;
     */

    private static Singleton2 instance;

    private Singleton2() {
        System.out.println("Method: Singleton2()");
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

}
