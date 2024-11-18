import java.util.ArrayList;
import java.util.List;
import Enum.TypeTable;
public final class Income implements EventListener{
    private static Income instance = null;
    private final List<Table> tables;

    @Override
    public void update(String eventType, Table table){
        if ("close".equals(eventType)) {
            addTableIncome(table);
        }
    };

    private Income(){
        this.tables = new ArrayList<>();
    }
    public synchronized static Income getInstance(){
        if(instance == null){
            instance = new Income();
        }
        return instance;
    }
    public void addTableIncome(Table table){
        tables.add(table);
    }
    public void displayIncome(){
        double amount = 0;
        for (Table table: tables){
            amount += table.getInvoiceSum();
            System.out.println(table.getClient()+" - "+ table.getDate()+" - " + table.getInvoiceSum());
        }
        System.out.println("Total Income: "+ amount+ " $");
    }

    public double getIncome(CustomIterator<Table> iterator) {
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next().getInvoiceSum();
        }
        return total;
    }
    public CustomIterator<Table> getTableAboveNumberIncomeIterator(int number){
        return new TableAboveNumberIterator(tables, number);
    }
    public CustomIterator<Table> getTableTypeIncomeIterator(TypeTable typeTable){
        return new TableTypeIterator(tables, typeTable);
    }
}
