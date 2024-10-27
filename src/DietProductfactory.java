//concrete factory for variant "Diet"
public class DietProductfactory implements ProductFactory{
    @Override
    public Drink createDrink(String name, double price){
        return new LightDrink(name,price);
    }
    @Override
    public Dish createDish(String name, double price){
        return new DietDish(name,price);
    }
}
