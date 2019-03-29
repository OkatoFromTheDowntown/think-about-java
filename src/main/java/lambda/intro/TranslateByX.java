package main.java.lambda.intro;

import java.awt.*;

public class TranslateByX implements Translate {

    private int x;

    public TranslateByX(int x) {
        this.x = x;
    }

    @Override
    public void translate(Point p) {
        p.translate(this.x, 0);
    }
}
