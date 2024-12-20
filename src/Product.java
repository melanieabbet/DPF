import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    //Shared Attribute
    protected String name;
    protected double price;
    //Constructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getType(){
        return null;
    }
    public abstract void accept(Visitor visitor);

    public abstract void exportCSV(String filePath);

}
