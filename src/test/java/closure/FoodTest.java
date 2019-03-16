package test.java.closure;

import main.java.closure.Food;

public class FoodTest {
    public static void main(String[] args) {
        Food food = new Food();
        food.eat().doo();
        food.eat().doo();
        food.eat().doo();
        food.buy(2).doo();
        food.buy(3).doo();
        food.sell(7).doo();
        food.sell(2).message();
        food.sell(2).doo();
    }
}