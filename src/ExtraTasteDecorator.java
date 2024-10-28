public class ExtraTasteDecorator extends ProductDecorator {
    public ExtraTasteDecorator(Product source){
        super(source);
    }
    @Override
    public double getPrice(){
        double basePrice = super.getPrice();
        double extraPrice = basePrice * 11.5;
        return (double) Math.round(extraPrice) / 10; //add 15% for extra taste
    }
}
