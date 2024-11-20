import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter implements Visitor {
    private final String filePath;

    public CSVExporter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void visitDish(Dish dish) {
        exportLine(dish.getName(), dish.getPrice(), dish.getType());
    }

    @Override
    public void visitDrink(Drink drink) {
        exportLine(drink.getName(), drink.getPrice(), drink.getType());
    }

    @Override
    public void visitMenu(Menu menu) {
        exportLine(menu.getName(), menu.getPrice(), menu.getType());
    }

    private void exportLine(String name, double price, String type) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(String.format("%s,%f,%s%n", name, price, type));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
