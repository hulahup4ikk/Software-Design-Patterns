package First_Half.Abstract_Factory_Method;

import First_Half.Abstract_Factory_Method.factories.FurnitureFactory;
import First_Half.Abstract_Factory_Method.factories.ModernFurnitureFactory;
import First_Half.Abstract_Factory_Method.factories.VictorianFurnitureFactory;
import First_Half.Abstract_Factory_Method.furniture.products.Chair;
import First_Half.Abstract_Factory_Method.furniture.products.Sofa;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sit();
        sofa.lieOn();



        factory = new VictorianFurnitureFactory();

        chair = factory.createChair();
        sofa = factory.createSofa();

        chair.sit();
        sofa.lieOn();
    }
}
