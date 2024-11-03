import java.util.ArrayList;
import java.util.List;

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
    public void getIncome(){
        double amount = 0;
        for (Table table: tables){
            amount += table.getInvoiceSum();
            System.out.println(table.getClient()+" - "+ table.getDate()+" - " + table.getInvoiceSum());
        }
        System.out.println("Total Income: "+ amount+ " $");
    }
}
