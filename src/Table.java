import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Enum.TypeTable;
public class Table {
    private final String client;
    private final LocalDateTime date;
    private final TypeTable type;
    private final ArrayList<Product> productList;
    private TableState tableState;
    private Tax tableTax;
    private final List<EventListener> listeners = new ArrayList<>(); // Income Observer

    public Table(String client, TypeTable type, Tax tableTax){
        this.client = client;
        this.date = LocalDateTime.now();
        this.type = type;
        this.productList = new ArrayList<>();
        this.changeState(ReservedTableState.getInstance());
        this.tableTax = tableTax;
    }

    public String getClient() {
        return client;
    }
    public TypeTable getType() {
        return type;
    }
    public String getDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return date.format(formatter);
    }
    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void printTableOrder(){
        double price = 0;
        System.out.println(client + ": " + type + "," + getDate() );
        for (Product product : productList) {
            System.out.println(product.getName()+": "+ product.getPrice()+" $");
            price += product.getPrice();
        }
        System.out.println("total :"+ price + " $" );
    }
    public final double getInvoiceSum(){
        double price = 0;
        for (Product product : productList) {
            price += product.getPrice();
        }
        return price;
    }
    public void changeState(TableState tableState){
        this.tableState = tableState;
    }
    public TableState getState(){return tableState;}
    public double calculateTax(){
        double total = getInvoiceSum();
        return tableTax.calculateTax(total); // Let the API define the appropriate calcul
    };
    public void addListener(EventListener listener){
        listeners.add(listener);
    }
    public void notifyListeners(String eventType){
        for (EventListener listener : listeners){
            listener.update(eventType, this);
        }
    }
}
