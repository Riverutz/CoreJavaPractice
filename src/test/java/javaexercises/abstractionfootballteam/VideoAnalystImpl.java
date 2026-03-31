package javaexercises.abstractionfootballteam;

public class VideoAnalystImpl extends Person implements VideoAnalyst {
    public VideoAnalystImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void analyzeVideo() {
        System.out.println(getFirstName() + " analyzes match video footage.");
    }
}
