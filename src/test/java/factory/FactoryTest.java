package test.java.factory;

import main.java.factory.Canvas;
import main.java.factory.RedCanvas;

public class FactoryTest {
    public static void main(String... args) {
        Canvas canvas = new RedCanvas();
        canvas.drawRect("2d");
        canvas.drawRect("2d-bold");
        canvas.drawRect("3d");
    }
}
