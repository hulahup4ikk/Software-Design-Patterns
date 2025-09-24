package Abstract_Factory_Method.factories;

import Abstract_Factory_Method.furniture.products.Chair;
import Abstract_Factory_Method.furniture.products.Sofa;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}
