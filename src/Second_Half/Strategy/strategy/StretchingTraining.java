package Second_Half.Strategy.strategy;

public class StretchingTraining implements ITrainingStrategy {
    private static final String DESCRIPTION = "yoga, flexibility, breathing exercises.";

    @Override
    public void train() {
        System.out.println("Performing stretching: " + DESCRIPTION);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
