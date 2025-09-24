package Abstract_Factory_Method.factories;

import Abstract_Factory_Method.furniture.products.Chair;
import Abstract_Factory_Method.furniture.products.Sofa;
import Abstract_Factory_Method.furniture.products.VictorianChair;
import Abstract_Factory_Method.furniture.products.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
