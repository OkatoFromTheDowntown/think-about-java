package main.java.lambda.into;

import java.awt.*;
import java.util.ArrayList;

public class PointList extends ArrayList<Point> {

    public void forEach(Translate t) {
        for (Point p : this) {
            t.translate(p);
        }
    }

    public void printForEachPoint() {
        for (Point p : this) {
            System.out.println(p);
        }
    }
}
