public class TaxPrivate implements Tax {
    @Override
    public double calculateTax(double amount) {
        double sum = amount*0.15;
        return sum;
    }
}
