package test.java.singleton;

import main.java.singleton.Singleton1;
import main.java.singleton.Singleton2;
import main.java.singleton.Singleton3;

public class SingletonTest {
    public static void main(String[] args) {
//        Singleton1 singletonError = new Singleton1();
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();

        Singleton3 singleton3 = Singleton3.getInstance();


    }
}
