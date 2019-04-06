package main.java.factory.simple;

@Deprecated
public class SimpleContextCreator {
    public SimpleContext getContext(String contextType) {
        switch(contextType) {
            case "3d":
                return new The3DSimpleContext();
            case "2d":
            default:
                return new The2DSimpleContext();
        }
    }
}

@Deprecated
class The2DSimpleContext extends SimpleContext {}

@Deprecated
class The3DSimpleContext extends SimpleContext {}

