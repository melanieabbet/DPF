import Enum.TypeDish;
public class Dish extends Product {
    private final TypeDish type;
    public Dish(String name, double price, TypeDish type){
        super(name,price);
        this.type = type;
    }
    @Override
    public String getType(){
        return type.name();
    }
}


