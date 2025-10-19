package Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Barbell example:");
        ISportsEquipment barbell = new Plate5kg(
                                            new Plate10kg(
                                                new EmptyBarbell()));
        System.out.println(barbell.getDescription() + " = " + barbell.getWeight() + "kg");

        System.out.println("Dumbbell example:");
        ISportsEquipment dumbbell = new Plate5kg(new EmptyDumbbell());
        System.out.println(dumbbell.getDescription() + " = " + dumbbell.getWeight() + "kg");
    }
}
