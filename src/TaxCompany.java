public class TaxCompany implements Tax {
    @Override
    public double calculateTax(double amount) {
        double sum = amount*0.25;
        return sum;
    }
}
