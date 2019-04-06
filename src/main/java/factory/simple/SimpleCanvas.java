package main.java.factory.simple;

@Deprecated
public class SimpleCanvas {

    SimpleContextCreator contextCreator;

    SimpleCanvas(SimpleContextCreator contextCreator) {
        this.contextCreator = contextCreator;
    }

    public void drawRect(String contextType) {
        SimpleContext ctx;

        ctx = this.contextCreator.getContext("2d");

        ctx.rect();
        ctx.stroke();
    }

}

