package Second_Half.Strategy.app;

import Second_Half.Strategy.context.TrainingContext;
import Second_Half.Strategy.strategy.*;

import javax.smartcardio.Card;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainingContext context = new TrainingContext();

        System.out.println("Select your training type:");
        System.out.println("1 - Cardio");
        System.out.println("2 - Strength");
        System.out.println("3 - Stretching");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        ITrainingStrategy strategy;
        ITrainingStrategy CardioTrainingStrategy = new CardioTraining();
        ITrainingStrategy StrengthTrainingStrategy = new StrengthTraining();
        ITrainingStrategy StretchingTrainingStrategy = new StretchingTraining();

        switch (choice) {
            case 1 -> strategy = CardioTrainingStrategy;
            case 2 -> strategy = StrengthTrainingStrategy;
            case 3 -> strategy = StretchingTrainingStrategy;
            default -> {
                System.out.println("Invalid choice! Defaulting to cardio.");
                strategy = CardioTrainingStrategy;
            }
        }

        context.setStrategy(strategy);

        System.out.println("\n--- Starting Training Session ---");
        context.executeTraining();

        System.out.println("\nCurrent exercises: ");
        System.out.println(context.getStrategyDescription());

        scanner.close();
    }
}
