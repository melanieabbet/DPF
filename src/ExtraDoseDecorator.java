public class ExtraDoseDecorator extends ProductDecorator {
    public ExtraDoseDecorator(Product source){
        super(source);
    }
    @Override
    public double getPrice(){
        double basePrice = super.getPrice();
        double extraPrice = basePrice * 11;
        return (double) Math.round(extraPrice) / 10; // add 10% price for extra dose
    }
}
