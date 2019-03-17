package main.java.closure;

@FunctionalInterface
public interface Active {

    void doo();

    default void message() {
        System.out.println("hello");
    }

}
