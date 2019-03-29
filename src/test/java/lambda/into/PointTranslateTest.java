package test.java.lambda.into;


import main.java.lambda.intro.PointList;
import main.java.lambda.intro.TranslateBy;
import main.java.lambda.intro.TranslateByX;
import main.java.lambda.intro.TranslateByY;

import java.awt.*;
import java.util.ArrayList;
import java.util.function.Consumer;

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

        System.out.println("Consumer.accept");

        ArrayList<Point> pointList = points;
        pointList.forEach(new Consumer<Point>() {
            @Override
            public void accept(Point point) {
                point.translate(10, 10);
            }
        });
        pointList.forEach(point -> System.out.println(point));


    }
}
