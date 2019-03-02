package main.java.singleton;

import main.java.annotation.Magikarp;
import main.java.annotation.MagikarpInfo;

@Magikarp(author = "Okato", createDate = "2019/02")
public class Singleton implements Whoiam, MagikarpInfo {

    @Override
    public void displaySelf() {
        System.out.print("I'm " + this.getClass().getName() + ", ");
        System.out.println("which is created by " + this.getAuthor() + " at " + this.getCreateDate() + ". ");
    }

    @Override
    public String getAuthor() {
        return getInfo(Singleton.AUTHOR);
    }

    @Override
    public String getCreateDate() {
        return getInfo(Singleton.CREATE_DATE);
    }

    private final static String AUTHOR = "Author";

    private final static String CREATE_DATE = "CreateDate";

    private final static String NO_FOUND = "NoFound";

    private String getInfo(String target) {

        Class clazz = this.getClass();

        boolean hasMagikarp = clazz.isAnnotationPresent(Magikarp.class);


        String[] infos = new String[2];

        if (hasMagikarp) {
            Magikarp info = (Magikarp) clazz.getAnnotation(Magikarp.class);
            infos[0] = info.author();
            infos[1] = info.createDate();


        } else {
            target = Singleton.NO_FOUND;
        }


        switch (target) {
            case Singleton.AUTHOR:
                return infos[0];
            case Singleton.CREATE_DATE:
                return infos[1];
            case Singleton.NO_FOUND:
            default:
                return "";
        }
    }

}
