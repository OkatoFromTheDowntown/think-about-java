package test.java.lambda.into;


import main.java.lambda.into.PointList;
import main.java.lambda.into.TranslateBy;
import main.java.lambda.into.TranslateByX;
import main.java.lambda.into.TranslateByY;

import java.awt.*;

public class PointTranslateTest {
    public static void main(String... args) {

        PointList points = new PointList() {
            {
                add(new Point(1, 2));
                add(new Point(2, 3));
                add(new Point(3, 4));
                add(new Point(4, 5));
            }
        };

        points.printForEachPoint();
        System.out.println("Translate X: 1");

        points.forEach(new TranslateByX(1));

        points.printForEachPoint();
        System.out.println("Translate Y: 2");

        points.forEach(new TranslateByY(2));

        points.printForEachPoint();
        System.out.println("Reset");

        points.forEach(new TranslateBy(-1, -2));

        points.printForEachPoint();

    }
}
