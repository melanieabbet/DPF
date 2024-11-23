import java.io.FileWriter;
import java.io.IOException;

public class CSVExporter implements Visitor {
    private final String filePath;

    public CSVExporter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void visitProduct(Product product) {
        product.exportCSV(this.filePath);
    }

//    private void exportLine(String name, double price, String type) {
//        try (FileWriter writer = new FileWriter(filePath, true)) {
//            writer.write(String.format("%s,%f,%s%n", name, price, type));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
