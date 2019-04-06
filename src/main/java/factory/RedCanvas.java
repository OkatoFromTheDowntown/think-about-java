package main.java.factory;

public class RedCanvas extends Canvas {

    @Override
    public Context getContext(String contextType) {
        switch (contextType) {
            case "2d":
                return new TheRed2DContext(new The2DContext());
            case "2d-bold":
                return new TheRed2DContext(new TheBold2DContext(new The2DContext()));
            case "3d":
                return new TheRed3DContext(new The3DContext());
            default:
                return null;
        }
    }
}

class TheBold2DContext extends The2DContext {
    Context context;

    public TheBold2DContext(Context context) {
        this.context = context;
    }

    @Override
    public void setContextStyle() {
        this.context.setContextStyle();
        System.out.println("ctx.lineWidth=10;");
    }
}

class TheRed2DContext extends The2DContext {

    Context context;

    public TheRed2DContext(Context context) {
        this.context = context;
    }

    @Override
    public void setContextStyle() {
        this.context.setContextStyle();
        System.out.println("ctx.strokeStyle=\"#ff0000\";");
    }
}

class TheRed3DContext extends The3DContext {
    Context context;

    public TheRed3DContext(Context context) {
        this.context = context;
    }

    @Override
    public void setContextStyle() {
        this.context.setContextStyle();
        System.out.println("ctx.strokeStyle=\"#ff0000\";");
    }
}
