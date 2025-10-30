package Second_Half.Strategy.strategy;

public class StrengthTraining implements ITrainingStrategy {
    private static final String DESCRIPTION = "bench press, squats, deadlifts.";

    @Override
    public void train() {
        System.out.println("Performing strength training: " + DESCRIPTION);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
