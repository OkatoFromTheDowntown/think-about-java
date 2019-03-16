package main.java.closure;

public interface Active {
    void doo();
    default void message() {
        System.out.println("hello");
    }
}
