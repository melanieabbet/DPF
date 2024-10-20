public class VeganProductFactory implements ProductFactory {
    @Override
    public Drink createDrink(String name, double price){
        return new GaseousDrink(name,price);
    }
    @Override
    public Dish createDish(String name, double price){
        return new VeganDish(name,price);
    }
}
