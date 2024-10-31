//Decorator logic
public abstract class ProductDecorator extends Product {
private Product wrappee; // Product to which we will apply the extra (base product)
ProductDecorator(Product source){
    super(source.getName(), source.getPrice());
    this.wrappee = source;
}

}
