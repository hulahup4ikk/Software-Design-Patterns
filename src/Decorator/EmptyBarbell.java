package Decorator;

public class EmptyBarbell implements ISportsEquipment {
    @Override
    public String getDescription() {
        return "Empty Barbell";
    }

    @Override
    public double getWeight() {
        return 20.0;
    }
}
