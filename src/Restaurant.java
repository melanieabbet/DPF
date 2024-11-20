import Enum.TypeDish;
import Enum.TypeDrink;
import Enum.TypeTable;
import Enum.TypeMenu;
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

////         LAB 1.1
////         Creation of some products and table to test
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
//        Menu dietMenu = new Menu("Low carbs", TypeMenu.DIET);
//        dietMenu.addProduct(drink1);
//        dietMenu.addProduct(dish1);
//        System.out.println("Our Menu : ");
//        dietMenu.displayMenu();
//
//        //LAB 1.2 - Emulate Client interaction to use product factory
//
//        //01 client & table
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter client name: ");
//        String clientName = scanner.nextLine();
//
//        System.out.print("Enter table type (DIET, VEGAN, PLEASURE): ");
//        String typeInput = scanner.nextLine().toUpperCase();
//        TypeTable tableType = TypeTable.valueOf(typeInput);
//
//        Tax TaxPrivate;
//        Table table = new Table(clientName, tableType, new TaxPrivate());
//        restaurant.addTable(table);
//
//        // 02 Products
//        ProductFactory productFactory = TableFactory.createTableType(tableType);
//        System.out.println("Adding dishes...");
//
//        while (true) {
//            System.out.print("Enter dish name (or type 'exit' to finish adding dishes): ");
//
//            String dishName = scanner.nextLine();
//            if (dishName.equalsIgnoreCase("exit")) {
//                break;
//            }
//            System.out.print("Enter dish price: ");
//            double dishPrice = Double.parseDouble(scanner.nextLine());
//
//            Product dish = productFactory.createDish(dishName, dishPrice);
//            table.addProduct(dish); // Add to table
//            restaurant.addProduct(dish); // Add to Restaurant
//        }
//        while (true) {
//            System.out.print("Enter drink name (or type 'exit' to finish adding drink): ");
//
//            String drinkName = scanner.nextLine();
//            if (drinkName.equalsIgnoreCase("exit")) {
//                break;
//            }
//            System.out.print("Enter drink price: ");
//            double drinkPrice = Double.parseDouble(scanner.nextLine());
//
//            Product drink = productFactory.createDrink(drinkName, drinkPrice);
//            table.addProduct(drink); // Add to table
//            restaurant.addProduct(drink); // Add to Restaurant
//        }
//        table.printTableOrder();
//        scanner.close();
//        restaurant.displayProducts();
//
//        //LAB 2.2 - Emulate Table state change
//        Drink drink4 = new Drink("Coke", 2.50, TypeDrink.LIGHT);
//        restaurant.addProduct(drink1);
//
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.print("Enter new reservation for client name: ");
//        String clientName2 = scanner2.nextLine();
//
//        System.out.print("Enter table type (DIET, VEGAN, PLEASURE): ");
//        String typeInput2 = scanner2.nextLine().toUpperCase();
//        TypeTable tableType2 = TypeTable.valueOf(typeInput);
//
//        //Create the table
//        Table table3 = new Table(clientName2, tableType2,new TaxPrivate());
//        table.changeState(ReservedTableState.getInstance());
//        restaurant.addTable(table);
//        System.out.print("La table est : "+ table.getState());
//        table.getState().display(table);
//        table.getState().welcoming(table);
//        table.getState().serve(table,drink1);
//        table.getState().display(table);
//        table.getState().close(table);
//        table.getState().display(table);
//
//         //LAB 3.1 Emulate extra Drink
//        Drink drink5 = new Drink("Coke", 2, TypeDrink.LIGHT);
//        System.out.println(drink5.getPrice());
//        Product drinkExtraDose = new ExtraDoseDecorator(drink5);
//        System.out.println(drinkExtraDose.getPrice());
//        Product drinkExtraDoseExtraTaste = new ExtraTasteDecorator(drinkExtraDose);
//        System.out.println(drinkExtraDoseExtraTaste.getPrice());
//
//         //LAB 3.2 Patron Builder
//        MenuBuilder menuDietBuilder = new MenuDietBuilder("Menu light");
//        MenuDirector directorClassic = new MenuClassicDirector(menuDietBuilder);
//        Menu dietMenu2 = directorClassic.constructMenu();
//        dietMenu2.displayMenu();
//
//        MenuBuilder menuPleasureBuilder = new MenuPleasureBuilder("Menu party");
//        MenuDirector directorPremium = new MenuPremiumDirector(menuPleasureBuilder);
//        Menu richMenu = directorPremium.constructMenu();
//        richMenu.displayMenu();

         //LAB 4.1 Bridge
//        Table privateTable = new Table("Client Privé", TypeTable.PLEASURE, new TaxPrivate());
//        privateTable.addProduct(new RichDish("Soup", 15.0));
//        privateTable.addProduct(new AlcoolDrink("Beer", 5.0));
//        System.out.println(privateTable.calculateTax());
//        Table companyTable = new Table("Client Privé", TypeTable.PLEASURE, new TaxCompany());
//        companyTable.addProduct(new RichDish("Soup", 15.0));
//        companyTable.addProduct(new AlcoolDrink("Beer", 5.0));
//        System.out.println(companyTable.calculateTax());

        //LAB 4.2 Observer
//        Income income = Income.getInstance();
//        Table dateTable = new Table("Client Privé", TypeTable.PLEASURE, new TaxPrivate());
//        dateTable.addListener(income);
//
//        dateTable.getState().welcoming(dateTable);
//        dateTable.getState().serve(dateTable,new RichDish("Salad Deluxe", 8.0));
//        dateTable.getState().serve(dateTable, new AlcoolDrink("Mojito", 3.0));
//        income.displayIncome();
//        dateTable.getState().close(dateTable);
//        income.displayIncome();

        //LAB 5.1 Iterator
//        Income income = Income.getInstance();
//        Table exFiveOneTable = new Table("Client Privé", TypeTable.PLEASURE, new TaxPrivate());
//        Table exFiveTwoTable = new Table("Client Privé", TypeTable.DIET, new TaxPrivate());
//        Table exFiveThreeTable = new Table("Client Privé", TypeTable.PLEASURE, new TaxPrivate());
//        exFiveOneTable.addListener(income);
//        exFiveTwoTable.addListener(income);
//        exFiveThreeTable.addListener(income);
//
//        exFiveOneTable.getState().welcoming(exFiveOneTable);
//        exFiveOneTable.getState().serve(exFiveOneTable,new RichDish("Salad Deluxe", 8.0));
//        exFiveOneTable.getState().serve(exFiveOneTable, new AlcoolDrink("Mojito Deluxe", 3.0));
//        exFiveOneTable.getState().serve(exFiveOneTable, new AlcoolDrink("Mojito Light", 3.0));
//        exFiveOneTable.getState().close(exFiveOneTable);
//
//        exFiveTwoTable.getState().welcoming(exFiveTwoTable);
//        exFiveTwoTable.getState().serve(exFiveTwoTable, new DietDish("Salad", 12.0));
//        exFiveTwoTable.getState().serve(exFiveTwoTable, new LightDrink("Virgin Mojito", 3.0));
//        exFiveTwoTable.getState().serve(exFiveTwoTable, new LightDrink("Water", 2.0));
//        exFiveTwoTable.getState().close(exFiveTwoTable);
//
//        exFiveThreeTable.getState().welcoming(exFiveThreeTable);
//        exFiveThreeTable.getState().serve(exFiveThreeTable,new RichDish("Salad Deluxe", 8.0));
//        exFiveThreeTable.getState().serve(exFiveThreeTable, new AlcoolDrink("Mojito Deluxe", 5.0));
//        exFiveThreeTable.getState().serve(exFiveThreeTable, new AlcoolDrink("Mojito", 3.0));
//        exFiveThreeTable.getState().close(exFiveThreeTable);
//
//        CustomIterator<Table> iteratorOne = income.getTableAboveNumberIncomeIterator(15); //should be 33
//        CustomIterator<Table> iteratorTwo = income.getTableTypeIncomeIterator(TypeTable.DIET); //should be 17
//
//        System.out.println(income.getIncome(iteratorOne));
//        System.out.println(income.getIncome(iteratorTwo));

        // LAB 5.2
        Statistics statistics = Statistics.getInstance();

        Drink drink01Lab5 = new AlcoolDrink("Mojito Deluxe", 5.0);
        statistics.addProductToStatistic(drink01Lab5);
        Drink drink02Lab5 = new LightDrink("Mojito Virgin", 3.0);
        statistics.addProductToStatistic(drink02Lab5);
        Drink drink03Lab5 = new AlcoolDrink("Mojito", 4.0);
        statistics.addProductToStatistic(drink03Lab5);
        Drink drink04Lab5 = new GaseousDrink("Coke", 3.0);
        statistics.addProductToStatistic(drink04Lab5);
        Dish dish01Lab5 = new RichDish("Salad Deluxe", 8.0);
        statistics.addProductToStatistic(dish01Lab5);
        Dish dish02Lab5 = new DietDish("Salad", 6.0);
        statistics.addProductToStatistic(dish02Lab5);
        Dish dish03Lab5 = new VeganDish("Soup", 4.0);
        statistics.addProductToStatistic(dish03Lab5);

        statistics.exportProducts("products.csv");
        System.out.println("Exportation des produits terminée !");
    }

}
