import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import Enum.TypeMenu;

public class Menu extends Product {
    private final List<Product> products;
    private final TypeMenu type;

    public Menu(String name, TypeMenu type){
        super(name);
        this.products = new ArrayList<>();
        this.type = type;
    }
    public void addProduct(Product product) {
        products.add(product);
    }
     @Override
     public double getPrice(){
        double price = 0;
        for (Product product : products){
            price += product.getPrice();
        }
        return price;
     }
    public void displayMenu() {
        System.out.println(getName()+": "+ getPrice()+" $");
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
            writer.write(String.format("Menu,%s,%.2f,%s%n", getName(), getPrice(), getType()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}