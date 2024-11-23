import Enum.TypeDrink;

import java.io.FileWriter;
import java.io.IOException;

public class Drink extends Product{
    private final TypeDrink type;
    public Drink(String name, double price, TypeDrink type){
        super(name,price);
        this.type = type;
    }
    public String getType() {
        return type.name();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitProduct(this);
    }
    @Override
    public void exportCSV(String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(String.format("Drink,%s,%.2f,%s%n", getName(), getPrice(), getType()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
