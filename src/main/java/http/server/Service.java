package main.java.http.server;

public class Service<T> extends BaseService<T> {

    @Override
    protected void mainExecute(T foo) {
        System.out.println("Hello, this is " + foo);
    }
}
