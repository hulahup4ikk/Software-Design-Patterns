package Second_Half.Strategy.context;

import Second_Half.Strategy.strategy.ITrainingStrategy;

public class TrainingContext {
    private ITrainingStrategy strategy;

    public void setStrategy(ITrainingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeTraining() {
        if (strategy == null) {
            System.out.println("No training strategy selected!");
        } else {
            strategy.train();
        }
    }

    public String getStrategyDescription() {
        return (strategy == null)
                ? "No strategy selected"
                : strategy.getDescription();
    }
}
