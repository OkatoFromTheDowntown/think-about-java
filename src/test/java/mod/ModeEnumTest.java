package test.java.mod;

import main.java.mod.MODE_ENUM;

public class ModeEnumTest {
    public static void main(String... args) {
        int mode = 0;
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.R));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.W));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.X));
        System.out.println("---" + mode);

        mode = MODE_ENUM.addMod(mode, MODE_ENUM.R);
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.R));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.W));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.X));
        System.out.println("---" + mode);

        mode = MODE_ENUM.addMod(mode, MODE_ENUM.W);
        mode = MODE_ENUM.addMod(mode, MODE_ENUM.X);
        mode = MODE_ENUM.rmMod(mode, MODE_ENUM.R);
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.R));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.W));
        System.out.println(MODE_ENUM.hasMod(mode, MODE_ENUM.X));
        System.out.println("---" + mode);

    }
}
