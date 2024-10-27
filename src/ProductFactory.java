import Enum.TypeDish;
import Enum.TypeDrink;
//abstract factory
public interface ProductFactory {
    //Declaration of the creation methods
    // One for each abstract product (who exist in different variant)
    Product createDrink(String name, double price);
    Product createDish(String name, double price);
}
