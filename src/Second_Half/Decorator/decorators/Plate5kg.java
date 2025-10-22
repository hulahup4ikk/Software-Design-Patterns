package Second_Half.Decorator.decorators;

import Second_Half.Decorator.core.ISportsEquipment;

public class Plate5kg extends SportsEquipmentDecorator {
    public Plate5kg(ISportsEquipment sports_equipment) {
        super(sports_equipment);
    }

    @Override
    public String getDescription() {
        return sports_equipment.getDescription() + " + 5kg plate for each side";
    }

    @Override
    public double getWeight() {
        return sports_equipment.getWeight() + 5.0 * 2;
    }
}
