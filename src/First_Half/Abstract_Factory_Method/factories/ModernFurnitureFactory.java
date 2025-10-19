package First_Half.Abstract_Factory_Method.factories;

import First_Half.Abstract_Factory_Method.furniture.products.Chair;
import First_Half.Abstract_Factory_Method.furniture.products.ModernChair;
import First_Half.Abstract_Factory_Method.furniture.products.ModernSofa;
import First_Half.Abstract_Factory_Method.furniture.products.Sofa;

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
