import java.util.List;
import Enum.TypeTable;
public class TableTypeIterator implements CustomIterator<Table>{
    private final List<Table> tables;
    private int currentPosition = 0;
    private final TypeTable typeTable;

    public TableTypeIterator (List<Table> tables, TypeTable typeTable){
        this.tables = tables;
        this.typeTable = typeTable;
    }

    @Override
    public boolean hasNext() {
        while(currentPosition < tables.size()) {
            if (tables.get(currentPosition).getType() == typeTable){
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
