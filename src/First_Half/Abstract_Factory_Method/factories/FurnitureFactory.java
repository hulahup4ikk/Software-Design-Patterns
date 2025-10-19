package First_Half.Abstract_Factory_Method.factories;

import First_Half.Abstract_Factory_Method.furniture.products.Chair;
import First_Half.Abstract_Factory_Method.furniture.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
