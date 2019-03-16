package main.java.closure;

public class Food {

    public static final String name = "Food";

    private static int num = 20;

    public Food() {
        System.out.println("Delicious");
    }

    private class Eat implements Active {
        @Override
        public void doo() {
            if (0 >= num) {
                System.out.println("No more Food");
            } else {
                num--;
                System.out.println("Oishi");
                Food.this.currentNumber();
            }
        }
    }

    private void currentNumber() {
        System.out.println("Current: " + num);
    }

    public Active eat() {
        return new Eat();
    }

    public Active sell(int i) {
        return new Active() {
            @Override
            public void doo() {
                num += i;
                System.out.println("Thank you");
                Food.this.currentNumber();
            }

            @Override
            public void message() {
                System.out.println("Getting for " + i + " isn't it");
            }
        };
    }

    public Active buy(int i) {
        return () -> {
            num -= i;
            System.out.println("Here it is");
            Food.this.currentNumber();
        };
    }
}