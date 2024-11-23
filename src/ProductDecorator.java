import java.io.FileWriter;
import java.io.IOException;

//Decorator logic
public abstract class ProductDecorator extends Product {
private Product wrappee; // Product to which we will apply the extra (base product)
ProductDecorator(Product source){
    super(source.getName(), source.getPrice());
    this.wrappee = source;
}
    @Override
    public void accept(Visitor visitor) {
        // Délègue le traitement au produit sous-jacent
        wrappee.accept(visitor);
    }
    @Override
    public void exportCSV(String filePath) {
        wrappee.exportCSV(filePath);
    }
}
