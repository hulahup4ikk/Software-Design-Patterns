package Decorator;

public abstract class SportsEquipmentDecorator implements ISportsEquipment {
    protected ISportsEquipment sports_equipment;

    public SportsEquipmentDecorator(ISportsEquipment sports_equipment) {
        this.sports_equipment = sports_equipment;
    }

    @Override
    public String getDescription() {
        return sports_equipment.getDescription();
    }

    @Override
    public double getWeight() {
        return sports_equipment.getWeight();
    }
}
