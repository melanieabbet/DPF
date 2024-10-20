import Enum.TypeTable;
public class TableFactory {
    public static ProductFactory createTableType(TypeTable type){
        return switch (type){
            case DIET -> new DietProductfactory();
            case VEGAN -> new VeganProductFactory();
            case PLEASURE -> new RichProductFactory();
            default -> throw new IllegalArgumentException("Error table type unknown");
        };
    }
}
