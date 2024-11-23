import Enum.TypeDish;

import java.io.FileWriter;
import java.io.IOException;

public class Dish extends Product {
    private final TypeDish type;
    public Dish(String name, double price, TypeDish type){
        super(name,price);
        this.type = type;
    }
    public String getType(){
        return type.name();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitProduct(this);
    }
    @Override
    public void exportCSV(String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(String.format("Dish,%s,%.2f,%s%n", getName(), getPrice(), getType()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


