//concrete factory for variant "Rich"
public class RichProductFactory implements ProductFactory{
    @Override
    public Drink createDrink(String name, double price){
        return new AlcoolDrink(name,price);
    }
    @Override
    public Dish createDish(String name, double price){
        return new RichDish(name,price);
    }
}
