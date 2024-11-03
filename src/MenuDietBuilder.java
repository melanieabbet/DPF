import Enum.TypeMenu;
public class MenuDietBuilder implements MenuBuilder {

    private final Menu menu;

    public MenuDietBuilder(String name){
        this.menu = new Menu(name, TypeMenu.DIET);
    }
    @Override
    public void setStarter() {
        menu.addProduct(new DietDish("Soup", 8.0));
    }
    @Override
    public void setMain() {
        menu.addProduct(new DietDish("Pasta", 10.0));
    }
    @Override
    public void setDessert() {
        menu.addProduct(new DietDish("Donut", 2.0));
    }
    @Override
    public void setDrink() {
        menu.addProduct(new LightDrink("Water", 1.0));
    }

    public Menu getResult(){
        return menu;
    }
}
