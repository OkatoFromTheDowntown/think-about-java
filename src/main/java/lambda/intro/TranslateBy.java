package main.java.lambda.intro;

import java.awt.*;

public class TranslateBy implements Translate {

    private int x;

    private  int y;

    public TranslateBy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void translate(Point p) {
        p.translate(this.x, this.y);
    }
}
