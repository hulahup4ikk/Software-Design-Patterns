package First_Half.Abstract_Factory_Method.factories;

import First_Half.Abstract_Factory_Method.furniture.products.Chair;
import First_Half.Abstract_Factory_Method.furniture.products.Sofa;
import First_Half.Abstract_Factory_Method.furniture.products.VictorianChair;
import First_Half.Abstract_Factory_Method.furniture.products.VictorianSofa;

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
