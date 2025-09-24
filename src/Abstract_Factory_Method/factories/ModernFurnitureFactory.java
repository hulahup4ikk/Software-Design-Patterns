package Abstract_Factory_Method.factories;

import Abstract_Factory_Method.furniture.products.Chair;
import Abstract_Factory_Method.furniture.products.ModernChair;
import Abstract_Factory_Method.furniture.products.ModernSofa;
import Abstract_Factory_Method.furniture.products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
