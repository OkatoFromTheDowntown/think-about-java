package main.java.factory;

public abstract class Canvas {

    public void drawRect(String contextType) {
        Context ctx;

        ctx = this.getContext(contextType);

        System.out.println("(function() {");
        ctx.init();
        ctx.rect();
        ctx.stroke();
        System.out.println("}) ();");
        System.out.println();
    }

    protected abstract Context getContext(String contextType);
}
