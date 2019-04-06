package main.java.factory;

public abstract class Context {

    protected String ctx = "";

    protected abstract void setContextStyle();

    public void init() {
        System.out.println("var ctx = document.getElementById(\"myCanvas\").getContext(\"" + this.ctx + "\");");
        this.setContextStyle();
    }

    public void rect() {
        System.out.println("ctx.rect(20,20,150,100);");
    }

    public void stroke() {
        System.out.println("ctx.stroke();");
    }

}
