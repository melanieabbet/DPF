public final class ReservedTableState implements TableState {

// singleton because the state can be shared by multiple table
private static ReservedTableState instance = null;

private ReservedTableState(){};
public synchronized static ReservedTableState getInstance(){
    if(instance == null){
        instance = new ReservedTableState();
    }
    return instance;
}

    @Override
    public void welcoming(Table table) {
        System.out.println("Welcome");
        table.changeState(ServedTableState.getInstance());
    }
    @Override
    public void serve(Table table, Product product) {
        throw new IllegalStateException("Error not ready to be served yet");
    }
    @Override
    public void display(Table table) {
        System.out.println("This stable is reserved");
    }
    @Override
    public void close(Table table) {
        throw new IllegalStateException("Error not ready to be closed yet");
    }
}
