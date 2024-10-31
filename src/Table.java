import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import Enum.TypeTable;
public class Table {
    private final String client;
    private final LocalDateTime date;
    private final TypeTable type;
    private final ArrayList<Product> productList;
    private TableState tableState;

    public Table(String client, TypeTable type){
        this.client = client;
        this.date = LocalDateTime.now();
        this.type = type;
        this.productList = new ArrayList<>();
        //ajout état par défaut
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
}
