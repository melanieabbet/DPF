import Enum.TypeDrink;
public class Drink extends Product{
    private final TypeDrink type;
    public Drink(String name, double price, TypeDrink type){
        super(name,price);
        this.type = type;
    }
    @Override
    public String getType() {
        return type.name();
    }
}
