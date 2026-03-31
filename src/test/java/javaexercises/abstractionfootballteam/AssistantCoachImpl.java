package javaexercises.abstractionfootballteam;

public class AssistantCoachImpl extends Person implements AssistantCoach{
    public AssistantCoachImpl(String firstName, String lastName, int age, double height) {
        super(firstName, lastName, age, height);
    }

    @Override
    public void trainFitness() {
        System.out.println(getFirstName() + " trains the team's fitness.");
    }
}
