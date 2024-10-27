public class ClosedTableState implements TableState{
    // singleton because the state can be shared by multiple table
    private static ClosedTableState instance = null;
    private ClosedTableState(){};
    public synchronized static ClosedTableState getInstance(){
        if(instance == null){
            instance = new ClosedTableState();
        }
        return instance;
    }
    @Override
    public void welcoming(Table table) {
        throw new IllegalStateException("Error welcoming already made");
    }
    @Override
    public void serve(Table table, Product product) {
        throw new IllegalStateException("Error table closed");
    }
    @Override
    public void display(Table table) {
       System.out.println(table.getInvoiceSum());
    }
    @Override
    public void close(Table table) {
        throw new IllegalStateException("Error table already close");
    }
}
