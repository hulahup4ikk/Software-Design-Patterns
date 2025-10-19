package Decorator;

public class EmptyDumbbell implements ISportsEquipment {
    @Override
    public String getDescription() {
        return "Empty dumbbell";
    }

    @Override
    public double getWeight() {
        return 5.0;
    }
}
