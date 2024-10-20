import java.util.ArrayList;
import java.util.List;

public class Menu extends Product {
    private final List<Product> products;

    public Menu(String name){
        super(name);
        this.products = new ArrayList<>();
    }
    @Override
    public String getType() {
        return null;
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

}
