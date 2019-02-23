package main.java.singleton;

public class Singleton implements Whoiam {

    @Override
    public void displaySelf() {
        System.out.println("I'm " + this.getClass().getName());
    }
}
