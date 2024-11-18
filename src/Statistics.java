import java.util.ArrayList;
import java.util.List;
public class Statistics {
    private static Statistics instance = null; // For singleton
    private final List<Product> products;

    //Singleton
    private Statistics(){this.products = new ArrayList<>();}

    public synchronized static Statistics getInstance(){
        if(instance == null){
            instance = new Statistics();
        }
        return instance;
    }

    //Add product to list (When a new product is created)
    public void addProductToStatistic(Product product){
        products.add(product);
    }

}
