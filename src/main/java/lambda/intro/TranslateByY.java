package main.java.lambda.intro;

import java.awt.*;

public class TranslateByY implements Translate {

    private int y;

    public TranslateByY(int y) {
        this.y = y;
    }

    @Override
    public void translate(Point p) {
        p.translate(0, this.y);
    }
}
