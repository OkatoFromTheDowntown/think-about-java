package main.java.service;

public class UserInfo {

    private int age;

    public void howOld() {
        System.out.println("I'm " + this.age + " years old");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
