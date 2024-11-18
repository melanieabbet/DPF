public class TaxPrivate implements Tax {
    @Override
    public double calculateTax(double amount) {
        return TaxPrivateStatic.calculateTax(amount);
    }
}
