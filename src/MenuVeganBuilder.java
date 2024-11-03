import Enum.TypeMenu;

public class MenuVeganBuilder implements MenuBuilder {

    private final Menu menu;

    public MenuVeganBuilder(String name){
        this.menu = new Menu(name, TypeMenu.VEGAN);
    }
    @Override
    public void setStarter() {
        menu.addProduct(new VeganDish("Salat", 7.0));
    }
    @Override
    public void setMain() {
        menu.addProduct(new VeganDish("Tofu", 12.0));
    }
    @Override
    public void setDessert() {
        menu.addProduct(new VeganDish("Fruits", 2.0));
    }
    @Override
    public void setDrink() {
        menu.addProduct(new GaseousDrink("Coke", 2.0));
    }

    public Menu getResult(){
        return menu;
    }
}
