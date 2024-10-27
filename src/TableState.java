// Common interface for all states.
public interface TableState {
    //Methods that are linked to the state
    void welcoming(Table table); //if reserved - change to serve else error
    //Ok to put the product to serve here?
    void serve(Table table, Product product); // if serve then add product to table stay in serve else error
    void close(Table table); // if serve you can close else not
    void display(Table table); // depends of each state
}
