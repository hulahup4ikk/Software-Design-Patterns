package Decorator;

public class Plate20kg extends SportsEquipmentDecorator {
    public Plate20kg(ISportsEquipment sports_equipment) {
        super(sports_equipment);
    }

    @Override
    public String getDescription() {
        return sports_equipment.getDescription() + " + 20kg plate for each side";
    }
    
    @Override
    public double getWeight() {
        return sports_equipment.getWeight() + 20.0 * 2;
    }
}
