package main.java.singleton;

public class Singleton1 extends Singleton {
    /*
        Lazy Initialize: Yes;
        Thread Safe: No;
        Difficult: No;
     */

    private static Singleton1 instance;

    private Singleton1() {
        System.out.println("Constructor Method: Singleton1()");
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

}
