public class ServedTableState implements TableState {
    // singleton because the state can be shared by multiple table
    private static ServedTableState instance = null;
    private ServedTableState(){};
    public synchronized static ServedTableState getInstance(){
        if(instance == null){
            instance = new ServedTableState();
        }
        return instance;
    }
    @Override
    public void welcoming(Table table) {
        throw new IllegalStateException("Error welcoming already made");
    }
    @Override
    public void serve(Table table, Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Error: Product cannot be null");
        }
        table.addProduct(product);
        System.out.println("Product added to table: " + product.getName() + " at " + product.getPrice() + " $");
    }
    @Override
    public void display(Table table) {
        System.out.println("There your total check:");
        table.printTableOrder();
    }
    @Override
    public void close(Table table) {
        System.out.println("Thank you for the visit you paid: " + table.getInvoiceSum());
        //Add table bill to income
        Income income = Income.getInstance();
        income.addTableIncome(table);
        table.changeState(ClosedTableState.getInstance());
    }
}
