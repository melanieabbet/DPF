import Enum.TypeDish;
import Enum.TypeDrink;
public interface ProductFactory {
    Product createDrink(String name, double price);
    Product createDish(String name, double price);
}
