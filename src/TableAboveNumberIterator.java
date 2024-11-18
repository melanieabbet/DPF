import java.util.List;

public class TableAboveNumberIterator implements CustomIterator<Table>{
    private final List<Table> tables;
    private int currentPosition = 0;
    private final int number;
    public TableAboveNumberIterator(List<Table> tables, int number){
        this.tables = tables;
        this.number = number;
    }
    @Override
    public boolean hasNext() {
        while (currentPosition < tables.size()){
            if (tables.get(currentPosition).getInvoiceSum()>number){
                return true;
            }
            currentPosition++;
        }
        return false;
    }

    @Override
    public Table next() {
        if (!hasNext()) {
            throw new IllegalStateException("No more elements.");
        }
        return tables.get(currentPosition++);
    }
}
