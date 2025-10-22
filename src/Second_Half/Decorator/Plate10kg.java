package Second_Half.Decorator;

public class Plate10kg extends SportsEquipmentDecorator {
    public Plate10kg(ISportsEquipment sports_equipment) {
        super(sports_equipment);
    }

    @Override
    public String getDescription() {
        return sports_equipment.getDescription() + " + 10kg plate for each side";
    }

    @Override
    public double getWeight() {
        return sports_equipment.getWeight() + 10.0 * 2;
    }
}
