import Enum.TypeDish;
import Enum.TypeDrink;
import Enum.TypeTable;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    private ArrayList<Product> products;
    private ArrayList<Table> tables;

    public Restaurant(){
        this.products = new ArrayList<>();
        this.tables = new ArrayList<>();

    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void addTable(Table table) {
        tables.add(table);
    }
    public void displayProducts() {
        System.out.println("All products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " : " + product.getPrice() + " $");
        }
    }
    public void displayTables() {
        System.out.println("All tables:");
        for (Table table : tables) {
            System.out.println("Table for : " + table.getClient() + ", Type : " + table.getType());
        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // LAB 1.1
        // Creation of some products and table to test
//        Drink drink1 = new Drink("Coke", 2.50, TypeDrink.LIGHT);
//        Drink drink2 = new Drink("Tea", 1.80, TypeDrink.ALCOHOLIC);
//        Drink drink3 = new Drink("Beer", 4.00, TypeDrink.ALCOHOLIC);
//        Dish dish1 = new Dish("Salad", 8.50, TypeDish.DIET);
//        Dish dish2 = new Dish("Steak", 15.00, TypeDish.RICH);
//        Dish dish3 = new Dish("Tarte Tatin", 6.00, TypeDish.RICH);
//
//
//        restaurant.addProduct(drink1);
//        restaurant.addProduct(drink2);
//        restaurant.addProduct(drink3);
//        restaurant.addProduct(dish1);
//        restaurant.addProduct(dish2);
//        restaurant.addProduct(dish3);
//
//        restaurant.displayProducts();
//
//        Menu dietMenu = new Menu("Low carbs");
//        dietMenu.addProduct(drink1);
//        dietMenu.addProduct(dish1);
//        System.out.println("Our Menu : ");
//        dietMenu.displayMenu();

        //LAB 1.2 - Emulate Client interaction to use product factory

        //01 client & table
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter client name: ");
        String clientName = scanner.nextLine();

        System.out.print("Enter table type (DIET, VEGAN, PLEASURE): ");
        String typeInput = scanner.nextLine().toUpperCase();
        TypeTable tableType = TypeTable.valueOf(typeInput);

        Table table = new Table(clientName, tableType);
        restaurant.addTable(table);

        // 02 Products
        ProductFactory productFactory = TableFactory.createTableType(tableType);
        System.out.println("Adding dishes...");

        while (true) {
            System.out.print("Enter dish name (or type 'exit' to finish adding dishes): ");

            String dishName = scanner.nextLine();
            if (dishName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter dish price: ");
            double dishPrice = Double.parseDouble(scanner.nextLine());

            Product dish = productFactory.createDish(dishName, dishPrice);
            table.addProduct(dish); // Add to table
            restaurant.addProduct(dish); // Add to Restaurant
        }
        while (true) {
            System.out.print("Enter drink name (or type 'exit' to finish adding drink): ");

            String drinkName = scanner.nextLine();
            if (drinkName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter drink price: ");
            double drinkPrice = Double.parseDouble(scanner.nextLine());

            Product drink = productFactory.createDrink(drinkName, drinkPrice);
            table.addProduct(drink); // Add to table
            restaurant.addProduct(drink); // Add to Restaurant
        }
        table.printTableOrder();
        scanner.close();
        restaurant.displayProducts();
    }

}
