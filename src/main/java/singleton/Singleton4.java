package main.java.singleton;

public class Singleton4 extends Singleton {
    /*
        Lazy Initialize: Yes;
        Thread Safe: Yes;
        Difficult: Yes;
     */

    private volatile static Singleton4 instance;

    private Singleton4() {
        System.out.println("Constructor Method: Singleton4()");
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
