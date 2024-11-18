public class TaxCompany implements Tax {
    @Override
    public double calculateTax(double amount) {
        return TaxCompanyStatic.calculateTax(amount);
    }
}
