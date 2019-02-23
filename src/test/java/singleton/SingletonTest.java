package test.java.singleton;

import main.java.singleton.*;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton1 singletonError = new Singleton1();
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();

        Singleton4 singleton4 = Singleton4.getInstance();

        Singleton5 singleton5 = Singleton5.getInstance();

        Singleton6 singleton6 = Singleton6.INSTANCE;

        singleton1.displaySelf();
        singleton2.displaySelf();
        singleton3.displaySelf();
        singleton4.displaySelf();
        singleton5.displaySelf();
        singleton6.displaySelf();

    }
}
