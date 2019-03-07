package main.java.service;

public class ToLower implements ChangeLetter {

    private String letter;

    public ToLower() {
        System.out.println("LowerCase");
    }

    @Override
    public String change() {
        return letter.toLowerCase();
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
