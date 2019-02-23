package main.java.singleton;

public enum Singleton6 implements Whoiam {
    /*
        Lazy Initialize: No;
        Thread Safe: Yes;
        Difficult: No;
     */

    INSTANCE;

    @Override
    public void displaySelf() {
        System.out.println("I'm " + this.getClass().getName());
    }
}
