package main.java.mod;

public enum MODE_ENUM {
    /* */
    R(1 << 2, "READABLE"),
    W(1 << 1, "WRITABLE"),
    X(1, "EXECUTABLE");

    public final int mod;
    public final String permission;

    MODE_ENUM(int i, String s) {
        this.mod = i;
        this.permission = s;
    }

    public static int addMod(int mode, MODE_ENUM addMode) {
        return mode | addMode.mod;
    }

    public static int rmMod(int mode, MODE_ENUM rmMode) {
        return mode & ~rmMode.mod;
    }

    public static boolean hasMod(int mode, MODE_ENUM hasMode) {
        return (mode & hasMode.mod) > 0;
    }
}
