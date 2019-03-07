package main.java.service;

public class ToUpper implements ChangeLetter {

    private String letter;

    public ToUpper() {
        System.out.println("UpperCase");
    }

    @Override
    public String change() {
        return letter.toUpperCase();
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
