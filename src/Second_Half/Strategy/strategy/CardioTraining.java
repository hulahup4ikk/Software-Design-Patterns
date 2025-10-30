package Second_Half.Strategy.strategy;

public class CardioTraining implements ITrainingStrategy {
    private static final String DESCRIPTION = "running, cycling, or elliptical.";

    @Override
    public void train() {
        System.out.println("Performing cardio training: " + DESCRIPTION);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
